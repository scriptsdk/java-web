package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.Assets.TileModelDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.TargetService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/{id}/target")
public class TargetController {
    final ClientService clientService;
    final TargetService targetService;

    public TargetController(ClientService clientService, TargetService targetService) {
        this.clientService = clientService;
        this.targetService = targetService;
    }

    @GetMapping(path = "/targetid", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getTargetID(@PathVariable String id) {
        return targetService.getTargetID(clientService.getClient(id));
    }

    @PostMapping(path = "/canceltarget", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void cancelTarget(@PathVariable String id) {
        targetService.isTargetPresent(clientService.getClient(id));
    }

    @PostMapping(path = "/targettoobject", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void targetToObject(@PathVariable String id, Long objectId) {
        targetService.targetToObject(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "/targettoxyz", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void targetToXYZ(@PathVariable String id, Point3DDto point) {
        targetService.targetToXYZ(clientService.getClient(id), point);
    }

    @PostMapping(path = "/targettotile", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void targetToTile(@PathVariable String id, TileModelDto model) {
        targetService.targetToTile(clientService.getClient(id), model);
    }

    @PostMapping(path = "/waittargetobject", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetObject(@PathVariable String id, Long objectId) {
        targetService.waitTargetObject(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "/waittargettile", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetTile(@PathVariable String id, TileModelDto model) {
        targetService.waitTargetTile(clientService.getClient(id), model);
    }

    @PostMapping(path = "/waittargetxyz", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetXYZ(@PathVariable String id, Point3DDto point) {
        targetService.waitTargetXYZ(clientService.getClient(id), point);
    }

    @PostMapping(path = "/waittargetself", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetSelf(@PathVariable String id) {
        targetService.isTargetPresent(clientService.getClient(id));
    }

    @PostMapping(path = "/waittargettype", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetType(@PathVariable String id, Integer objectType) {
        targetService.waitTargetType(clientService.getClient(id), objectType);
    }

    @PostMapping(path = "/cancelwaittarget", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void cancelWaitTarget(@PathVariable String id) {
        targetService.cancelWaitTarget(clientService.getClient(id));
    }

    @PostMapping(path = "/waittargetground", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetGround(@PathVariable String id, Integer objectType) {
        targetService.waitTargetGround(clientService.getClient(id), objectType);
    }

    @GetMapping(path = "/waittargetlast", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitTargetLast(@PathVariable String id) {
        targetService.waitTargetLast(clientService.getClient(id));
    }

    @GetMapping(path = "/targethookenabled", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isTargetHookIsEnabled(@PathVariable String id) {
        return targetService.isTargetHookIsEnabled(clientService.getClient(id));
    }

    @GetMapping(path = "/targetpresent", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isTargetPresent(@PathVariable String id) {
        return targetService.isTargetPresent(clientService.getClient(id));
    }
}
