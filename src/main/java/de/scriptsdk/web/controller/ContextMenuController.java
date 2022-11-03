package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.contextmenu.ContextMenuDto;
import de.scriptsdk.web.dto.contextmenu.ContextMenuHookDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ContextMenuService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/context")
public class ContextMenuController {
    final ClientService clientService;
    final ContextMenuService contextMenuService;

    public ContextMenuController(ClientService clientService, ContextMenuService contextMenuService) {
        this.clientService = clientService;
        this.contextMenuService = contextMenuService;
    }

    @GetMapping(path = "delay", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns context delay", tags = {"context-menu"})
    public @ResponseBody Integer getContextDelay(@PathVariable String id) {
        return contextMenuService.getContextDelay(clientService.getClient(id));
    }

    @GetMapping(path = "menu-as-string", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns context menu as string list", tags = {"context-menu"})
    public @ResponseBody List<String> getContextMenuAsString(@PathVariable String id) {
        return contextMenuService.getContextMenuAsString(clientService.getClient(id));
    }

    @GetMapping(path = "menu", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns context menu", tags = {"context-menu"})
    public @ResponseBody ContextMenuDto getContextMenuAsRecord(@PathVariable String id) {
        return contextMenuService.getContextMenuAsRecord(clientService.getClient(id));
    }

    @PostMapping(path = "delay", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets context delay", tags = {"context-menu"})
    public void setContextDelay(@PathVariable String id, @RequestBody Integer delay) {
        contextMenuService.setContextDelay(clientService.getClient(id), delay);
    }

    @PostMapping(path = "request-hook", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Request a context menu by id", tags = {"context-menu"})
    public void requestContextMenu(@PathVariable String id, @RequestBody Long objectId) {
        contextMenuService.requestContextMenu(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "hook", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Select a context menu entry", tags = {"context-menu"})
    public void setContextMenuHook(@PathVariable String id, @RequestBody ContextMenuHookDto contextMenuHook) {
        contextMenuService.setContextMenuHook(clientService.getClient(id), contextMenuHook);
    }

    @DeleteMapping(path = "clear", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Clear context menu cache", tags = {"context-menu"})
    public void clearContextMenu(@PathVariable String id) {
        contextMenuService.clearContextMenu(clientService.getClient(id));
    }
}
