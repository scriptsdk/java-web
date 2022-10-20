package de.scriptsdk.web.controller;

import de.scriptsdk.core.model.generic.BaseList;
import de.scriptsdk.web.dto.shop.AdvShopInfoDto;
import de.scriptsdk.web.dto.shop.ShopInfoDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ShopService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/{id}/shop")
public class ShopController {
    final ClientService clientService;
    final ShopService shopService;

    public ShopController(ClientService clientService, ShopService shopService) {
        this.clientService = clientService;
        this.shopService = shopService;
    }

    @PostMapping(path = "/autobuy", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void autoBuy(@PathVariable String id, @RequestBody ShopInfoDto shopInfoDto) {
        shopService.autoBuy(clientService.getClient(id), shopInfoDto);
    }

    @GetMapping(path = "/shoplist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody BaseList<String> getShopList(@PathVariable String id) {
        return shopService.getShopList(clientService.getClient(id));
    }

    @DeleteMapping(path = "/shoplist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void clearShopList(@PathVariable String id) {
        shopService.clearShopList(clientService.getClient(id));
    }

    @PostMapping(path = "/autobuyextended", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void autoBuyExtended(@PathVariable String id, @RequestBody AdvShopInfoDto buyInfoDto) {
        shopService.autoBuyExtended(clientService.getClient(id), buyInfoDto);
    }

    @PostMapping(path = "/autosell", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void autoSell(@PathVariable String id, @RequestBody ShopInfoDto shopInfoDto) {
        shopService.autoSell(clientService.getClient(id), shopInfoDto);
    }
}
