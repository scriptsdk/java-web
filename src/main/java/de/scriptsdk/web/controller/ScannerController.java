package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.scanner.FindNotorietyDto;
import de.scriptsdk.web.dto.scanner.FindTypeDto;
import de.scriptsdk.web.dto.scanner.FindTypesDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ScannerService;
import io.swagger.v3.oas.annotations.Operation;
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

    @PostMapping(path = "find-by-type", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Executes a scan of objects based on type", tags = {"scanner"})
    public @ResponseBody Long findType(@PathVariable String id, @RequestBody FindTypeDto findTypeDto) {
        return scannerService.findType(clientService.getClient(id), findTypeDto);
    }

    @PostMapping(path = "find-by-notoriety", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Executes a scan of objects based on notoriety", tags = {"scanner"})
    public @ResponseBody Long findNotoriety(@PathVariable String id, @RequestBody FindNotorietyDto findNotorietyDto) {
        return scannerService.findNotoriety(clientService.getClient(id), findNotorietyDto);
    }

    @PostMapping(path = "find-by-coordination", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Executes a scan of objects based on location", tags = {"scanner"})
    public @ResponseBody Long findAtCoordination(@PathVariable String id, @RequestBody Point2DDto point2DDto) {
        return scannerService.findAtCoordination(clientService.getClient(id), point2DDto);
    }

    @PostMapping(path = "ignore", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Adds id to ignore list for further scans", tags = {"scanner"})
    public void ignore(@PathVariable String id, @RequestBody Long objectId) {
        scannerService.ignore(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "remove-from-ignore-list", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Removes id from ignore list for further scans", tags = {"scanner"})
    public void removeFromIgnoreList(@PathVariable String id, @RequestBody Long objectId) {
        scannerService.removeFromIgnoreList(clientService.getClient(id), objectId);
    }

    @DeleteMapping(path = "ignore-list")
    @Operation(summary = "Clears list of ignored items", tags = {"scanner"})
    public void resetIgnoreList(@PathVariable String id) {
        scannerService.resetIgnoreList(clientService.getClient(id));
    }

    @GetMapping(path = "ignore-list", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns list of ignored items", tags = {"scanner"})
    public @ResponseBody List<Long> getIgnoreList(@PathVariable String id) {
        return scannerService.getIgnoreList(clientService.getClient(id));
    }

    @GetMapping(path = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns list of id from last executed scan", tags = {"scanner"})
    public @ResponseBody List<Long> getFindList(@PathVariable String id) {
        return scannerService.getFindList(clientService.getClient(id));
    }

    @GetMapping(path = "item", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns first id retrieved from last executed scan", tags = {"scanner"})
    public @ResponseBody Long getFindItem(@PathVariable String id) {
        return scannerService.getFindItem(clientService.getClient(id));
    }

    @GetMapping(path = "count", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of results from last executed scan", tags = {"scanner"})
    public @ResponseBody Integer getFindCount(@PathVariable String id) {
        return scannerService.getFindCount(clientService.getClient(id));
    }

    @GetMapping(path = "quantity", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns quantity from first id from last executed scan", tags = {"scanner"})
    public @ResponseBody Integer getFindQuantity(@PathVariable String id) {
        return scannerService.getFindQuantity(clientService.getClient(id));
    }

    @GetMapping(path = "total-quantity", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns total quantity of last executed scan", tags = {"scanner"})
    public @ResponseBody Integer getFindTotalQuantity(@PathVariable String id) {
        return scannerService.getFindTotalQuantity(clientService.getClient(id));
    }

    @PostMapping(path = "find-by-list", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Executes a more complex scan of objects based on multiple information's", tags = {"scanner"})
    public @ResponseBody Long findTypes(@PathVariable String id, FindTypesDto findTypeDto) {
        return scannerService.findTypes(clientService.getClient(id), findTypeDto);
    }
}
