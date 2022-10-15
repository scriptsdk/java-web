package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.client.ClientInfoDto;
import de.scriptsdk.web.exception.ClientException;
import de.scriptsdk.web.service.ClientService;
import org.springframework.context.annotation.Description;
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
    @Description("Creates a new instance of ApiClient and returns meta information's.")
    public @ResponseBody ClientInfoDto register() {
        return clientService.register();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("Returns information about existing instance of ApiClient")
    public @ResponseBody ClientInfoDto getClientInfo(@PathVariable String id) throws ClientException {
        return clientService.getClientInfo(id);
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("Returns information about existing instance of ApiClient")
    public @ResponseBody List<ClientInfoDto> getClientInfoList() {
        return clientService.getClientInfoList();
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("Removes an instance of ApiClient.")
    public void unregister(@PathVariable String id) throws ClientException {
        clientService.unregister(id);
    }
    /*
    public Boolean isStealthRunning() {}

     */
}
