package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    public void joinGlobalChatChannel(ApiClient client, String channelName) {
        client.joinGlobalChatChannel(channelName);
    }

    public void leaveGlobalChatChannel(ApiClient client) {
        client.leaveGlobalChatChannel();
    }

    public void sendGlobalChannelChatMessage(ApiClient client, String messageText) {
        client.sendGlobalChannelChatMessage(messageText);
    }

    public String getActiveGlobalChatChannel(ApiClient client) {
        return client.getActiveGlobalChatChannel();
    }

    public List<String> getGlobalChannelList(ApiClient client) {
        return client.getGlobalChannelList();
    }

    public void clearChatUserIgnore(ApiClient client) {
        client.clearChatUserIgnore();
    }

    public void addChatUserIgnore(ApiClient client, String userName) {
        client.addChatUserIgnore(userName);
    }
}
