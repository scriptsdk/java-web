package de.scriptsdk.web.service;


import de.scriptsdk.api.enums.EventType;
import de.scriptsdk.api.model.entity.ApiEntity;
import de.scriptsdk.api.model.event.*;
import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.core.exceptions.BaseException;
import de.scriptsdk.web.dto.event.*;
import de.scriptsdk.web.model.event.AdvancedActionEventStack;
import de.scriptsdk.web.model.event.EventActionStack;

import java.time.LocalDateTime;
import java.util.List;

public class EventService extends ApiEntity {

    private static final String EXCEPTION_TEXT = "Unsupported event %s";

    private final AdvancedActionEventStack<ItemInfoEvent, ItemInfoEventDto> infoEventActionEvent = new AdvancedActionEventStack<>(ItemInfoEventDto.class);
    private final AdvancedActionEventStack<ItemDeletedEvent, ItemDeletedEventDto> itemDeletedEventActionEvent = new AdvancedActionEventStack<>(ItemDeletedEventDto.class);
    private final AdvancedActionEventStack<SpeechEvent, SpeechEventDto> speechEventActionEvent = new AdvancedActionEventStack<>(SpeechEventDto.class);
    private final AdvancedActionEventStack<DrawGamePlayerEvent, DrawGamePlayerEventDto> drawGamePlayerEventActionEvent = new AdvancedActionEventStack<>(DrawGamePlayerEventDto.class);
    private final AdvancedActionEventStack<UpdateCharEvent, UpdateCharEventDto> updateCharEventActionEvent = new AdvancedActionEventStack<>(UpdateCharEventDto.class);
    private final AdvancedActionEventStack<DrawObjectEvent, DrawObjectEventDto> drawObjectEventActionEvent = new AdvancedActionEventStack<>(DrawObjectEventDto.class);
    private final AdvancedActionEventStack<AddMultipleItemsInContainerEvent, AddMultipleItemsInContainerEventDto> addMultipleItemsInContainerEventActionEvent = new AdvancedActionEventStack<>(AddMultipleItemsInContainerEventDto.class);
    private final AdvancedActionEventStack<WindowsMessageEvent, WindowsMessageEventDto> windowsMessageEventActionEvent = new AdvancedActionEventStack<>(WindowsMessageEventDto.class);
    private final AdvancedActionEventStack<MoveRejectionEvent, MoveRejectionEventDto> moveRejectionEventActionEvent = new AdvancedActionEventStack<>(MoveRejectionEventDto.class);
    private final AdvancedActionEventStack<AddItemToContainerEvent, AddItemToContainerEventDto> addItemToContainerEventActionEvent = new AdvancedActionEventStack<>(AddItemToContainerEventDto.class);
    private final AdvancedActionEventStack<DrawContainerEvent, DrawContainerEventDto> drawContainerEventActionEvent = new AdvancedActionEventStack<>(DrawContainerEventDto.class);
    private final AdvancedActionEventStack<RejectMoveItemEvent, RejectMoveItemEventDto> rejectMoveItemEventActionEvent = new AdvancedActionEventStack<>(RejectMoveItemEventDto.class);
    private final AdvancedActionEventStack<MenuEvent, MenuEventDto> menuEventActionEvent = new AdvancedActionEventStack<>(MenuEventDto.class);
    private final AdvancedActionEventStack<MapMessageEvent, MapMessageEventDto> mapMessageEventActionEvent = new AdvancedActionEventStack<>(MapMessageEventDto.class);
    private final AdvancedActionEventStack<AllowRefuseAttackEvent, AllowRefuseAttackEventDto> allowRefuseAttackEventActionEvent = new AdvancedActionEventStack<>(AllowRefuseAttackEventDto.class);
    private final AdvancedActionEventStack<ClilocSpeechEvent, ClilocSpeechEventDto> clilocSpeechEventActionEvent = new AdvancedActionEventStack<>(ClilocSpeechEventDto.class);
    private final AdvancedActionEventStack<ClilocSpeechAffixEvent, ClilocSpeechAffixEventDto> clilocSpeechAffixEventActionEvent = new AdvancedActionEventStack<>(ClilocSpeechAffixEventDto.class);
    private final AdvancedActionEventStack<UnicodeSpeechEvent, UnicodeSpeechEventDto> unicodeSpeechEventActionEvent = new AdvancedActionEventStack<>(UnicodeSpeechEventDto.class);
    private final AdvancedActionEventStack<BuffDebuffSystemEvent, BuffDebuffSystemEventDto> buffDebuffSystemEventActionEvent = new AdvancedActionEventStack<>(BuffDebuffSystemEventDto.class);
    private final AdvancedActionEventStack<CharAnimationEvent, CharAnimationEventDto> charAnimationEventActionEvent = new AdvancedActionEventStack<>(CharAnimationEventDto.class);
    private final AdvancedActionEventStack<IncomingGumpEvent, IncomingGumpEventDto> incomingGumpEventActionEvent = new AdvancedActionEventStack<>(IncomingGumpEventDto.class);
    private final AdvancedActionEventStack<SoundEvent, SoundEventDto> soundEventActionEvent = new AdvancedActionEventStack<>(SoundEventDto.class);
    private final AdvancedActionEventStack<DeathEvent, DeathEventDto> deathEventActionEvent = new AdvancedActionEventStack<>(DeathEventDto.class);
    private final AdvancedActionEventStack<QuestArrowEvent, QuestArrowEventDto> questArrowEventActionEvent = new AdvancedActionEventStack<>(QuestArrowEventDto.class);
    private final AdvancedActionEventStack<GlobalChatEvent, GlobalChatEventDto> globalChatEventActionEvent = new AdvancedActionEventStack<>(GlobalChatEventDto.class);
    private final AdvancedActionEventStack<GraphicalEffectEvent, GraphicalEffectEventDto> graphicalEffectEventActionEvent = new AdvancedActionEventStack<>(GraphicalEffectEventDto.class);
    private final AdvancedActionEventStack<GumpTextEntryEvent, GumpTextEntryEventDto> gumpTextEntryEventActionEvent = new AdvancedActionEventStack<>(GumpTextEntryEventDto.class);
    private final AdvancedActionEventStack<IRCIncomingTextEvent, IRCIncomingTextEventDto> ircIncomingTextEventActionEvent = new AdvancedActionEventStack<>(IRCIncomingTextEventDto.class);
    private final AdvancedActionEventStack<MapPinEvent, MapPinEventDto> mapPinEventActionEvent = new AdvancedActionEventStack<>(MapPinEventDto.class);
    private final AdvancedActionEventStack<PartyInviteEvent, PartyInviteEventDto> partyInviteEventActionEvent = new AdvancedActionEventStack<>(PartyInviteEventDto.class);
    private final AdvancedActionEventStack<SetGlobalVarEvent, SetGlobalVarEventDto> setGlobalVarEventActionEvent = new AdvancedActionEventStack<>(SetGlobalVarEventDto.class);
    private final AdvancedActionEventStack<UpdateObjectStatusEvent, UpdateObjectStatusEventDto> updateObjectStatusEventActionEvent = new AdvancedActionEventStack<>(UpdateObjectStatusEventDto.class);
    private final EventActionStack timer1Event = new EventActionStack();
    private final EventActionStack timer2Event = new EventActionStack();
    private final EventActionStack clientSendResyncEvent = new EventActionStack();

