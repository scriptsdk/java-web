package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.assets.TileModelDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.TargetService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{id}/target")
public class TargetController {
    final ClientService clientService;
    final TargetService targetService;

    public TargetController(ClientService clientService, TargetService targetService) {
        this.clientService = clientService;
        this.targetService = targetService;
    }

    @GetMapping(path = "target-id", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns last targeted id", tags = {"target"})
    public @ResponseBody Long getTargetID(@PathVariable String id) {
        return targetService.getTargetID(clientService.getClient(id));
    }

    @PostMapping(path = "cancel-target")
    @Operation(summary = "Cancels an existing target cursor", tags = {"target"})
    public void cancelTarget(@PathVariable String id) {
        targetService.isTargetPresent(clientService.getClient(id));
    }

    @PostMapping(path = "target-to-object", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Targets an object, if target cursor is present", tags = {"target"})
    public void targetToObject(@PathVariable String id, @RequestBody Long objectId) {
        targetService.targetToObject(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "target-to-xyz", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Targets a position, if target cursor is present", tags = {"target"})
    public void targetToXYZ(@PathVariable String id, @RequestBody Point3DDto point) {
        targetService.targetToXYZ(clientService.getClient(id), point);
    }

    @PostMapping(path = "target-to-tile", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Targets a tile, if target cursor is present", tags = {"target"})
    public void targetToTile(@PathVariable String id, @RequestBody TileModelDto model) {
        targetService.targetToTile(clientService.getClient(id), model);
    }

    @PostMapping(path = "wait-target-object", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Wait until a target cursor appear and targets an object by id", tags = {"target"})
    public void waitTargetObject(@PathVariable String id, @RequestBody Long objectId) {
        targetService.waitTargetObject(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "wait-target-tile", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits until a target cursor appear and targets a map tile", tags = {"target"})
    public void waitTargetTile(@PathVariable String id, @RequestBody TileModelDto model) {
        targetService.waitTargetTile(clientService.getClient(id), model);
    }

    @PostMapping(path = "wait-target-xyz", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits until a target cursor appear and targets a map position", tags = {"target"})
    public void waitTargetXYZ(@PathVariable String id, @RequestBody Point3DDto point) {
        targetService.waitTargetXYZ(clientService.getClient(id), point);
    }

    @PostMapping(path = "wait-target-self")
    @Operation(summary = "Waits until a target cursor appear and targets player", tags = {"target"})
    public void waitTargetSelf(@PathVariable String id) {
        targetService.isTargetPresent(clientService.getClient(id));
    }

    @PostMapping(path = "wait-target-type", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits until a target cursor appear and targets an object by type", tags = {"target"})
    public void waitTargetType(@PathVariable String id, @RequestBody Integer objectType) {
        targetService.waitTargetType(clientService.getClient(id), objectType);
    }

    @PostMapping(path = "cancel-wait-target")
    @Operation(summary = "Cancels a target wait automation", tags = {"target"})
    public void cancelWaitTarget(@PathVariable String id) {
        targetService.cancelWaitTarget(clientService.getClient(id));
    }

    @PostMapping(path = "wait-target-ground", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits until a target cursor appear and targets object on ground by type", tags = {"target"})
    public void waitTargetGround(@PathVariable String id, @RequestBody Integer objectType) {
        targetService.waitTargetGround(clientService.getClient(id), objectType);
    }

    @PostMapping(path = "wait-target-last")
    @Operation(summary = "Waits until a target cursor appear and target last id", tags = {"target"})
    public void waitTargetLast(@PathVariable String id) {
        targetService.waitTargetLast(clientService.getClient(id));
    }

    @GetMapping(path = "target-hook-enabled", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"target"})
    public @ResponseBody Boolean isTargetHookIsEnabled(@PathVariable String id) {
        return targetService.isTargetHookIsEnabled(clientService.getClient(id));
    }

    @GetMapping(path = "target-present", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if a target cursor is visible", tags = {"target"})
    public @ResponseBody Boolean isTargetPresent(@PathVariable String id) {
        return targetService.isTargetPresent(clientService.getClient(id));
    }
}
