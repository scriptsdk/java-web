package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.stealth.*;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.StealthService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("{id}/stealth")
public class StealthController {
    final ClientService clientService;
    final StealthService stealthService;

    public StealthController(ClientService clientService, @RequestBody StealthService stealthService) {
        this.clientService = clientService;
        this.stealthService = stealthService;
    }

    @GetMapping(path = "profile-name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name of current used stealth profile.", tags = {"stealth"})
    public @ResponseBody String getProfileName(@PathVariable String id) {
        return stealthService.getProfileName(clientService.getClient(id));
    }

    @GetMapping(path = "is-connected", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if stealth is connected towards game server.", tags = {"stealth"})
    public @ResponseBody Boolean isConnected(@PathVariable String id) {
        return stealthService.isConnected(clientService.getClient(id));
    }

    @PostMapping(path = "add-to-system-journal", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Adds a new line of text into system journal.", tags = {"stealth"})
    public void addToSystemJournal(@PathVariable String id, @RequestBody String text) {
        stealthService.addToSystemJournal(clientService.getClient(id), text);
    }

    @GetMapping(path = "stealth-info", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns system information's about stealth.", tags = {"stealth"})
    public @ResponseBody StealthInfoDto getStealthInfo(@PathVariable String id) {
        return stealthService.getStealthInfo(clientService.getClient(id));
    }

    @GetMapping(path = "last-disconnected-time", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns timestamp of last disconnect.", tags = {"stealth"})
    public @ResponseBody LocalDateTime getLastDisconnectTime(@PathVariable String id) {
        return stealthService.getLastDisconnectTime(clientService.getClient(id));
    }

    @GetMapping(path = "last-connected-time", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns timestamp of last connect", tags = {"stealth"})
    public @ResponseBody LocalDateTime getLastConnectTime(@PathVariable String id) {
        return stealthService.getLastConnectTime(clientService.getClient(id));
    }

    @PostMapping(path = "connect")
    @Operation(summary = "Connects client to game server.", tags = {"stealth"})
    public void connect(@PathVariable String id) {
        stealthService.connect(clientService.getClient(id));
    }

    @PostMapping(path = "disconnect")
    @Operation(summary = "Disconnects client from game server.", tags = {"stealth"})
    public void disconnect(@PathVariable String id) {
        stealthService.disconnect(clientService.getClient(id));
    }

    @GetMapping(path = "shard-name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name of game server.", tags = {"stealth"})
    public @ResponseBody String getShardName(@PathVariable String id) {
        return stealthService.getShardName(clientService.getClient(id));
    }

    @GetMapping(path = "proxy-ip", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "returns ip of proxy.", tags = {"stealth"})
    public @ResponseBody String getProxyIp(@PathVariable String id) {
        return stealthService.getProxyIp(clientService.getClient(id));
    }

    @GetMapping(path = "proxy-port", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns port of proxy.", tags = {"stealth"})
    public @ResponseBody Integer getProxyPort(@PathVariable String id) {
        return stealthService.getProxyPort(clientService.getClient(id));
    }

    @GetMapping(path = "proxy-mode", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if proxy mode is enabled.", tags = {"stealth"})
    public @ResponseBody Boolean isProxyMode(@PathVariable String id) {
        return stealthService.isProxyMode(clientService.getClient(id));
    }

    @PostMapping(path = "change-profile", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Performs a profile change by passed profile name.", tags = {"stealth"})
    public @ResponseBody Integer changeProfile(@PathVariable String id, @RequestBody String nextProfileName) {
        return stealthService.changeProfile(clientService.getClient(id), nextProfileName);
    }

    @PostMapping(path = "start-check-lag", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Starts to record a check of connectivity.", tags = {"stealth"})
    public void startCheckLag(@PathVariable String id) {
        stealthService.startCheckLag(clientService.getClient(id));
    }

    @PostMapping(path = "stop-check-lag")
    @Operation(summary = "Stops to record a check of connectivity.", tags = {"stealth"})
    public void stopCheckLag(@PathVariable String id) {
        stealthService.stopCheckLag(clientService.getClient(id));
    }

    @GetMapping(path = "is-check-lag-stopped", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if the record of lag checking has been stopped", tags = {"stealth"})
    public @ResponseBody Boolean isCheckLagStopped(@PathVariable String id) {
        return stealthService.isCheckLagStopped(clientService.getClient(id));
    }

    @PostMapping(path = "fill-new-window", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Applies text to custom text window of Stealth Client.", tags = {"stealth"})
    public void fillNewWindow(@PathVariable String id, @RequestBody String text) {
        stealthService.fillNewWindow(clientService.getClient(id), text);
    }

    @GetMapping(path = "stealth-path", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns installation path of Stealth Client", tags = {"stealth"})
    public @ResponseBody String getStealthPath(@PathVariable String id) {
        return stealthService.getStealthPath(clientService.getClient(id));
    }

    @GetMapping(path = "stealth-profile-path", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns path of profile from Stealth Client", tags = {"stealth"})
    public @ResponseBody String getStealthProfilePath(@PathVariable String id) {
        return stealthService.getStealthProfilePath(clientService.getClient(id));
    }

    @GetMapping(path = "shard-path", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public @ResponseBody String getShardPath(@PathVariable String id) {
        return stealthService.getShardPath(clientService.getClient(id));
    }

    @PostMapping(path = "send-text-to-uo", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void sendTextToUO(@PathVariable String id, @RequestBody String text) {
        stealthService.sendTextToUO(clientService.getClient(id), text);
    }

    @PostMapping(path = "send-text-to-uo-color", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void sendTextToUOColor(@PathVariable String id, @RequestBody HuedTextDto text) {
        stealthService.sendTextToUOColor(clientService.getClient(id), text);
    }

    @PostMapping(path = "global-variable", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void setGlobalVariable(@PathVariable String id, @RequestBody VarRegionDto region) {
        stealthService.setGlobalVariable(clientService.getClient(id), region);
    }

    @GetMapping(path = "global-variable", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public @ResponseBody VarRegionDto getGlobalVariable(@PathVariable String id, @RequestBody VarRegionDto region) {
        return stealthService.getGlobalVariable(clientService.getClient(id), region);
    }

    @PostMapping(path = "reply-to-console-entry", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void replyToConsoleEntry(@PathVariable String id, @RequestBody String text) {
        stealthService.replyToConsoleEntry(clientService.getClient(id), text);
    }

    @PostMapping(path = "alarm")
    @Operation(tags = {"stealth"})
    public void setAlarm(@PathVariable String id) {
        stealthService.setAlarm(clientService.getClient(id));
    }

    @PostMapping(path = "print-to-client", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void printToClient(@PathVariable String id, @RequestBody String text) {
        stealthService.printToClient(clientService.getClient(id), text);
    }

    @PostMapping(path = "print-to-client-advanced", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void printToClient(@PathVariable String id, @RequestBody ClientTextDto clientTextDto) {
        stealthService.printToClient(clientService.getClient(id), clientTextDto);
    }

    @PostMapping(path = "close-client-ui-window", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public void closeClientUIWindow(@PathVariable String id, @RequestBody ClientUIWindowDto uiWindowDto) {
        stealthService.closeClientUIWindow(clientService.getClient(id), uiWindowDto);
    }

    @PostMapping(path = "request-client-object-target")
    @Operation(tags = {"stealth"})
    public void requestClientObjectTarget(@PathVariable String id) {
        stealthService.requestClientObjectTarget(clientService.getClient(id));
    }

    @PostMapping(path = "request-client-tile-target")
    @Operation(tags = {"stealth"})
    public void requestClientTileTarget(@PathVariable String id) {
        stealthService.requestClientTileTarget(clientService.getClient(id));
    }

    @GetMapping(path = "is-client-target-response-present", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public @ResponseBody Boolean isClientTargetResponsePresent(@PathVariable String id) {
        return stealthService.isClientTargetResponsePresent(clientService.getClient(id));
    }

    @GetMapping(path = "client-target-response", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"stealth"})
    public @ResponseBody TargetInfoDto getClientTargetResponse(@PathVariable String id) {
        return stealthService.getClientTargetResponse(clientService.getClient(id));
    }

    @GetMapping(path = "stealth-datetime-unix-now", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns Timestamp \"now\" of Stealth Client.", tags = {"stealth"})
    public @ResponseBody LocalDateTime getStealthDateTimeUnixNow(@PathVariable String id) {
        return stealthService.getStealthDateTimeUnixNow(clientService.getClient(id));
    }

    @GetMapping(path = "stealth-datetime-now", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns Timestamp \"now\" of Stealth Client.", tags = {"stealth"})
    public @ResponseBody LocalDateTime getStealthDateTimeNow(@PathVariable String id) {
        return stealthService.getStealthDateTimeNow(clientService.getClient(id));
    }

    @DeleteMapping(path = "system-journal")
    @Operation(summary = "Clears system journal of Stealth Client.", tags = {"stealth"})
    public void clearSystemJournal(@PathVariable String id) {
        stealthService.clearSystemJournal(clientService.getClient(id));
    }

    @DeleteMapping(path = "info-window")
    @Operation(summary = "Clears custom info window of Stealth Client.", tags = {"stealth"})
    public void clearInfoWindow(@PathVariable String id) {
        stealthService.clearInfoWindow(clientService.getClient(id));
    }

    @PostMapping(path = "change-profile-advanced", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Changes profile of Stealth Client.", tags = {"stealth"})
    public @ResponseBody Integer changeProfile(@PathVariable String id, @RequestBody ProfileDto profile) {
        return stealthService.changeProfile(clientService.getClient(id), profile);
    }

    @PostMapping(path = "auto-reconnect-parameter", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Allows to configure auto reconnect parameters.", tags = {"stealth"})
    public void setAutoReconnectParameter(@PathVariable String id,
                                          @RequestBody AutoReconnectParameterDto parameter) {
        stealthService.setAutoReconnectParameter(clientService.getClient(id), parameter);
    }

    @GetMapping(path = "game-server-ip", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "returns stored ip address from profile.", tags = {"stealth"})
    public @ResponseBody String getGameServerIP(@PathVariable String id) {

        return stealthService.getGameServerIP(clientService.getClient(id));
    }

    @GetMapping(path = "profile-shard-name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns stored shard name from profile.", tags = {"stealth"})
    public @ResponseBody String getProfileShardName(@PathVariable String id) {
        return stealthService.getProfileShardName(clientService.getClient(id));
    }

    @GetMapping(path = "client-version", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns client version.", tags = {"stealth"})
    public @ResponseBody Integer getClientVersionAsInteger(@PathVariable String id) {
        return stealthService.getClientVersionAsInteger(clientService.getClient(id));
    }

    @PostMapping(path = "dumb-objects-cache")
    @Operation(summary = "Dumbs stealth's internal object cache.", tags = {"stealth"})
    public void dumbObjectsCache(@PathVariable String id) {
        stealthService.dumbObjectsCache(clientService.getClient(id));
    }

    @PostMapping(path = "hide-client", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Hides an application.", tags = {"stealth"})
    public void hideClient(@PathVariable String id, @RequestBody Long pid) {
        stealthService.hideClient(clientService.getClient(id), pid);
    }

    @PostMapping(path = "wait-for-client", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Performs a thread wait and synchronization of incoming packets.", tags = {"stealth"})
    public void waitForClient(@PathVariable String id, @RequestBody Integer delayInMS) {
        stealthService.waitForClient(clientService.getClient(id), delayInMS);
    }

    @PostMapping(path = "reply-to-console-entry-as-unicode", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Replies to a console entry.", tags = {"stealth"})
    public void replyToConsoleEntryAsUnicode(@PathVariable String id, @RequestBody String text) {
        stealthService.replyToConsoleEntryAsUnicode(clientService.getClient(id), text);
    }

    @PostMapping(path = "create-character", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Creates a new Character.", tags = {"stealth"})
    public void createCharacter(@PathVariable String id, @RequestBody CharacterCreationDto creation) {
        stealthService.createCharacter(clientService.getClient(id), creation);
    }

    @GetMapping(path = "is-compatible", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Creates a new Character.", tags = {"stealth"})
    public @ResponseBody Boolean isCompatible(@PathVariable String id) {
        return stealthService.isCompatible(clientService.getClient(id));
    }
}
