package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.trade.TradeInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

class TradeControllerTest extends AbstractControllerTest {

    protected TradeControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Override
    protected String getBaseUrl() {
        return "/v1/{id}/trade";
    }

    @Test
    void getTradeCount() {

        Integer value = getClient().get("count", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void confirmTrade() {
        MvcResult result = getClient().post("confirm", getInfo().getId(), 0);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void cancelTrade() {
        Boolean value = getClient().post("cancel", getInfo().getId(), Boolean.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void getTradeOpponent() {
        Long value = getClient().get("opponent", getInfo().getId(), Long.class, 0);

        Assertions.assertNotNull(value);
    }


    @Test
    void getTradeOpponentName() {
        String value = getClient().get("opponent-name", getInfo().getId(), String.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void tradeCheck() {
        Boolean value = getClient().get("check", getInfo().getId(), Boolean.class, new TradeInfoDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void checkTradeState() {
        Boolean value = getClient().get("check-state", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getTradeContainer() {
        Long value = getClient().get("container", getInfo().getId(), Long.class, new TradeInfoDto());

        Assertions.assertNotNull(value);

    }
}