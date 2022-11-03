package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.client.ClientInfoDto;
import de.scriptsdk.web.dto.client.PingRequestDto;
import de.scriptsdk.web.exception.ClientException;
import de.scriptsdk.web.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("client")
public class ClientController {

    final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Register new single api client instance", tags = {"client"})
    public @ResponseBody ClientInfoDto register() {
        return clientService.register();
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns information's about single api client", tags = {"client"})
    public @ResponseBody ClientInfoDto getClientInfo(@PathVariable String id) throws ClientException {
        return clientService.getClientInfo(id);
    }

    @GetMapping(path = "client-list", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns list of all api clients", tags = {"client"})
    public @ResponseBody List<ClientInfoDto> getClientInfoList() {
        return clientService.getClientInfoList();
    }

    @DeleteMapping(path = "{id}")
    @Operation(summary = "Delete instance of api client", tags = {"client"})
    public void unregister(@PathVariable String id) throws ClientException {
        clientService.unregister(id);
    }

    @GetMapping(path = "stealth-is-running", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Validate if Stealth instance is running", tags = {"client"})
    public @ResponseBody Boolean isStealthRunning() throws ClientException {
        return clientService.isStealthRunning();
    }

    @GetMapping(path = "ping", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Determines connectivity towards a server", tags = {"client"})
    public @ResponseBody Integer getPing(PingRequestDto object) throws ClientException {
        return clientService.getPing(object);
    }
}
