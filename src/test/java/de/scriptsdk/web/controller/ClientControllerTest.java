package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractTest;
import de.scriptsdk.web.dto.client.ClientInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClientControllerTest extends AbstractTest {

    final String uri = "/client";
    final String uriWithId = String.format("%s/{id}", uri);

    @Test
    void TestFullController() throws Exception {
        MvcResult mvcResult = getMvc().perform(MockMvcRequestBuilders.post(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        ClientInfoDto client = super.mapFromJson(content, ClientInfoDto.class);
        assertNotNull(client.getId());

        mvcResult = getMvc().perform(MockMvcRequestBuilders.get(uriWithId, client.getId())
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
        content = mvcResult.getResponse().getContentAsString();
        ClientInfoDto clientInfo = super.mapFromJson(content, ClientInfoDto.class);
        assertNotNull(client.getId());
        Assertions.assertEquals(clientInfo.getId(), client.getId());

        mvcResult = getMvc().perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
        content = mvcResult.getResponse().getContentAsString();
        List<ClientInfoDto> list = Arrays.stream(super.mapFromJson(content, ClientInfoDto[].class)).toList();
        Assertions.assertNotEquals(0, list.size());

        mvcResult = getMvc().perform(MockMvcRequestBuilders.delete(uriWithId, client.getId())
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }
}