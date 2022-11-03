package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.menu.MenuCaptionDto;
import de.scriptsdk.web.dto.menu.MenuResponseDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class MenuControllerTest extends AbstractControllerTest {

    protected MenuControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void waitMenu() {
        MvcResult result = getClient().post("wait-menu", getInfo().getId(), new MenuCaptionDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void autoMenu() {
        MvcResult result = getClient().post("auto-menu", getInfo().getId(), new MenuCaptionDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void menuHookPresent() {
        Boolean value = getClient().get("menu-hook-present", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void menuPresent() {
        Boolean value = getClient().get("menu-present", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void cancelMenu() {
        MvcResult result = getClient().post("cancel", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void closeMenu() {
        MvcResult result = getClient().post("close", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getLastMenuItems() {
        List<String> value = Arrays.stream(getClient().get("last-menu-items",
                getInfo().getId(), String[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getMenuItemsAsString() {
        List<String> value = Arrays.stream(getClient().get("menu-items-as-string",
                getInfo().getId(), String[].class, " ")).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getMenuItems() {
        List<MenuResponseDto> value = Arrays.stream(getClient().get("menu-items",
                getInfo().getId(), MenuResponseDto[].class, " ")).toList();

        Assertions.assertNotNull(value);
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/menu";
    }
}