    protected EventService(ApiClient client) {
        super(client);
    }

    public List<SpeechEventDto> getSpeechEvent() {
        return speechEventActionEvent.pop();
    }

    public List<DrawGamePlayerEventDto> getDrawGamePlayerEvent() {
        return drawGamePlayerEventActionEvent.pop();
    }

    public List<UpdateCharEventDto> getUpdateCharEvent() {
        return updateCharEventActionEvent.pop();
    }

    public List<DrawObjectEventDto> getDrawObjectEvent() {
        return drawObjectEventActionEvent.pop();
    }

    public List<AddMultipleItemsInContainerEventDto> getAddMultipleItemsInContainerEvent() {
        return addMultipleItemsInContainerEventActionEvent.pop();
    }

    public List<WindowsMessageEventDto> getWindowsMessageEvent() {
        return windowsMessageEventActionEvent.pop();
    }

    public List<MoveRejectionEventDto> getMoveRejectionEvent() {
        return moveRejectionEventActionEvent.pop();
    }

    public List<AddItemToContainerEventDto> getAddItemToContainerEvent() {
        return addItemToContainerEventActionEvent.pop();
    }

    public List<DrawContainerEventDto> getDrawContainerEvent() {
        return drawContainerEventActionEvent.pop();
    }

    public List<RejectMoveItemEventDto> getRejectMoveItemEvent() {
        return rejectMoveItemEventActionEvent.pop();
    }

