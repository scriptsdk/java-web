package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.core.model.generic.BaseList;
import de.scriptsdk.web.dto.shop.AdvShopInfoDto;
import de.scriptsdk.web.dto.shop.ShopInfoDto;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
    public void autoBuy(ApiClient client, ShopInfoDto shopInfoDto) {
        client.autoBuy(shopInfoDto.getType(), shopInfoDto.getColor(), shopInfoDto.getAmount());
    }

    public BaseList<String> getShopList(ApiClient client) {
        return client.getShopList();
    }

    public void clearShopList(ApiClient client) {
        client.clearShopList();
    }

    public void autoBuyExtended(ApiClient client, AdvShopInfoDto buyInfoDto) {
        client.autoBuyExtended(buyInfoDto.getType(), buyInfoDto.getColor(),
                buyInfoDto.getAmount(), buyInfoDto.getPrice(), buyInfoDto.getName());
    }

    public void autoSell(ApiClient client, ShopInfoDto shopInfoDto) {
        client.autoSell(shopInfoDto.getType(), shopInfoDto.getColor(), shopInfoDto.getAmount());
    }
}
