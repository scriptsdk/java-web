package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.shop.AdvShopInfoDto;
import de.scriptsdk.web.dto.shop.ShopInfoDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ShopService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/shop")
public class ShopController {
    final ClientService clientService;
    final ShopService shopService;

    public ShopController(ClientService clientService, ShopService shopService) {
        this.clientService = clientService;
        this.shopService = shopService;
    }

    @PostMapping(path = "auto-buy", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enables auto buying of certain items", tags = {"shop"})
    public void autoBuy(@PathVariable String id, @RequestBody ShopInfoDto shopInfoDto) {
        shopService.autoBuy(clientService.getClient(id), shopInfoDto);
    }

    @GetMapping(path = "shop-list", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a list of items on a current requested npc shop", tags = {"shop"})
    public @ResponseBody List<String> getShopList(@PathVariable String id) {
        return shopService.getShopList(clientService.getClient(id));
    }

    @DeleteMapping(path = "shop-list")
    @Operation(summary = "Clears a cache of last requested shop list", tags = {"shop"})
    public void clearShopList(@PathVariable String id) {
        shopService.clearShopList(clientService.getClient(id));
    }

    @PostMapping(path = "auto-buy-extended", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enables auto buying of certain items", tags = {"shop"})
    public void autoBuyExtended(@PathVariable String id, @RequestBody AdvShopInfoDto buyInfoDto) {
        shopService.autoBuyExtended(clientService.getClient(id), buyInfoDto);
    }

    @PostMapping(path = "auto-sell", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enables auto selling of certain items", tags = {"shop"})
    public void autoSell(@PathVariable String id, @RequestBody ShopInfoDto shopInfoDto) {
        shopService.autoSell(clientService.getClient(id), shopInfoDto);
    }
}
