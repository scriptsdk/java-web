package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractTest;
import de.scriptsdk.web.dto.client.ClientInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ClientControllerTest extends AbstractTest {
    protected ClientControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void register() {
        ClientInfoDto info = getClient().post(ClientInfoDto.class);

        Assertions.assertNotNull(info);

        getClient().delete("{id}", info.getId());
    }

    @Test
    void getGetClientInfo() {
        ClientInfoDto info = getClient().post(ClientInfoDto.class);

        ClientInfoDto client2 = getClient().get("{id}", info.getId(), ClientInfoDto.class);

        Assertions.assertEquals(client2.getId(), info.getId());

        getClient().delete("{id}", info.getId());
    }

    @Test
    void getClientInfoList() {
        List<ClientInfoDto> list = Arrays.stream(getClient().get("client-list", ClientInfoDto[].class)).toList();
        Assertions.assertEquals(0, list.size());
    }

    @Test
    void isStealthRunning() {
        Boolean isRunning = getClient().get("stealth-is-running", Boolean.class);

        Assertions.assertEquals(true, isRunning);
    }

    @Test
    void unregister() {
        ClientInfoDto info = getClient().post(ClientInfoDto.class);
        Assertions.assertNotNull(info);

        MvcResult result = getClient().delete("{id}", info.getId());
        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "/v1/client";
    }

}