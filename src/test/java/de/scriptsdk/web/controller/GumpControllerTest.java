package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.gump.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class GumpControllerTest extends AbstractControllerTest {

    protected GumpControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void clearGumpsIgnore() {
        MvcResult result = getClient().delete("clear-ignore", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitGumpInt() {
        MvcResult result = getClient().post("wait-for-gump", getInfo().getId(), 0);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void waitGumpTextEntry() {
        MvcResult result = getClient().post("wait-text-entry", getInfo().getId(), " ");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void gumpAutoTextEntry() {
        MvcResult result = getClient().post("auto-text-entry", getInfo().getId(), new AutoTextEntryDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void gumpAutoRadiobutton() {
        MvcResult result = getClient().post("auto-radio-button", getInfo().getId(), new AutoRadioButtonDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void gumpAutoCheckBox() {
        MvcResult result = getClient().post("auto-check-box", getInfo().getId(), new AutoCheckBoxDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clickGumpButton() {
        MvcResult result = getClient().post("edit-button", getInfo().getId(), new ButtonEditDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void editGumpTextEntry() {
        Boolean value = getClient().post("edit-text-entry", getInfo().getId(), Boolean.class, new TextEntryEditDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void editGumpRadioButton() {
        Boolean value = getClient().post("edit-radio-button", getInfo().getId(), Boolean.class, new RadioEditButtonDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void editGumpCheckBox() {
        Boolean value = getClient().post("edit-check-box", getInfo().getId(), Boolean.class, new CheckBoxEditDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpsCount() {
        Integer value = getClient().get("count", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void closeSimpleGump() {
        MvcResult result = getClient().post("simple-close", getInfo().getId(), 0);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getGumpSerial() {
        Long value = getClient().get("gump-serial", getInfo().getId(), Long.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpID() {
        Long value = getClient().get("gump-id", getInfo().getId(), Long.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpNoClose() {
        Boolean value = getClient().get("is-closable", getInfo().getId(), Boolean.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpTextLines() {
        List<String> value = Arrays.stream(getClient().get("text-lines", getInfo().getId(), String[].class, 0)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpFullLines() {
        List<String> value = Arrays.stream(getClient().get("full-lines", getInfo().getId(), String[].class, 0)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpShortLines() {
        List<String> value = Arrays.stream(getClient().get("short-lines", getInfo().getId(), String[].class, 0)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpButtonsDescription() {
        List<String> value = Arrays.stream(getClient().get("button-description", getInfo().getId(), String[].class, 0)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpInfo() {
        GumpDto value = getClient().get("gump-info", getInfo().getId(), GumpDto.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void addGumpIgnoreByID() {
        MvcResult result = getClient().post("ignore-by-id", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void addGumpIgnoreBySerial() {
        MvcResult result = getClient().post("ignore-by-serial", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void closeClientGump() {
        MvcResult result = getClient().post("close", getInfo().getId(), 0);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/gumps";
    }
}