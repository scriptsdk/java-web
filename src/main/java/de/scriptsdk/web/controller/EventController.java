package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.EventType;
import de.scriptsdk.web.dto.event.*;
import de.scriptsdk.web.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("{id}/event")
public class EventController {

    final ClientService service;

    public EventController(ClientService service) {
        this.service = service;
    }


    @GetMapping(path = "speech-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred speech events", tags = {"event"})
    public List<SpeechEventDto> getSpeechEvent(@PathVariable String id) {
        return service.getEvent(id).getSpeechEvent();
    }

    @GetMapping(path = "draw-game-player-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred drawn player events", tags = {"event"})
    public List<DrawGamePlayerEventDto> getDrawGamePlayerEvent(@PathVariable String id) {
        return service.getEvent(id).getDrawGamePlayerEvent();
    }

    @GetMapping(path = "update-char-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred updated char events", tags = {"event"})
    public List<UpdateCharEventDto> getUpdateCharEvent(@PathVariable String id) {
        return service.getEvent(id).getUpdateCharEvent();
    }

    @GetMapping(path = "draw-object-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred drawn object events", tags = {"event"})
    public List<DrawObjectEventDto> getDrawObjectEvent(@PathVariable String id) {
        return service.getEvent(id).getDrawObjectEvent();
    }

    @GetMapping(path = "add-multiple-items-in-container-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred add multiple items in container events", tags = {"event"})
    public List<AddMultipleItemsInContainerEventDto> getAddMultipleItemsInContainerEvent(@PathVariable String id) {
        return service.getEvent(id).getAddMultipleItemsInContainerEvent();
    }

    @GetMapping(path = "windows-message-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred windows message events", tags = {"event"})
    public List<WindowsMessageEventDto> getWindowsMessageEvent(@PathVariable String id) {
        return service.getEvent(id).getWindowsMessageEvent();
    }

    @GetMapping(path = "move-rejection-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred rejected movement events", tags = {"event"})
    public List<MoveRejectionEventDto> getMoveRejectionEvent(@PathVariable String id) {
        return service.getEvent(id).getMoveRejectionEvent();
    }

    @GetMapping(path = "add-item-to-container-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred add item to container events", tags = {"event"})
    public List<AddItemToContainerEventDto> getAddItemToContainerEvent(@PathVariable String id) {
        return service.getEvent(id).getAddItemToContainerEvent();
    }

    @GetMapping(path = "draw-container-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred drawn container events", tags = {"event"})
    public List<DrawContainerEventDto> getDrawContainerEvent(@PathVariable String id) {
        return service.getEvent(id).getDrawContainerEvent();
    }

    @GetMapping(path = "reject-move-item-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred rejected item movement events", tags = {"event"})
    public List<RejectMoveItemEventDto> getRejectMoveItemEvent(@PathVariable String id) {
        return service.getEvent(id).getRejectMoveItemEvent();
    }

    @GetMapping(path = "menu-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred menu events", tags = {"event"})
    public List<MenuEventDto> getMenuEvent(@PathVariable String id) {
        return service.getEvent(id).getMenuEvent();
    }

    @GetMapping(path = "map-message-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred map message events", tags = {"event"})
    public List<MapMessageEventDto> getMapMessageEvent(@PathVariable String id) {
        return service.getEvent(id).getMapMessageEvent();
    }

    @GetMapping(path = "allow-refuse-attack-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred attack refuse decision events", tags = {"event"})
    public List<AllowRefuseAttackEventDto> getAllowRefuseAttackEvent(@PathVariable String id) {
        return service.getEvent(id).getAllowRefuseAttackEvent();
    }

    @GetMapping(path = "cliloc-speech-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred cliloc speech events", tags = {"event"})
    public List<ClilocSpeechEventDto> getClilocSpeechEvent(@PathVariable String id) {
        return service.getEvent(id).getClilocSpeechEvent();
    }

    @GetMapping(path = "cliloc-speech-affix-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred cliloc speech affix events", tags = {"event"})
    public List<ClilocSpeechAffixEventDto> getClilocSpeechAffixEvent(@PathVariable String id) {
        return service.getEvent(id).getClilocSpeechAffixEvent();
    }

    @GetMapping(path = "unicode-speech-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred unicode speech events", tags = {"event"})
    public List<UnicodeSpeechEventDto> getUnicodeSpeechEvent(@PathVariable String id) {
        return service.getEvent(id).getUnicodeSpeechEvent();
    }

    @GetMapping(path = "buff-debuff-system-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred buff & debuff events", tags = {"event"})
    public List<BuffDebuffSystemEventDto> getBuffDebuffSystemEvent(@PathVariable String id) {
        return service.getEvent(id).getBuffDebuffSystemEvent();
    }

