package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.assets.TileModelDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

class TargetControllerTest extends AbstractControllerTest {
    protected TargetControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Override
    protected String getBaseUrl() {
        return "/v1/{id}/target";
    }

    @Test
    void getTargetID() {
        Long value = getClient().get("target-id", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isTargetHookIsEnabled() {
        Boolean value = getClient().get("target-hook-enabled", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isTargetPresent() {
        Boolean value = getClient().get("target-present", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void cancelTarget() {
        MvcResult result = getClient().post("cancel-target", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void targetToObject() {
        MvcResult result = getClient().post("target-to-object", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void targetToXYZ() {
        MvcResult result = getClient().post("target-to-xyz", getInfo().getId(), new Point3DDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void targetToTile() {
        MvcResult result = getClient().post("target-to-tile", getInfo().getId(), new TileModelDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetToObject() {
        MvcResult result = getClient().post("wait-target-object", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetToXYZ() {
        MvcResult result = getClient().post("wait-target-xyz", getInfo().getId(), new Point3DDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetToTile() {
        MvcResult result = getClient().post("wait-target-tile", getInfo().getId(), new TileModelDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetSelf() {
        MvcResult result = getClient().post("wait-target-self", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetType() {
        MvcResult result = getClient().post("wait-target-type", getInfo().getId(), 0);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }
    /*


    @Test
    void cancelWaitTarget() throws Exception {
        MvcResult result = post(String.format("%s/%s",getBaseURL(),"wait-target-last"),
        path = "cancel-wait-target";
        MvcResult result = post(getBaseURL(),
                getClientInfo().getId());
        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetGround() throws Exception {
        MvcResult result = post(String.format("%s/%s",getBaseURL(),"wait-target-last"),
        path = "wait-target-ground";
        MvcResult result = post(getBaseURL(),
                getClientInfo().getId());
        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitTargetLast() throws Exception {
        MvcResult result = post(String.format("%s/%s",getBaseURL(),"wait-target-last"),
                getClientInfo().getId());
        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

     */
}