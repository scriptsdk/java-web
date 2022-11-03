package de.scriptsdk.web.dto.client;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.core.enums.network.ScriptState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientInfoDto {
    private ScriptState state = ScriptState.UNKNOWN;
    private Integer port = 0;
    private String url = "";
    private UUID id = null;

    public ClientInfoDto(ApiClient client) {
        this();

        this.setId(client.getApiClientId());
        this.setUrl(client.getApiClientUrl());
        this.setPort(client.getApiClientPort());
        this.setState(client.getApiClientScriptState());
    }
}