    @GetMapping(path = "char-animation-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred char animation events", tags = {"event"})
    public List<CharAnimationEventDto> getCharAnimationEvent(@PathVariable String id) {
        return service.getEvent(id).getCharAnimationEvent();
    }

    @GetMapping(path = "incoming-gump-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred incoming gump events", tags = {"event"})
    public List<IncomingGumpEventDto> getIncomingGumpEvent(@PathVariable String id) {
        return service.getEvent(id).getIncomingGumpEvent();
    }

    @GetMapping(path = "sound-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred sound events", tags = {"event"})
    public List<SoundEventDto> getSoundEvent(@PathVariable String id) {
        return service.getEvent(id).getSoundEvent();
    }

    @GetMapping(path = "death-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred death events", tags = {"event"})
    public List<DeathEventDto> getDeathEvent(@PathVariable String id) {
        return service.getEvent(id).getDeathEvent();
    }

    @GetMapping(path = "quest-arrow-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred quest arrow events", tags = {"event"})
    public List<QuestArrowEventDto> getQuestArrowEvent(@PathVariable String id) {
        return service.getEvent(id).getQuestArrowEvent();
    }

    @GetMapping(path = "global-chat-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred global chat events", tags = {"event"})
    public List<GlobalChatEventDto> getGlobalChatEvent(@PathVariable String id) {
        return service.getEvent(id).getGlobalChatEvent();
    }

    @GetMapping(path = "graphical-effect-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred graphical effect events", tags = {"event"})
    public List<GraphicalEffectEventDto> getGraphicalEffectEvent(@PathVariable String id) {
        return service.getEvent(id).getGraphicalEffectEvent();
    }

    @GetMapping(path = "irc-Incoming-text-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred incoming text events", tags = {"event"})
    public List<IRCIncomingTextEventDto> getIRCIncomingTextEvent(@PathVariable String id) {
        return service.getEvent(id).getIRCIncomingTextEvent();
    }

    @GetMapping(path = "gump-text-entry-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred gump text entry events", tags = {"event"})
    public List<GumpTextEntryEventDto> getGumpTextEntryEvent(@PathVariable String id) {
        return service.getEvent(id).getGumpTextEntryEvent();
    }

    @GetMapping(path = "update-object-status-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred updated object status events", tags = {"event"})
    public List<UpdateObjectStatusEventDto> getUpdateObjectStatusEvent(@PathVariable String id) {
        return service.getEvent(id).getUpdateObjectStatusEvent();
    }

    @GetMapping(path = "set-global-var-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred global variable config events", tags = {"event"})
    public List<SetGlobalVarEventDto> getSetGlobalVarEvent(@PathVariable String id) {
        return service.getEvent(id).getSetGlobalVarEvent();
    }

    @GetMapping(path = "party-invite-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred party invitation events", tags = {"event"})
    public List<PartyInviteEventDto> getPartyInviteEvent(@PathVariable String id) {
        return service.getEvent(id).getPartyInviteEvent();
    }

    @GetMapping(path = "item-info-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred item info events", tags = {"event"})
    public List<ItemInfoEventDto> getItemInfoEvent(@PathVariable String id) {
        return service.getEvent(id).getItemInfoEvent();
    }

    @GetMapping(path = "item-deleted-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred item deletion events", tags = {"event"})
    public List<ItemDeletedEventDto> getItemDeletedEvent(@PathVariable String id) {
        return service.getEvent(id).getItemDeletedEvent();
    }

    @GetMapping(path = "timer1-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred timer #1 events", tags = {"event"})
    public List<LocalDateTime> getTimer1Event(@PathVariable String id) {
        return service.getEvent(id).getTimer1Event();
    }

    @GetMapping(path = "timer2-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred timer #2 events", tags = {"event"})
    public List<LocalDateTime> getTimer2Event(@PathVariable String id) {
        return service.getEvent(id).getTimer2Event();
    }

    @GetMapping(path = "client-send-resync-events", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns occurred client resync events", tags = {"event"})
    public List<LocalDateTime> getClientSendResyncEvent(@PathVariable String id) {
        return service.getEvent(id).getClientSendResyncEvent();
    }

    @GetMapping(path = "count", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of retrievable entries by event type", tags = {"event"})
    public @ResponseBody Integer getCount(@PathVariable String id, @RequestBody EventType type) {
        return service.getEvent(id).getCount(type);
    }

    @PostMapping(path = "subscribe", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Registers new event", tags = {"event"})
    public void subscribe(@PathVariable String id, @RequestBody EventType type) {
        service.getEvent(id).subscribe(type);
    }

    @DeleteMapping(path = "unsubscribe", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Unregisters existing event", tags = {"event"})
    public void unsubscribe(@PathVariable String id, @RequestBody EventType type) {
        service.getEvent(id).unsubscribe(type);
    }
}
