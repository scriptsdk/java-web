package de.scriptsdk.web.dto.client;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.core.enums.network.ScriptState;

import java.util.UUID;

public class ClientInfoDto {
    private ScriptState state;
    private Integer port;
    private String url;
    private UUID id;

    public ClientInfoDto() {

    }

    public ClientInfoDto(ApiClient client) {
        this();

        this.setId(client.getApiClientId());
        this.setUrl(client.getApiClientUrl());
        this.setPort(client.getApiClientPort());
        this.setState(client.getApiClientScriptState());
    }

    public ScriptState getState() {
        return state;
    }

    public void setState(ScriptState state) {
        this.state = state;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
