package de.scriptsdk.web.service;

import de.scriptsdk.api.enums.LanguageType;
import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.api.model.system.Version;
import de.scriptsdk.web.config.ScriptSdkConfig;
import de.scriptsdk.web.dto.client.ClientInfoDto;
import de.scriptsdk.web.exception.ClientException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ClientService {
    final
    ScriptSdkConfig sdkConfig;
    private final ConcurrentHashMap<UUID, ApiClient> clientList;

    public ClientService(ScriptSdkConfig sdkConfig) {
        this.clientList = new ConcurrentHashMap<>();
        this.sdkConfig = sdkConfig;
    }

    public ClientInfoDto register() {
        ApiClient client = new ApiClient(sdkConfig.getServiceUrl(), sdkConfig.getServicePort());

        client.authenticate(LanguageType.OTHER, new Version(1, 0, 0, 0));

        ClientInfoDto info = new ClientInfoDto(client);

        clientList.put(info.getId(), client);

        return info;
    }

    public ClientInfoDto getClientInfo(String id) throws ClientException {
        return new ClientInfoDto(getClient(id));
    }

    public List<ClientInfoDto> getClientInfoList() {
        List<ClientInfoDto> list = new ArrayList<>();

        for (ApiClient client : clientList.values()) {
            list.add(new ClientInfoDto(client));
        }
        return list;
    }

    public ApiClient getClient(String id) throws ClientException {
        return getClient(UUID.fromString(id));
    }

    public ApiClient getClient(UUID id) throws ClientException {
        if (clientList.containsKey(id)) {
            return clientList.get(id);
        }
        throw new ClientException("Unable to find Client with ID %s", id);
    }

    public void unregister(String id) throws ClientException {
        UUID uuid = UUID.fromString(id);
        ApiClient client = getClient(uuid);
        if (Objects.equals(client.revokeAuthentication(), false)) {
            throw new ClientException("Error on unregistering client with ID %s", id);
        }
        clientList.remove(uuid, client);
    }
}
