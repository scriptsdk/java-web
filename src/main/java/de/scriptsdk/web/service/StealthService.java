package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.stealth.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StealthService {

    public String getProfileName(ApiClient client) {
        return client.getProfileName();
    }

    public Boolean isConnected(ApiClient client) {
        return client.isConnected();
    }

    public void addToSystemJournal(ApiClient client, String text) {
        client.addToSystemJournal(text);
    }

    public StealthInfoDto getStealthInfo(ApiClient client) {
        return new StealthInfoDto(client.getStealthInfo());
    }

    public LocalDateTime getLastDisconnectTime(ApiClient client) {
        return client.getLastDisconnectTime();
    }

    public LocalDateTime getLastConnectTime(ApiClient client) {
        return client.getLastConnectTime();
    }

    public void connect(ApiClient client) {
        client.connect();
    }

    public void disconnect(ApiClient client) {
        client.disconnect();
    }

    public String getShardName(ApiClient client) {
        return client.getShardName();
    }

    public String getProxyIp(ApiClient client) {
        return client.getProxyIp();
    }

    public Integer getProxyPort(ApiClient client) {
        return client.getProxyPort();
    }

    public Boolean isProxyMode(ApiClient client) {
        return client.isProxyMode();
    }

    public Integer changeProfile(ApiClient client, String nextProfileName) {
        return client.changeProfile(nextProfileName);
    }

    public void startCheckLag(ApiClient client) {
        client.startCheckLag();
    }

    public void stopCheckLag(ApiClient client) {
        client.stopCheckLag();
    }

    public Boolean isCheckLagStopped(ApiClient client) {
        return client.isCheckLagStopped();
    }

    public void fillNewWindow(ApiClient client, String text) {
        client.fillNewWindow(text);
    }

    public String getStealthPath(ApiClient client) {
        return client.getStealthPath();
    }

    public String getStealthProfilePath(ApiClient client) {
        return client.getStealthProfilePath();
    }

    public String getShardPath(ApiClient client) {
        return client.getShardPath();
    }

    public void sendTextToUO(ApiClient client, String text) {
        client.sendTextToUO(text);
    }

    public void sendTextToUOColor(ApiClient client, HuedTextDto text) {
        client.sendTextToUOColor(text.getText(), text.getColor());
    }

    public void setGlobalVariable(ApiClient client, VarRegionDto region) {
        client.setGlobalVariable(region.getRegion(), region.getKeyName(), region.getKeyValue());
    }

    public VarRegionDto getGlobalVariable(ApiClient client, VarRegionDto region) {
        return new VarRegionDto(region.getRegion(), region.getKeyName(),
                client.getGlobalVariable(region.getRegion(), region.getKeyName()));
    }

    public void replyToConsoleEntry(ApiClient client, String text) {
        client.replyToConsoleEntry(text);
    }

    public void setAlarm(ApiClient client) {
        client.setAlarm();
    }

    public void printToClient(ApiClient client, String text) {
        client.printToClient(text);
    }

    public void printToClient(ApiClient client, ClientTextDto clientTextDto) {
        client.printToClient(clientTextDto.getSender(), clientTextDto.getColor(),
                clientTextDto.getFont(), clientTextDto.getText());
    }

    public void closeClientUIWindow(ApiClient client, ClientUIWindowDto uiWindowDto) {
        client.closeClientUIWindow(uiWindowDto.getUiWindowType(), uiWindowDto.getId());
    }

    public void requestClientObjectTarget(ApiClient client) {
        client.requestClientObjectTarget();
    }

    public void requestClientTileTarget(ApiClient client) {
        client.requestClientTileTarget();
    }

    public Boolean isClientTargetResponsePresent(ApiClient client) {
        return client.isClientTargetResponsePresent();
    }

    public TargetInfoDto getClientTargetResponse(ApiClient client) {
        return new TargetInfoDto(client.getClientTargetResponse());
    }

    public LocalDateTime getStealthDateTimeUnixNow(ApiClient client) {
        return client.getStealthDateTimeUnixNow();
    }

    public LocalDateTime getStealthDateTimeNow(ApiClient client) {
        return client.getStealthDateTimeNow();
    }

    public void clearSystemJournal(ApiClient client) {
        client.clearSystemJournal();
    }

    public void clearInfoWindow(ApiClient client) {
        client.clearInfoWindow();
    }

    public Integer changeProfile(ApiClient client, ProfileDto profile) {
        return client.changeProfile(profile.getProfileName(), profile.getShardName(), profile.getCharName());
    }

    public void setAutoReconnectParameter(ApiClient client, AutoReconnectParameterDto parameter) {
        client.setAutoReconnectParameter(parameter.getShardName(), parameter.getCharName(),
                parameter.getUseItAtEveryReconnect());
    }

    public String getGameServerIP(ApiClient client) {

        return client.getGameServerIP();
    }

    public String getProfileShardName(ApiClient client) {
        return client.getProfileShardName();
    }


    public Integer getClientVersionAsInteger(ApiClient client) {
        return client.getClientVersionAsInteger();
    }


    public void dumbObjectsCache(ApiClient client) {
        client.dumbObjectsCache();
    }

    public void hideClient(ApiClient client, Long pid) {
        client.hideClient(pid);
    }

    public void replyToConsoleEntryAsUnicode(ApiClient client, String text) {
        client.replyToConsoleEntryAsUnicode(text);
    }

    public void createCharacter(ApiClient client, CharacterCreationDto creation) {
        client.createCharacter(creation.toRequest());
    }

    public void waitForClient(ApiClient client, Integer delay) {
        client.waitForClient(delay);
    }

    public Boolean isCompatible(ApiClient client) {
        return client.isCompatible();
    }
}
