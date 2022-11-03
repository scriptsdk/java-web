package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.EventType;
import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.event.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

class EventControllerTest extends AbstractControllerTest {

    protected EventControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getSpeechEvent() {
        List<SpeechEventDto> value = Arrays.stream(getClient().get("speech-events",
                getInfo().getId(), SpeechEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getDrawGamePlayerEvent() {
        List<DrawGamePlayerEventDto> value = Arrays.stream(getClient().get("draw-game-player-events",
                getInfo().getId(), DrawGamePlayerEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getUpdateCharEvent() {
        List<UpdateCharEventDto> value = Arrays.stream(getClient().get("update-char-events",
                getInfo().getId(), UpdateCharEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getDrawObjectEvent() {
        List<DrawObjectEventDto> value =
                Arrays.stream(getClient().get("draw-object-events", getInfo().getId(),
                        DrawObjectEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getAddMultipleItemsInContainerEvent() {
        List<AddMultipleItemsInContainerEventDto> value =
                Arrays.stream(getClient().get("add-multiple-items-in-container-events", getInfo().getId(),
                        AddMultipleItemsInContainerEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getWindowsMessageEvent() {
        List<WindowsMessageEventDto> value = Arrays.stream(getClient().get("windows-message-events",
                getInfo().getId(), WindowsMessageEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getMoveRejectionEvent() {
        List<MoveRejectionEventDto> value = Arrays.stream(getClient().get("move-rejection-events",
                getInfo().getId(), MoveRejectionEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getAddItemToContainerEvent() {
        List<AddItemToContainerEventDto> value = Arrays.stream(getClient().get("add-item-to-container-events",
                getInfo().getId(), AddItemToContainerEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getDrawContainerEvent() {
        List<DrawContainerEventDto> value = Arrays.stream(getClient().get("draw-container-events",
                getInfo().getId(), DrawContainerEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getRejectMoveItemEvent() {
        List<RejectMoveItemEventDto> value = Arrays.stream(getClient().get("reject-move-item-events",
                getInfo().getId(), RejectMoveItemEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getMenuEvent() {
        List<MenuEventDto> value = Arrays.stream(getClient().get("menu-events",
                getInfo().getId(), MenuEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getMapMessageEvent() {
        List<MapMessageEventDto> value = Arrays.stream(getClient().get("map-message-events",
                getInfo().getId(), MapMessageEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getAllowRefuseAttackEvent() {
        List<AllowRefuseAttackEventDto> value = Arrays.stream(getClient().get("allow-refuse-attack-events",
                getInfo().getId(), AllowRefuseAttackEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getClilocSpeechEvent() {
        List<ClilocSpeechEventDto> value = Arrays.stream(getClient().get("cliloc-speech-events",
                getInfo().getId(), ClilocSpeechEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getClilocSpeechAffixEvent() {
        List<ClilocSpeechAffixEventDto> value = Arrays.stream(getClient().get("cliloc-speech-affix-events",
                getInfo().getId(), ClilocSpeechAffixEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getUnicodeSpeechEvent() {
        List<UnicodeSpeechEventDto> value = Arrays.stream(getClient().get("unicode-speech-events",
                getInfo().getId(), UnicodeSpeechEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getBuffDebuffSystemEvent() {
        List<BuffDebuffSystemEventDto> value = Arrays.stream(getClient().get("buff-debuff-system-events",
                getInfo().getId(), BuffDebuffSystemEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getCharAnimationEvent() {
        List<CharAnimationEventDto> value = Arrays.stream(getClient().get("char-animation-events",
                getInfo().getId(), CharAnimationEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getIncomingGumpEvent() {
        List<IncomingGumpEventDto> value = Arrays.stream(getClient().get("incoming-gump-events",
                getInfo().getId(), IncomingGumpEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getSoundEvent() {
        List<SoundEventDto> value = Arrays.stream(getClient().get("sound-events",
                getInfo().getId(), SoundEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getDeathEvent() {
        List<DeathEventDto> value = Arrays.stream(getClient().get("death-events",
                getInfo().getId(), DeathEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getQuestArrowEvent() {
        List<QuestArrowEventDto> value = Arrays.stream(getClient().get("quest-arrow-events",
                getInfo().getId(), QuestArrowEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGlobalChatEvent() {
        List<GlobalChatEventDto> value = Arrays.stream(getClient().get("global-chat-events",
                getInfo().getId(), GlobalChatEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGraphicalEffectEvent() {
        List<GraphicalEffectEventDto> value = Arrays.stream(getClient().get("graphical-effect-events",
                getInfo().getId(), GraphicalEffectEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getIRCIncomingTextEvent() {
        List<IRCIncomingTextEventDto> value = Arrays.stream(getClient().get("irc-Incoming-text-events",
                getInfo().getId(), IRCIncomingTextEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getGumpTextEntryEvent() {
        List<GumpTextEntryEventDto> value = Arrays.stream(getClient().get("gump-text-entry-events",
                getInfo().getId(), GumpTextEntryEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getUpdateObjectStatusEvent() {
        List<UpdateObjectStatusEventDto> value = Arrays.stream(getClient().get("update-object-status-events",
                getInfo().getId(), UpdateObjectStatusEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getSetGlobalVarEvent() {
        List<SetGlobalVarEventDto> value = Arrays.stream(getClient().get("set-global-var-events",
                getInfo().getId(), SetGlobalVarEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getPartyInviteEvent() {
        List<PartyInviteEventDto> value = Arrays.stream(getClient().get("party-invite-events",
                getInfo().getId(), PartyInviteEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getItemInfoEvent() {
        List<ItemInfoEventDto> value = Arrays.stream(getClient().get("item-info-events",
                getInfo().getId(), ItemInfoEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getItemDeletedEvent() {
        List<ItemDeletedEventDto> value = Arrays.stream(getClient().get("item-deleted-events",
                getInfo().getId(), ItemDeletedEventDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getTimer1Event() {
        List<LocalDateTime> value = Arrays.stream(getClient().get("timer1-events",
                getInfo().getId(), LocalDateTime[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getTimer2Event() {
        List<LocalDateTime> value = Arrays.stream(getClient().get("timer2-events",
                getInfo().getId(), LocalDateTime[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getClientSendResyncEvent() {
        List<LocalDateTime> value = Arrays.stream(getClient().get("client-send-resync-events",
                getInfo().getId(), LocalDateTime[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getCount() {
        Integer value = getClient().get("count", getInfo().getId(), Integer.class, EventType.TIMER_1);

        Assertions.assertNotNull(value);
    }

    @Test
    void subscribe() {
        MvcResult result = getClient().post("subscribe", getInfo().getId(), EventType.TIMER_1);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void unsubscribe() {
        MvcResult result = getClient().delete("unsubscribe", getInfo().getId(), EventType.TIMER_1);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/event";
    }
}