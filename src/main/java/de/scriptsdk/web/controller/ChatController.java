package de.scriptsdk.web.controller;

import de.scriptsdk.web.service.ChatService;
import de.scriptsdk.web.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/chat")
public class ChatController {
    final ChatService chatService;
    final ClientService clientService;

    public ChatController(ChatService chatService, ClientService clientService) {
        this.chatService = chatService;
        this.clientService = clientService;
    }

    @PostMapping(path = "join", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Joins a chat channel", tags = {"chat"})
    public void joinGlobalChatChannel(@PathVariable String id, @RequestBody String channelName) {
        chatService.joinGlobalChatChannel(clientService.getClient(id), channelName);
    }

    @PostMapping(path = "leave")
    @Operation(summary = "Leaves a chat channel", tags = {"chat"})
    public void leaveGlobalChatChannel(@PathVariable String id) {
        chatService.leaveGlobalChatChannel(clientService.getClient(id));
    }

    @PostMapping(path = "message", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Writes message into chat channel", tags = {"chat"})
    public void sendGlobalChannelChatMessage(@PathVariable String id, @RequestBody String messageText) {
        chatService.sendGlobalChannelChatMessage(clientService.getClient(id), messageText);
    }

    @GetMapping(path = "active-channel", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name of active chat channel", tags = {"chat"})
    public @ResponseBody String getActiveGlobalChatChannel(@PathVariable String id) {
        return chatService.getActiveGlobalChatChannel(clientService.getClient(id));
    }

    @GetMapping(path = "channel-list", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns list of chat channels", tags = {"chat"})
    public @ResponseBody List<String> getGlobalChannelList(@PathVariable String id) {
        return chatService.getGlobalChannelList(clientService.getClient(id));
    }

    @DeleteMapping(path = "reset-ignore", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Resets user ignore list", tags = {"chat"})
    public void clearChatUserIgnore(@PathVariable String id) {
        chatService.clearChatUserIgnore(clientService.getClient(id));
    }

    @PostMapping(path = "ignore", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Ignores chat user", tags = {"chat"})
    public void addChatUserIgnore(@PathVariable String id, @RequestBody String userName) {
        chatService.addChatUserIgnore(clientService.getClient(id), userName);
    }
}
