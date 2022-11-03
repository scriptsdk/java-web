package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.journal.InJournalBetweenTimeDto;
import de.scriptsdk.web.dto.journal.JournalLineDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

class JournalControllerTest extends AbstractControllerTest {

    protected JournalControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getFoundParamID() {
        Integer value = getClient().get("found-param-id", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineID() {
        Integer value = getClient().get("line-id", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineType() {
        Integer value = getClient().get("line-type", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineTime() {
        LocalDateTime value = getClient().get("line-time", getInfo().getId(), LocalDateTime.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalMessageLineType() {
        Integer value = getClient().get("message-line-type", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineColor() {
        Integer value = getClient().get("line-color", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineFont() {
        Integer value = getClient().get("line-font", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineIndex() {
        Integer value = getClient().get("line-index", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineCount() {
        Integer value = getClient().get("line-count", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getJournalLineName() {
        String value = getClient().get("line-name", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isInJournal() {
        Integer value = getClient().get("is-in-journal", getInfo().getId(), Integer.class, "Hello World");

        Assertions.assertNotNull(value);
    }

    @Test
    void addJournalIgnore() {
        MvcResult result = getClient().post("ignore-line", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearJournal() {
        MvcResult result = getClient().delete("clear-journal", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getLastJournalMessage() {
        String value = getClient().get("last-message", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void inJournal() {
        Integer value = getClient().get("in-journal", getInfo().getId(), Integer.class, "Hello World");

        Assertions.assertNotNull(value);
    }

    @Test
    void inJournalBetweenTime() {
        Integer value = getClient().get("journal-between-time", getInfo().getId(), Integer.class, new InJournalBetweenTimeDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void journal() {
        String value = getClient().get("journal", getInfo().getId(), String.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void setJournalLine() {
        MvcResult result = getClient().post("line", getInfo().getId(), new JournalLineDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getLowJournal() {
        Integer value = getClient().get("low-journal", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getHighJournal() {
        Integer value = getClient().get("high-journal", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void addToJournal() {
        MvcResult result = getClient().post("add-to-journal", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearJournalIgnore() {
        MvcResult result = getClient().delete("clear-journal-ignore", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/journal";
    }
}