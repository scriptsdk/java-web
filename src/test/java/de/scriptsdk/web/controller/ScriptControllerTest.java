package de.scriptsdk.web.controller;

import de.scriptsdk.core.enums.network.ScriptState;
import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.script.ExtendedScriptInfoDto;
import de.scriptsdk.web.dto.script.ScriptInfoDto;
import de.scriptsdk.web.service.ScriptItemInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ScriptControllerTest extends AbstractControllerTest {

    protected ScriptControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getScriptCount() {
        Integer value = getClient().get("count", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getScriptPath() {
        String value = getClient().get("path", getInfo().getId(), String.class, 1);

        Assertions.assertNotNull(value);
    }

    @Test
    void getScriptState() {
        ScriptState value = getClient().get("state", getInfo().getId(), ScriptState.class, 1);

        Assertions.assertNotNull(value);
    }

    @Test
    void startScript() {
        MvcResult result = getClient().post("start", getInfo().getId(), "");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void stopScript() {
        MvcResult result = getClient().post("stop", getInfo().getId(), 1);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void pauseOrResumeSelectedScript() {
        MvcResult result = getClient().post("pause-or-resume", getInfo().getId(), 1);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void stopAllScripts() {
        MvcResult result = getClient().post("stop-all", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
        this.setDeleteReferences(true);
    }

    @Test
    void setScriptName() {
        MvcResult result = getClient().post("name", getInfo().getId(), new ScriptInfoDto(1, "test"));

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getScriptName() {
        String value = getClient().get("name", getInfo().getId(), String.class, 1);

        Assertions.assertNotNull(value);
    }

    @Test
    void getScriptParameter() {
        ExtendedScriptInfoDto value = getClient().get("parameter", getInfo().getId(), ExtendedScriptInfoDto.class);

        Assertions.assertNotNull(value);
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/script";
    }

    @Test
    void getScriptItems() {
        List<ScriptItemInfoDto> value = Arrays.stream(getClient().get("script-items",
                getInfo().getId(), ScriptItemInfoDto[].class)).toList();

        Assertions.assertNotNull(value);
    }
}