    public List<MenuEventDto> getMenuEvent() {
        return menuEventActionEvent.pop();
    }

    public List<MapMessageEventDto> getMapMessageEvent() {
        return mapMessageEventActionEvent.pop();
    }

    public List<AllowRefuseAttackEventDto> getAllowRefuseAttackEvent() {
        return allowRefuseAttackEventActionEvent.pop();
    }

    public List<ClilocSpeechEventDto> getClilocSpeechEvent() {
        return clilocSpeechEventActionEvent.pop();
    }

    public List<ClilocSpeechAffixEventDto> getClilocSpeechAffixEvent() {
        return clilocSpeechAffixEventActionEvent.pop();
    }

    public List<UnicodeSpeechEventDto> getUnicodeSpeechEvent() {
        return unicodeSpeechEventActionEvent.pop();
    }

    public List<BuffDebuffSystemEventDto> getBuffDebuffSystemEvent() {
        return buffDebuffSystemEventActionEvent.pop();
    }

    public List<CharAnimationEventDto> getCharAnimationEvent() {
        return charAnimationEventActionEvent.pop();
    }

    public List<IncomingGumpEventDto> getIncomingGumpEvent() {
        return incomingGumpEventActionEvent.pop();
    }

    public List<SoundEventDto> getSoundEvent() {
        return soundEventActionEvent.pop();
    }

    public List<DeathEventDto> getDeathEvent() {
        return deathEventActionEvent.pop();
    }

    public List<QuestArrowEventDto> getQuestArrowEvent() {
        return questArrowEventActionEvent.pop();
    }

    public List<GlobalChatEventDto> getGlobalChatEvent() {
        return globalChatEventActionEvent.pop();
    }

    public List<GraphicalEffectEventDto> getGraphicalEffectEvent() {
        return graphicalEffectEventActionEvent.pop();
    }

    public List<IRCIncomingTextEventDto> getIRCIncomingTextEvent() {
        return ircIncomingTextEventActionEvent.pop();
    }

    public List<GumpTextEntryEventDto> getGumpTextEntryEvent() {
        return gumpTextEntryEventActionEvent.pop();
    }

    public List<UpdateObjectStatusEventDto> getUpdateObjectStatusEvent() {
        return updateObjectStatusEventActionEvent.pop();
    }

    public List<SetGlobalVarEventDto> getSetGlobalVarEvent() {
        return setGlobalVarEventActionEvent.pop();
    }

    public List<PartyInviteEventDto> getPartyInviteEvent() {
        return partyInviteEventActionEvent.pop();
    }

    public List<ItemInfoEventDto> getItemInfoEvent() {
        return infoEventActionEvent.pop();
    }

    public List<ItemDeletedEventDto> getItemDeletedEvent() {
        return itemDeletedEventActionEvent.pop();
    }

    public List<LocalDateTime> getTimer1Event() {
        return timer1Event.pop();
    }

