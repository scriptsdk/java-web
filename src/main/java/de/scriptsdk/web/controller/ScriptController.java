package de.scriptsdk.web.controller;

import de.scriptsdk.core.enums.network.ScriptState;
import de.scriptsdk.web.dto.script.ExtendedScriptInfoDto;
import de.scriptsdk.web.dto.script.ScriptInfoDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ScriptItemInfoDto;
import de.scriptsdk.web.service.ScriptService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/script")
public class ScriptController {
    final ClientService clientService;
    final ScriptService scriptService;

    public ScriptController(ClientService clientService, ScriptService scriptService) {
        this.clientService = clientService;
        this.scriptService = scriptService;
    }

    @GetMapping(path = "count", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of attached scripts", tags = {"script"})
    public @ResponseBody Integer getScriptCount(@PathVariable String id) {
        return scriptService.getScriptCount(clientService.getClient(id));
    }

    @GetMapping(path = "path", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns file path of a certain script", tags = {"script"})
    public @ResponseBody String getScriptPath(@PathVariable String id, @RequestBody Integer index) {
        return scriptService.getScriptPath(clientService.getClient(id), index);
    }

    @GetMapping(path = "state", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns state of a certain script", tags = {"script"})
    public @ResponseBody ScriptState getScriptState(@PathVariable String id, @RequestBody Integer index) {
        return scriptService.getScriptState(clientService.getClient(id), index);
    }

    @PostMapping(path = "start", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Starts a new script", tags = {"script"})
    public @ResponseBody Integer startScript(@PathVariable String id, @RequestBody String scriptPath) {
        return scriptService.startScript(clientService.getClient(id), scriptPath);
    }

    @PostMapping(path = "stop", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Stops a certain Script", tags = {"script"})
    public void stopScript(@PathVariable String id, @RequestBody Integer index) {
        scriptService.stopScript(clientService.getClient(id), index);
    }

    @PostMapping(path = "pause-or-resume", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Pause or resume a certain script", tags = {"script"})
    public void pauseOrResumeSelectedScript(@PathVariable String id, @RequestBody Integer index) {
        scriptService.pauseOrResumeSelectedScript(clientService.getClient(id), index);
    }

    @PostMapping(path = "stop-all")
    @Operation(summary = "Stops all scripts", tags = {"script"})
    public void stopAllScripts(@PathVariable String id) {
        scriptService.stopAllScripts(clientService.getClient(id));
    }


    @PostMapping(path = "name", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Changes name of a certain script", tags = {"script"})
    public void setScriptName(@PathVariable String id, @RequestBody ScriptInfoDto scriptInfoDto) {
        scriptService.setScriptName(clientService.getClient(id), scriptInfoDto);
    }

    @GetMapping(path = "name", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name of a certain script", tags = {"script"})
    public @ResponseBody String getScriptName(@PathVariable String id, @RequestBody Integer index) {
        return scriptService.getScriptName(clientService.getClient(id), index);
    }

    @GetMapping(path = "parameter", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns script parameters", tags = {"script"})
    public @ResponseBody ExtendedScriptInfoDto getScriptParameter(@PathVariable String id) {
        return scriptService.getScriptParameter(clientService.getClient(id));
    }

    @GetMapping(path = "script-items", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a list of attached scripts", tags = {"script"})
    public @ResponseBody List<ScriptItemInfoDto> getScriptItems(@PathVariable String id) {
        return scriptService.getScriptItems(clientService.getClient(id));
    }
}
