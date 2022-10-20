package de.scriptsdk.web.controller;

import de.scriptsdk.core.enums.network.ScriptState;
import de.scriptsdk.web.dto.script.ExtendedScriptInfoDto;
import de.scriptsdk.web.dto.script.ScriptInfoDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ScriptService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class ScriptController {
    final ClientService clientService;
    final ScriptService scriptService;

    public ScriptController(ClientService clientService, ScriptService scriptService) {
        this.clientService = clientService;
        this.scriptService = scriptService;
    }

    @GetMapping(path = "/count", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getScriptCount(@PathVariable String id) {
        return scriptService.getScriptCount(clientService.getClient(id));
    }

    @GetMapping(path = "/path", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getScriptPath(@PathVariable String id, @RequestBody Integer index) {
        return scriptService.getScriptPath(clientService.getClient(id), index);
    }

    @GetMapping(path = "/state", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody ScriptState getScriptState(@PathVariable String id, @RequestBody Integer index) {
        return scriptService.getScriptState(clientService.getClient(id), index);
    }

    @PostMapping(path = "/start", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer startScript(@PathVariable String id, @RequestBody String scriptPath) {
        return scriptService.startScript(clientService.getClient(id), scriptPath);
    }

    @PostMapping(path = "/stop", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void stopScript(@PathVariable String id, @RequestBody Integer index) {
        scriptService.stopScript(clientService.getClient(id), index);
    }

    @PostMapping(path = "/pauseorresume", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void pauseOrResumeSelectedScript(@PathVariable String id, @RequestBody Integer index) {
        scriptService.pauseOrResumeSelectedScript(clientService.getClient(id), index);
    }

    @PostMapping(path = "/stopall", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void stopAllScripts(@PathVariable String id) {
        scriptService.stopAllScripts(clientService.getClient(id));
    }


    @PostMapping(path = "/name", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setScriptName(@PathVariable String id, @RequestBody ScriptInfoDto scriptInfoDto) {
        scriptService.setScriptName(clientService.getClient(id), scriptInfoDto);
    }

    @GetMapping(path = "/name", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getScriptName(@PathVariable String id, @RequestBody Integer index) {
        return scriptService.getScriptName(clientService.getClient(id), index);
    }

    @GetMapping(path = "/parameter", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody ExtendedScriptInfoDto getScriptParameter(@PathVariable String id) {
        return scriptService.getScriptParameter(clientService.getClient(id));
    }
}