    public List<LocalDateTime> getTimer2Event() {
        return timer2Event.pop();
    }

    public List<LocalDateTime> getClientSendResyncEvent() {
        return clientSendResyncEvent.pop();
    }

    public Integer getCount(EventType type) {
        switch (type) {
            case ITEM_INFO -> {
                return infoEventActionEvent.getCount();
            }
            case ITEM_DELETED -> {
                return itemDeletedEventActionEvent.getCount();
            }
            case SPEECH -> {
                return speechEventActionEvent.getCount();
            }
            case DRAW_GAME_PLAYER -> {
                return drawGamePlayerEventActionEvent.getCount();
            }
            case MOVE_REJECTION -> {
                return moveRejectionEventActionEvent.getCount();
            }
            case DRAW_CONTAINER -> {
                return drawContainerEventActionEvent.getCount();
            }
            case ADD_ITEM_TO_CONTAINER -> {
                return addItemToContainerEventActionEvent.getCount();
            }
            case ADD_MULTIPLE_ITEMS_IN_CONT -> {
                return addMultipleItemsInContainerEventActionEvent.getCount();
            }
            case REJECT_MOVE_ITEM -> {
                return rejectMoveItemEventActionEvent.getCount();
            }
            case UPDATE_CHAR -> {
                return updateCharEventActionEvent.getCount();
            }
            case DRAW_OBJECT -> {
                return drawObjectEventActionEvent.getCount();
            }
            case MENU -> {
                return menuEventActionEvent.getCount();
            }
            case MAP_MESSAGE -> {
                return mapMessageEventActionEvent.getCount();
            }
            case ALLOW_REFUSE_ATTACK -> {
                return allowRefuseAttackEventActionEvent.getCount();
            }
            case CLILOC_SPEECH -> {
                return clilocSpeechEventActionEvent.getCount();
            }
            case CLILOC_SPEECH_AFFIX -> {
                return clilocSpeechAffixEventActionEvent.getCount();
            }
            case UNICODE_SPEECH -> {
                return unicodeSpeechEventActionEvent.getCount();
            }
            case BUFF_DEBUFF_SYSTEM -> {
                return buffDebuffSystemEventActionEvent.getCount();
            }
            case CLIENT_SEND_RESYNC -> {
                return clientSendResyncEvent.getCount();
            }
            case CHAR_ANIMATION -> {
                return charAnimationEventActionEvent.getCount();
            }
            case INCOMING_GUMP -> {
                return incomingGumpEventActionEvent.getCount();
            }
            case TIMER_1 -> {
                return timer1Event.getCount();
            }
            case TIMER_2 -> {
                return timer2Event.getCount();
            }
            case WINDOWS_MESSAGE -> {
                return windowsMessageEventActionEvent.getCount();
            }
            case SOUND -> {
                return soundEventActionEvent.getCount();
            }
            case DEATH -> {
                return deathEventActionEvent.getCount();
            }
            case QUEST_ARROW -> {
                return questArrowEventActionEvent.getCount();
            }
            case PARTY_INVITE -> {
                return partyInviteEventActionEvent.getCount();
            }
            case MAP_PIN -> {
                return mapPinEventActionEvent.getCount();
            }
            case GUMP_TEXT_ENTRY -> {
                return gumpTextEntryEventActionEvent.getCount();
            }
            case GRAPHICAL_EFFECT -> {
                return graphicalEffectEventActionEvent.getCount();
            }
            case IRC_INCOMING_TEXT -> {
                return ircIncomingTextEventActionEvent.getCount();
            }
            case SET_GLOBAL_VAR -> {
                return setGlobalVarEventActionEvent.getCount();
            }
            case UPDATE_OBJ_STATS -> {
                return updateObjectStatusEventActionEvent.getCount();
            }
            case GLOBAL_CHAT -> {
                return globalChatEventActionEvent.getCount();
            }
            default -> throw new BaseException(EXCEPTION_TEXT, type);
        }
    }

