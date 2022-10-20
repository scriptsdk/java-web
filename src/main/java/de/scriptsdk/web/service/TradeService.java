package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.trade.TradeInfoDto;
import org.springframework.stereotype.Service;

@Service
public class TradeService {
    public void confirmTrade(ApiClient client, Integer tradeNumber) {
        client.confirmTrade(tradeNumber);
    }

    public Boolean cancelTrade(ApiClient client, Integer tradeNumber) {
        return client.cancelTrade(tradeNumber);
    }

    public Long getTradeOpponent(ApiClient client, Integer tradeNumber) {
        return client.getTradeOpponent(tradeNumber);
    }

    public Integer getTradeCount(ApiClient client) {
        return client.getTradeCount();
    }

    public String getTradeOpponentName(ApiClient client, Integer tradeNumber) {
        return client.getTradeOpponentName(tradeNumber);
    }

    public Boolean tradeCheck(ApiClient client, TradeInfoDto tradeInfo) {
        return client.tradeCheck(tradeInfo.getTradeIndex(), tradeInfo.getNumber());
    }

    public Boolean checkTradeState(ApiClient client) {
        return client.checkTradeState();
    }

    public Long getTradeContainer(ApiClient client, TradeInfoDto tradeInfo) {
        return client.getTradeContainer(tradeInfo.getTradeIndex(), tradeInfo.getNumber());
    }
}
