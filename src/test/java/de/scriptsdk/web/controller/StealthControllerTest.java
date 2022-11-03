package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.stealth.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

class StealthControllerTest extends AbstractControllerTest {


    protected StealthControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Override
    protected String getBaseUrl() {
        return "/v1/{id}/stealth";
    }

    @Test
    void getProfileName() {
        String value = getClient().get("profile-name", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isConnected() {
        Boolean value = getClient().get("is-connected", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStealthInfo() {
        StealthInfoDto value = getClient().get("stealth-info", getInfo().getId(), StealthInfoDto.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastDisconnectTime() {
        LocalDateTime value = getClient().get("last-disconnected-time", getInfo().getId(), LocalDateTime.class);

        Assertions.assertNotNull(value);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastConnectTime() {
        LocalDateTime value = getClient().get("last-connected-time", getInfo().getId(), LocalDateTime.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getShardName() {
        String value = getClient().get("shard-name", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getProxyIp() {
        String value = getClient().get("proxy-ip", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getProxyPort() {
        Integer value = getClient().get("proxy-port", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isProxyMode() {
        Boolean value = getClient().get("proxy-mode", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }


    @Test
    void isCheckLagStopped() {
        Boolean value = getClient().get("is-check-lag-stopped", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStealthPath() {
        String value = getClient().get("stealth-path", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStealthProfilePath() {
        String value = getClient().get("stealth-profile-path", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getShardPath() {
        String value = getClient().get("shard-path", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGlobalVariable() {
        VarRegionDto value = getClient().get("global-variable", getInfo().getId(), VarRegionDto.class, new VarRegionDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void isClientTargetResponsePresent() {
        Boolean value = getClient().get("is-client-target-response-present", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getClientTargetResponse() {
        TargetInfoDto value = getClient().get("client-target-response", getInfo().getId(), TargetInfoDto.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStealthDateTimeUnixNow() {
        LocalDateTime value = getClient().get("stealth-datetime-unix-now", getInfo().getId(), LocalDateTime.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStealthDateTimeNow() {
        LocalDateTime value = getClient().get("stealth-datetime-now", getInfo().getId(), LocalDateTime.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGameServerIP() {
        String value = getClient().get("game-server-ip", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getProfileShardName() {
        String value = getClient().get("profile-shard-name", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getClientVersionAsInteger() {
        Integer value = getClient().get("client-version", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void addToSystemJournal() {
        MvcResult result = getClient().post("add-to-system-journal", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void connect() {
        MvcResult result = getClient().post("connect", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void disconnect() {
        MvcResult result = getClient().post("disconnect", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void changeProfile() {
        Integer value = getClient().post("change-profile", getInfo().getId(), Integer.class, "Test");

        Assertions.assertNotNull(value);
    }

    @Test
    void startCheckLag() {
        MvcResult result = getClient().post("start-check-lag", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void stopCheckLag() {
        getClient().post("start-check-lag", getInfo().getId());

        MvcResult result = getClient().post("stop-check-lag", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void fillNewWindow() {
        MvcResult result = getClient().post("fill-new-window", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void sendTextToUO() {
        MvcResult result = getClient().post("send-text-to-uo", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void sendTextToUOColor() {
        MvcResult result = getClient().post("send-text-to-uo-color", getInfo().getId(), new HuedTextDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setGlobalVariable() {
        MvcResult result = getClient().post("global-variable", getInfo().getId(), new VarRegionDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void replyToConsoleEntry() {
        MvcResult result = getClient().post("reply-to-console-entry", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setAlarm() {
        MvcResult result = getClient().post("alarm", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void printToClient() {
        MvcResult result = getClient().post("print-to-client", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void printToClientAdvanced() {
        MvcResult result = getClient().post("print-to-client-advanced", getInfo().getId(), new ClientTextDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void closeClientUIWindow() {
        MvcResult result = getClient().post("close-client-ui-window", getInfo().getId(), new ClientUIWindowDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void requestClientObjectTarget() {
        MvcResult result = getClient().post("request-client-object-target", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void requestClientTileTarget() {
        MvcResult result = getClient().post("request-client-tile-target", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void clearSystemJournal() {
        MvcResult result = getClient().delete("system-journal", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearInfoWindow() {
        MvcResult result = getClient().delete("info-window", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void ChangeProfile() {
        Integer value = getClient().post("change-profile-advanced", getInfo().getId(), Integer.class, new ProfileDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void setAutoReconnectParameter() {
        MvcResult result = getClient().post("auto-reconnect-parameter", getInfo().getId(), new AutoReconnectParameterDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }


    @Test
    void dumbObjectsCache() {
        MvcResult result = getClient().post("dumb-objects-cache", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void hideClient() {
        MvcResult result = getClient().post("hide-client", getInfo().getId(), 0);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void replyToConsoleEntryAsUnicode() {
        MvcResult result = getClient().post("reply-to-console-entry-as-unicode", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void createCharacter() {
        MvcResult result = getClient().post("create-character", getInfo().getId(), new CharacterCreationDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitForClient() {
        MvcResult result = getClient().post("wait-for-client", getInfo().getId(), 25);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void isCompatible() {
        Boolean value = getClient().get("is-compatible", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }
}