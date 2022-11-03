package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.book.BookHeaderDto;
import de.scriptsdk.web.dto.book.BookPageTextDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

class BookControllerTest extends AbstractControllerTest {

    protected BookControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getBookPageText() {
        String value = getClient().get("page-text", getInfo().getId(), String.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void setBookText() {
        MvcResult result = getClient().post("text", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setBookPageText() {
        MvcResult result = getClient().post("page-text", getInfo().getId(), new BookPageTextDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearBookText() {
        MvcResult result = getClient().delete("text", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setBookHeader() {
        MvcResult result = getClient().post("header", getInfo().getId(), new BookHeaderDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/books";
    }
}