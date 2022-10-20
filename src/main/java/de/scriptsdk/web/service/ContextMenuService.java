package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.contextmenu.ContextMenuDto;
import de.scriptsdk.web.dto.contextmenu.ContextMenuHookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContextMenuService {

    public Integer getContextDelay(ApiClient client) {
        return client.getContextDelay();
    }

    public List<String> getContextMenuAsString(ApiClient client) {
        return client.getContextMenuAsString();
    }

    public ContextMenuDto getContextMenuAsRecord(ApiClient client) {
        return new ContextMenuDto(client.getContextMenuAsRecord());
    }

    public void setContextDelay(ApiClient client, Integer delay) {
        client.setContextDelay(delay);
    }

    public void requestContextMenu(ApiClient client, Long objectId) {
        client.requestContextMenu(objectId);
    }

    public void setContextMenuHook(ApiClient client, ContextMenuHookDto contextMenuHook) {
        client.setContextMenuHook(contextMenuHook.getObjectId(), contextMenuHook.getEntryNumber());
    }

    public void clearContextMenu(ApiClient client) {
        client.clearContextMenu();
    }
}