    public void subscribe(EventType type) {
        switch (type) {
            case ITEM_INFO -> getClient().setItemInfoEvent(infoEventActionEvent.getEvent());
            case ITEM_DELETED -> getClient().setItemDeletedEvent(itemDeletedEventActionEvent.getEvent());
            case SPEECH -> getClient().setSpeechEvent(speechEventActionEvent.getEvent());
            case DRAW_GAME_PLAYER -> getClient().setDrawPlayerEvent(drawGamePlayerEventActionEvent.getEvent());
            case MOVE_REJECTION -> getClient().setMoveRejectionEvent(moveRejectionEventActionEvent.getEvent());
            case DRAW_CONTAINER -> getClient().setDrawContainerEvent(drawContainerEventActionEvent.getEvent());
            case ADD_ITEM_TO_CONTAINER ->
                    getClient().setAddItemToContainerEvent(addItemToContainerEventActionEvent.getEvent());
            case ADD_MULTIPLE_ITEMS_IN_CONT ->
                    getClient().setAddMultipleItemsInContainerEvent(addMultipleItemsInContainerEventActionEvent.getEvent());
            case REJECT_MOVE_ITEM -> getClient().setRejectMoveItemEvent(rejectMoveItemEventActionEvent.getEvent());
            case UPDATE_CHAR -> getClient().setUpdateCharacterEvent(updateCharEventActionEvent.getEvent());
            case DRAW_OBJECT -> getClient().setDrawObjectEvent(drawObjectEventActionEvent.getEvent());
            case MENU -> getClient().setMenuEvent(menuEventActionEvent.getEvent());
            case MAP_MESSAGE -> getClient().setMapMessageEvent(mapMessageEventActionEvent.getEvent());
            case ALLOW_REFUSE_ATTACK ->
                    getClient().setAllowRefuseAttackEvent(allowRefuseAttackEventActionEvent.getEvent());
            case CLILOC_SPEECH -> getClient().setClilocSpeechEvent(clilocSpeechEventActionEvent.getEvent());
            case CLILOC_SPEECH_AFFIX ->
                    getClient().setClilocSpeechAffixEvent(clilocSpeechAffixEventActionEvent.getEvent());
            case UNICODE_SPEECH -> getClient().setUnicodeSpeechEvent(unicodeSpeechEventActionEvent.getEvent());
            case BUFF_DEBUFF_SYSTEM ->
                    getClient().setBuffDebuffSystemEvent(buffDebuffSystemEventActionEvent.getEvent());
            case CLIENT_SEND_RESYNC -> getClient().setClientSendResyncEvent(clientSendResyncEvent.getEvent());
            case CHAR_ANIMATION -> getClient().setCharAnimationEvent(charAnimationEventActionEvent.getEvent());
            case INCOMING_GUMP -> getClient().setIncomingGumpEvent(incomingGumpEventActionEvent.getEvent());
            case TIMER_1 -> getClient().setTimer1Event(timer1Event.getEvent());
            case TIMER_2 -> getClient().setTimer2Event(timer2Event.getEvent());
            case WINDOWS_MESSAGE -> getClient().setWindowsMessageEvent(windowsMessageEventActionEvent.getEvent());
            case SOUND -> getClient().setSoundEvent(soundEventActionEvent.getEvent());
            case DEATH -> getClient().setDeathEvent(deathEventActionEvent.getEvent());
            case QUEST_ARROW -> getClient().setQuestArrowEvent(questArrowEventActionEvent.getEvent());
            case PARTY_INVITE -> getClient().setPartyInviteEvent(partyInviteEventActionEvent.getEvent());
            case MAP_PIN -> getClient().setMapPinEvent(mapPinEventActionEvent.getEvent());
            case GUMP_TEXT_ENTRY -> getClient().setGumpTextEntryEvent(gumpTextEntryEventActionEvent.getEvent());
            case GRAPHICAL_EFFECT -> getClient().setGraphicalEffectEvent(graphicalEffectEventActionEvent.getEvent());
            case IRC_INCOMING_TEXT -> getClient().setIrcIncomingTextEvent(ircIncomingTextEventActionEvent.getEvent());
            case SET_GLOBAL_VAR -> getClient().setSetGlobalVarEvent(setGlobalVarEventActionEvent.getEvent());
            case UPDATE_OBJ_STATS -> getClient().setObjectStatusEvent(updateObjectStatusEventActionEvent.getEvent());
            case GLOBAL_CHAT -> getClient().setGlobalChatEvent(globalChatEventActionEvent.getEvent());
            default -> throw new BaseException(EXCEPTION_TEXT, type);
        }
    }

