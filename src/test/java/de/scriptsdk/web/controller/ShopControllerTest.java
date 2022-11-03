package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.shop.AdvShopInfoDto;
import de.scriptsdk.web.dto.shop.ShopInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ShopControllerTest extends AbstractControllerTest {

    protected ShopControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void autoBuy() {
        MvcResult result = getClient().post("auto-buy", getInfo().getId(), new ShopInfoDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getShopList() {
        List<String> value = Arrays.stream(getClient().get("shop-list",
                getInfo().getId(), String[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void clearShopList() {
        MvcResult result = getClient().delete("shop-list", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void autoBuyExtended() {
        AdvShopInfoDto param = new AdvShopInfoDto();
        param.setName("Bandage");
        param.setType(0x0E21);
        param.setColor(0);
        param.setAmount(1);
        param.setPrice(50L);

        MvcResult result = getClient().post("auto-buy-extended", getInfo().getId(), param);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void autoSell() {
        MvcResult result = getClient().post("auto-sell", getInfo().getId(), new ShopInfoDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/shop";
    }
}