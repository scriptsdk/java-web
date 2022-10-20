package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.stealth.*;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.StealthService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("v1/{id}/stealth")
public class StealthController {
    final ClientService clientService;
    final StealthService stealthService;

    public StealthController(ClientService clientService, @RequestBody StealthService stealthService) {
        this.clientService = clientService;
        this.stealthService = stealthService;
    }

    @GetMapping(path = "/profilename", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getProfileName(@PathVariable String id) {
        return stealthService.getProfileName(clientService.getClient(id));
    }

    @GetMapping(path = "/isconnected", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isConnected(@PathVariable String id) {
        return stealthService.isConnected(clientService.getClient(id));
    }

    @PostMapping(path = "/addtosystemjournal", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void addToSystemJournal(@PathVariable String id, @RequestBody String text) {
        stealthService.addToSystemJournal(clientService.getClient(id), text);
    }

    @GetMapping(path = "/stealthinfo", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody StealthInfoDto getStealthInfo(@PathVariable String id) {
        return stealthService.getStealthInfo(clientService.getClient(id));
    }

    @GetMapping(path = "/lastdisconnectedtime", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody LocalDateTime getLastDisconnectTime(@PathVariable String id) {
        return stealthService.getLastDisconnectTime(clientService.getClient(id));
    }

    @GetMapping(path = "/lastconnectedtime", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody LocalDateTime getLastConnectTime(@PathVariable String id) {
        return stealthService.getLastConnectTime(clientService.getClient(id));
    }

    @PostMapping(path = "/connect", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void connect(@PathVariable String id) {
        stealthService.connect(clientService.getClient(id));
    }

    @PostMapping(path = "/disconnect", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void disconnect(@PathVariable String id) {
        stealthService.disconnect(clientService.getClient(id));
    }

    @GetMapping(path = "/shardname", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getShardName(@PathVariable String id) {
        return stealthService.getShardName(clientService.getClient(id));
    }

    @GetMapping(path = "/proxyip", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getProxyIp(@PathVariable String id) {
        return stealthService.getProxyIp(clientService.getClient(id));
    }

    @GetMapping(path = "/proxyport", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getProxyPort(@PathVariable String id) {
        return stealthService.getProxyPort(clientService.getClient(id));
    }

    @GetMapping(path = "/proxymode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isProxyMode(@PathVariable String id) {
        return stealthService.isProxyMode(clientService.getClient(id));
    }

    @GetMapping(path = "/changeprofile", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer changeProfile(@PathVariable String id, @RequestBody String nextProfileName) {
        return stealthService.changeProfile(clientService.getClient(id), nextProfileName);
    }

    @PostMapping(path = "/startchecklag", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void startCheckLag(@PathVariable String id) {
        stealthService.startCheckLag(clientService.getClient(id));
    }

    @PostMapping(path = "/stopchecklag", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void stopCheckLag(@PathVariable String id) {
        stealthService.stopCheckLag(clientService.getClient(id));
    }

    @GetMapping(path = "/ischecklagstopped", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isCheckLagStopped(@PathVariable String id) {
        return stealthService.isCheckLagStopped(clientService.getClient(id));
    }

    @PostMapping(path = "/fillnewwindow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void fillNewWindow(@PathVariable String id, @RequestBody String text) {
        stealthService.fillNewWindow(clientService.getClient(id), text);
    }

    @GetMapping(path = "/stealthpath", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getStealthPath(@PathVariable String id) {
        return stealthService.getStealthPath(clientService.getClient(id));
    }

    @GetMapping(path = "/stealthprofilepath", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getStealthProfilePath(@PathVariable String id) {
        return stealthService.getStealthProfilePath(clientService.getClient(id));
    }

    @GetMapping(path = "/shardpath", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getShardPath(@PathVariable String id) {
        return stealthService.getShardPath(clientService.getClient(id));
    }

    @PostMapping(path = "/sendtexttouo", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void sendTextToUO(@PathVariable String id, @RequestBody String text) {
        stealthService.sendTextToUO(clientService.getClient(id), text);
    }

    @PostMapping(path = "/sendtexttouocolor", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void sendTextToUOColor(@PathVariable String id, @RequestBody HuedTextDto text) {
        stealthService.sendTextToUOColor(clientService.getClient(id), text);
    }

    @PostMapping(path = "/globalvariable", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setGlobalVariable(@PathVariable String id, @RequestBody VarRegionDto region) {
        stealthService.setGlobalVariable(clientService.getClient(id), region);
    }

    @GetMapping(path = "/globalvariable", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody VarRegionDto getGlobalVariable(@PathVariable String id, @RequestBody VarRegionDto region) {
        return stealthService.getGlobalVariable(clientService.getClient(id), region);
    }

    @PostMapping(path = "/replytoconsoleentry", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void replyToConsoleEntry(@PathVariable String id, @RequestBody String text) {
        stealthService.replyToConsoleEntry(clientService.getClient(id), text);
    }

    @PostMapping(path = "/alarm", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setAlarm(@PathVariable String id) {
        stealthService.setAlarm(clientService.getClient(id));
    }

    @PostMapping(path = "/printtoclient", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void printToClient(@PathVariable String id, @RequestBody String text) {
        stealthService.printToClient(clientService.getClient(id), text);
    }

    @PostMapping(path = "/printtoclientadvanced", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void printToClient(@PathVariable String id, @RequestBody ClientTextDto clientTextDto) {
        stealthService.printToClient(clientService.getClient(id), clientTextDto);
    }

    @PostMapping(path = "/closeclientuiwindow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void closeClientUIWindow(@PathVariable String id, @RequestBody ClientUIWindowDto uiWindowDto) {
        stealthService.closeClientUIWindow(clientService.getClient(id), uiWindowDto);
    }

    @PostMapping(path = "/requestclientobjecttarget", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void requestClientObjectTarget(@PathVariable String id) {
        stealthService.requestClientObjectTarget(clientService.getClient(id));
    }

    @PostMapping(path = "/requestclienttiletarget", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void requestClientTileTarget(@PathVariable String id) {
        stealthService.requestClientTileTarget(clientService.getClient(id));
    }

    @GetMapping(path = "/isclienttargetresponsepresent", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isClientTargetResponsePresent(@PathVariable String id) {
        return stealthService.isClientTargetResponsePresent(clientService.getClient(id));
    }

    @GetMapping(path = "/clienttargetresponse", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody TargetInfoDto getClientTargetResponse(@PathVariable String id) {
        return stealthService.getClientTargetResponse(clientService.getClient(id));
    }

    @GetMapping(path = "/stealthdatetimeunixnow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody LocalDateTime getStealthDateTimeUnixNow(@PathVariable String id) {
        return stealthService.getStealthDateTimeUnixNow(clientService.getClient(id));
    }

    @GetMapping(path = "/stealthdatetimenow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody LocalDateTime getStealthDateTimeNow(@PathVariable String id) {
        return stealthService.getStealthDateTimeNow(clientService.getClient(id));
    }

    @DeleteMapping(path = "/systemjournal", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void clearSystemJournal(@PathVariable String id) {
        stealthService.clearSystemJournal(clientService.getClient(id));
    }

    @DeleteMapping(path = "/infowindow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void clearInfoWindow(@PathVariable String id) {
        stealthService.clearInfoWindow(clientService.getClient(id));
    }

    @GetMapping(path = "/changeprofileadvanced", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer changeProfile(@PathVariable String id, @RequestBody ProfileDto profile) {
        return stealthService.changeProfile(clientService.getClient(id), profile);
    }

    @PostMapping(path = "/autoreconnectparameter", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setAutoReconnectParameter(@PathVariable String id, @RequestBody AutoReconnectParameterDto parameter) {
        stealthService.setAutoReconnectParameter(clientService.getClient(id), parameter);
    }

    @GetMapping(path = "/gameserverip", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getGameServerIP(@PathVariable String id) {

        return stealthService.getGameServerIP(clientService.getClient(id));
    }

    @GetMapping(path = "/profileshardname", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getProfileShardName(@PathVariable String id) {
        return stealthService.getProfileShardName(clientService.getClient(id));
    }


    @GetMapping(path = "/clientversion", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getClientVersionAsInteger(@PathVariable String id) {
        return stealthService.getClientVersionAsInteger(clientService.getClient(id));
    }

    @PostMapping(path = "/dumbobjectscache", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void dumbObjectsCache(@PathVariable String id) {
        stealthService.dumbObjectsCache(clientService.getClient(id));
    }

    @PostMapping(path = "/hideclient", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void hideClient(@PathVariable String id, @RequestBody Long pid) {
        stealthService.hideClient(clientService.getClient(id), pid);
    }

    @PostMapping(path = "/replytoconsoleentryasunicode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void replyToConsoleEntryAsUnicode(@PathVariable String id, @RequestBody String text) {
        stealthService.replyToConsoleEntryAsUnicode(clientService.getClient(id), text);
    }

    @PostMapping(path = "/createcharacter", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void createCharacter(@PathVariable String id, @RequestBody CharacterCreationDto creation) {
        stealthService.createCharacter(clientService.getClient(id), creation);
    }

    @PostMapping(path = "/waitforclient", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void waitForClient(@PathVariable String id, @RequestBody Integer delay) {
        stealthService.waitForClient(clientService.getClient(id), delay);
    }
}
