package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.api.model.system.ScriptItemInfoResponse;
import de.scriptsdk.core.enums.network.ScriptState;
import de.scriptsdk.web.dto.script.ExtendedScriptInfoDto;
import de.scriptsdk.web.dto.script.ScriptInfoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScriptService {
    public Integer getScriptCount(ApiClient client) {
        return client.getScriptCount();
    }

    public String getScriptPath(ApiClient client, Integer index) {
        return client.getScriptPath(index);
    }

    public ScriptState getScriptState(ApiClient client, Integer index) {
        return client.getScriptState(index);
    }

    public Integer startScript(ApiClient client, String scriptPath) {
        return client.startScript(scriptPath);
    }

    public void stopScript(ApiClient client, Integer index) {
        client.stopScript(index);
    }

    public void pauseOrResumeSelectedScript(ApiClient client, Integer index) {
        client.pauseOrResumeSelectedScript(index);
    }

    public void stopAllScripts(ApiClient client) {
        client.stopAllScripts();
    }

    public void setScriptName(ApiClient client, ScriptInfoDto scriptInfoDto) {
        client.setScriptName(scriptInfoDto.getIndex(), scriptInfoDto.getName());
    }

    public String getScriptName(ApiClient client, Integer index) {
        return client.getScriptName(index);
    }

    public ExtendedScriptInfoDto getScriptParameter(ApiClient client) {
        return new ExtendedScriptInfoDto(client.getScriptParameter());
    }

    public List<ScriptItemInfoDto> getScriptItems(ApiClient client) {
        List<ScriptItemInfoResponse> returnables = client.getScriptItems();

        List<ScriptItemInfoDto> list = new ArrayList<>();
        if (returnables != null) {
            for (ScriptItemInfoResponse response : returnables) {
                list.add(new ScriptItemInfoDto(response));
            }
        }
        return list;
    }
}
