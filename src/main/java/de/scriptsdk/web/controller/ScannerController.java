package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.scanner.FindNotorietyDto;
import de.scriptsdk.web.dto.scanner.FindTypeDto;
import de.scriptsdk.web.dto.scanner.FindTypesDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ScannerService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/scanner")
public class ScannerController {
    final ClientService clientService;
    final ScannerService scannerService;

    public ScannerController(ClientService clientService, ScannerService scannerService) {
        this.clientService = clientService;
        this.scannerService = scannerService;
    }

    @PostMapping(path = "/find/type", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long findType(@PathVariable String id, FindTypeDto findTypeDto) {
        return scannerService.findType(clientService.getClient(id), findTypeDto);
    }

    @PostMapping(path = "/find/notoriety", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long findNotoriety(@PathVariable String id, FindNotorietyDto findNotorietyDto) {
        return scannerService.findNotoriety(clientService.getClient(id), findNotorietyDto);
    }

    @PostMapping(path = "/find/coordination", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long findAtCoordination(@PathVariable String id, Point2DDto point2DDto) {
        return scannerService.findAtCoordination(clientService.getClient(id), point2DDto);
    }

    @PostMapping(path = "/ignore", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void ignore(@PathVariable String id, Long objectId) {
        scannerService.ignore(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "/ignorelist/remove", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void removeFromIgnoreList(@PathVariable String id, Long objectId) {
        scannerService.removeFromIgnoreList(clientService.getClient(id), objectId);
    }

    @DeleteMapping(path = "/ignorelist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void resetIgnoreList(@PathVariable String id) {
        scannerService.resetIgnoreList(clientService.getClient(id));
    }

    @GetMapping(path = "/ignorelist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody List<Long> getIgnoreList(@PathVariable String id) {
        return scannerService.getIgnoreList(clientService.getClient(id));
    }

    @GetMapping(path = "/list", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody List<Long> getFindList(@PathVariable String id) {
        return scannerService.getFindList(clientService.getClient(id));
    }

    @GetMapping(path = "/item", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getFindItem(@PathVariable String id) {
        return scannerService.getFindItem(clientService.getClient(id));
    }

    @GetMapping(path = "/count", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getFindCount(@PathVariable String id) {
        return scannerService.getFindCount(clientService.getClient(id));
    }

    @GetMapping(path = "/quantity", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getFindQuantity(@PathVariable String id) {
        return scannerService.getFindQuantity(clientService.getClient(id));
    }

    @GetMapping(path = "/totalquantity", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getFindTotalQuantity(@PathVariable String id) {
        return scannerService.getFindTotalQuantity(clientService.getClient(id));
    }

    @PostMapping(path = "/find/types", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long findTypes(@PathVariable String id, FindTypesDto findTypeDto) {
        return scannerService.findTypes(clientService.getClient(id), findTypeDto);
    }
}
