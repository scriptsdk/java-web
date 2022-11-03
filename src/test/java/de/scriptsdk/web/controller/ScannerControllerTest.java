package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.scanner.FindNotorietyDto;
import de.scriptsdk.web.dto.scanner.FindTypeDto;
import de.scriptsdk.web.dto.scanner.FindTypesDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ScannerControllerTest extends AbstractControllerTest {

    protected ScannerControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void findType() {
        MvcResult result = getClient().post("find-by-type", getInfo().getId(), new FindTypeDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void findNotoriety() {
        MvcResult result = getClient().post("find-by-notoriety", getInfo().getId(), new FindNotorietyDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void findAtCoordination() {
        MvcResult result = getClient().post("find-by-coordination", getInfo().getId(), new Point2DDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void ignore() {
        MvcResult result = getClient().post("ignore", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void removeFromIgnoreList() {
        MvcResult result = getClient().post("remove-from-ignore-list", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void resetIgnoreList() {
        MvcResult result = getClient().delete("ignore-list", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getIgnoreList() {
        List<Long> value = Arrays.stream(getClient().get("ignore-list",
                getInfo().getId(), Long[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getFindList() {
        List<Long> value = Arrays.stream(getClient().get("list",
                getInfo().getId(), Long[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getFindItem() {
        Long value = getClient().get("item", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getFindCount() {
        Integer value = getClient().get("count", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getFindQuantity() {
        Integer value = getClient().get("quantity", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getFindTotalQuantity() {
        Integer value = getClient().get("total-quantity", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void findTypes() {
        MvcResult result = getClient().post("find-by-list", getInfo().getId(), new FindTypesDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/scanner";
    }
}