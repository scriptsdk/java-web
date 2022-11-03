package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.trade.TradeInfoDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.TradeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{id}/trade")
public class TradeController {
    final ClientService clientService;
    final TradeService tradeService;

    public TradeController(ClientService clientService, TradeService tradeService) {
        this.clientService = clientService;
        this.tradeService = tradeService;
    }

    @PostMapping(path = "confirm", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Confirms an active trade", tags = {"trade"})
    public void confirmTrade(@PathVariable String id, @RequestBody Integer tradeNumber) {
        tradeService.confirmTrade(clientService.getClient(id), tradeNumber);
    }

    @PostMapping(path = "cancel", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Cancel an active trade", tags = {"trade"})
    public @ResponseBody Boolean cancelTrade(@PathVariable String id, @RequestBody Integer tradeNumber) {
        return tradeService.cancelTrade(clientService.getClient(id), tradeNumber);
    }

    @GetMapping(path = "opponent", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of trading opponent", tags = {"trade"})
    public @ResponseBody Long getTradeOpponent(@PathVariable String id, @RequestBody Integer tradeNumber) {
        return tradeService.getTradeOpponent(clientService.getClient(id), tradeNumber);
    }

    @GetMapping(path = "count", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of items in trade window", tags = {"trade"})
    public @ResponseBody Integer getTradeCount(@PathVariable String id) {
        return tradeService.getTradeCount(clientService.getClient(id));
    }

    @GetMapping(path = "opponent-name", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name of trading opponent", tags = {"trade"})
    public @ResponseBody String getTradeOpponentName(@PathVariable String id, @RequestBody Integer tradeNumber) {
        return tradeService.getTradeOpponentName(clientService.getClient(id), tradeNumber);
    }

    @GetMapping(path = "check", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"trade"})
    public @ResponseBody Boolean tradeCheck(@PathVariable String id, @RequestBody TradeInfoDto tradeInfo) {
        return tradeService.tradeCheck(clientService.getClient(id), tradeInfo);
    }

    @GetMapping(path = "check-state", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns state of check", tags = {"trade"})
    public @ResponseBody Boolean checkTradeState(@PathVariable String id) {
        return tradeService.checkTradeState(clientService.getClient(id));
    }

    @GetMapping(path = "container", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns trade container by params", tags = {"trade"})
    public @ResponseBody Long getTradeContainer(@PathVariable String id, @RequestBody TradeInfoDto tradeInfo) {
        return tradeService.getTradeContainer(clientService.getClient(id), tradeInfo);
    }
}
