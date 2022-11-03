package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ChatControllerTest extends AbstractControllerTest {

    protected ChatControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/chat";
    }

    @Test
    void joinGlobalChatChannel() {
        MvcResult result = getClient().post("join", getInfo().getId(), " ");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void leaveGlobalChatChannel() {
        MvcResult result = getClient().post("leave", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void sendGlobalChannelChatMessage() {
        MvcResult result = getClient().post("message", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getActiveGlobalChatChannel() {
        String value = getClient().get("active-channel", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGlobalChannelList() {
        List<String> value = Arrays.stream(getClient().get("channel-list", getInfo().getId(), String[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void clearChatUserIgnore() {
        MvcResult result = getClient().delete("reset-ignore", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void addChatUserIgnore() {
        MvcResult result = getClient().post("ignore", getInfo().getId(), "Test");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }
}