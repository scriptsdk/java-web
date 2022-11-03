package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.contextmenu.ContextMenuDto;
import de.scriptsdk.web.dto.contextmenu.ContextMenuHookDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ContextMenuControllerTest extends AbstractControllerTest {

    protected ContextMenuControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getContextDelay() {
        Integer value = getClient().get("delay", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getContextMenuAsString() {
        List<String> value = Arrays.stream(getClient().get("menu-as-string",
                getInfo().getId(), String[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getContextMenuAsRecord() {
        ContextMenuDto value = getClient().get("menu", getInfo().getId(), ContextMenuDto.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setContextDelay() {
        MvcResult result = getClient().post("delay", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void requestContextMenu() {
        MvcResult result = getClient().post("request-hook", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setContextMenuHook() {
        MvcResult result = getClient().post("hook", getInfo().getId(), new ContextMenuHookDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearContextMenu() {
        MvcResult result = getClient().delete("clear", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/context";
    }
}