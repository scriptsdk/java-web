package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.party.PrivatePartyMessageDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class PartyControllerTest extends AbstractControllerTest {

    protected PartyControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void inviteToParty() {
        MvcResult result = getClient().post("invite-to-party", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void removeFromParty() {
        MvcResult result = getClient().post("remove-from-party", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void sayToPartyMember() {
        MvcResult result = getClient().post("say-to-member", getInfo().getId(), new PrivatePartyMessageDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void sayToParty() {
        MvcResult result = getClient().post("say", getInfo().getId(), "Hello World");

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void canPartyLootMe() {
        MvcResult result = getClient().post("party-can-loot-me", getInfo().getId(), false);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void acceptPartyInvitation() {
        MvcResult result = getClient().post("accept-invitation", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void declinePartyInvitation() {
        MvcResult result = getClient().post("decline-invitation", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void leaveParty() {
        MvcResult result = getClient().post("leave", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getPartyMemberList() {
        List<Long> value = Arrays.stream(getClient().get("party-member-list",
                getInfo().getId(), Long[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void isInParty() {
        Boolean value = getClient().get("is-in-party", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/party";
    }
}