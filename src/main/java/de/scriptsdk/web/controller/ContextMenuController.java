package de.scriptsdk.web.controller;

import de.scriptsdk.core.exceptions.BaseException;
import de.scriptsdk.web.dto.contextmenu.ContextMenuDto;
import de.scriptsdk.web.dto.contextmenu.ContextMenuHookDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ContextMenuService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/contextmenu")
public class ContextMenuController {
    final ClientService clientService;
    final ContextMenuService contextMenuService;

    public ContextMenuController(ClientService clientService, ContextMenuService contextMenuService) {
        this.clientService = clientService;
        this.contextMenuService = contextMenuService;
    }

    @GetMapping(path = "/delay", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getContextDelay(@PathVariable String id) throws BaseException {
        return contextMenuService.getContextDelay(clientService.getClient(id));
    }

    @GetMapping(path = "/string", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody List<String> getContextMenuAsString(@PathVariable String id) throws BaseException {
        return contextMenuService.getContextMenuAsString(clientService.getClient(id));
    }

    @GetMapping(path = "/object", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody ContextMenuDto getContextMenuAsRecord(@PathVariable String id) throws BaseException {
        return contextMenuService.getContextMenuAsRecord(clientService.getClient(id));
    }

    @PostMapping(path = "/delay", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setContextDelay(@PathVariable String id, @RequestBody Integer delay) throws BaseException {
        contextMenuService.setContextDelay(clientService.getClient(id), delay);
    }

    @PostMapping(path = "/requesthook", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void requestContextMenu(@PathVariable String id, @RequestBody Long objectId) throws BaseException {
        contextMenuService.requestContextMenu(clientService.getClient(id), objectId);
    }

    @PostMapping(path = "/sethook", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setContextMenuHook(@PathVariable String id, @RequestBody ContextMenuHookDto contextMenuHook) throws BaseException {
        contextMenuService.setContextMenuHook(clientService.getClient(id), contextMenuHook);
    }

    @PostMapping(path = "/clear", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void clearContextMenu(@PathVariable String id) throws BaseException {
        contextMenuService.clearContextMenu(clientService.getClient(id));
    }
}