    public void unsubscribe(EventType type) {
        switch (type) {
            case ITEM_INFO -> getClient().setItemInfoEvent(null);
            case ITEM_DELETED -> getClient().setItemDeletedEvent(null);
            case SPEECH -> getClient().setSpeechEvent(null);
            case DRAW_GAME_PLAYER -> getClient().setDrawPlayerEvent(null);
            case MOVE_REJECTION -> getClient().setMoveRejectionEvent(null);
            case DRAW_CONTAINER -> getClient().setDrawContainerEvent(null);
            case ADD_ITEM_TO_CONTAINER -> getClient().setAddItemToContainerEvent(null);
            case ADD_MULTIPLE_ITEMS_IN_CONT -> getClient().setAddMultipleItemsInContainerEvent(null);
            case REJECT_MOVE_ITEM -> getClient().setRejectMoveItemEvent(null);
            case UPDATE_CHAR -> getClient().setUpdateCharacterEvent(null);
            case DRAW_OBJECT -> getClient().setDrawObjectEvent(null);
            case MENU -> getClient().setMenuEvent(null);
            case MAP_MESSAGE -> getClient().setMapMessageEvent(null);
            case ALLOW_REFUSE_ATTACK -> getClient().setAllowRefuseAttackEvent(null);
            case CLILOC_SPEECH -> getClient().setClilocSpeechEvent(null);
            case CLILOC_SPEECH_AFFIX -> getClient().setClilocSpeechAffixEvent(null);
            case UNICODE_SPEECH -> getClient().setUnicodeSpeechEvent(null);
            case BUFF_DEBUFF_SYSTEM -> getClient().setBuffDebuffSystemEvent(null);
            case CLIENT_SEND_RESYNC -> getClient().setClientSendResyncEvent(null);
            case CHAR_ANIMATION -> getClient().setCharAnimationEvent(null);
            case INCOMING_GUMP -> getClient().setIncomingGumpEvent(null);
            case TIMER_1 -> getClient().setTimer1Event(null);
            case TIMER_2 -> getClient().setTimer2Event(null);
            case WINDOWS_MESSAGE -> getClient().setWindowsMessageEvent(null);
            case SOUND -> getClient().setSoundEvent(null);
            case DEATH -> getClient().setDeathEvent(null);
            case QUEST_ARROW -> getClient().setQuestArrowEvent(null);
            case PARTY_INVITE -> getClient().setPartyInviteEvent(null);
            case MAP_PIN -> getClient().setMapPinEvent(null);
            case GUMP_TEXT_ENTRY -> getClient().setGumpTextEntryEvent(null);
            case GRAPHICAL_EFFECT -> getClient().setGraphicalEffectEvent(null);
            case IRC_INCOMING_TEXT -> getClient().setIrcIncomingTextEvent(null);
            case SET_GLOBAL_VAR -> getClient().setSetGlobalVarEvent(null);
            case UPDATE_OBJ_STATS -> getClient().setObjectStatusEvent(null);
            case GLOBAL_CHAT -> getClient().setGlobalChatEvent(null);
            default -> throw new BaseException(EXCEPTION_TEXT, type);
        }
    }
}
