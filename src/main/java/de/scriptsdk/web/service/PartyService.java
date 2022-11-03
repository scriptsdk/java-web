package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.party.PrivatePartyMessageDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    public void inviteToParty(ApiClient client, Long partyMember) {
        client.inviteToParty(partyMember);
    }

    public void removeFromParty(ApiClient client, Long partyMember) {
        client.removeFromParty(partyMember);
    }

    public void sayToPartyMember(ApiClient client, PrivatePartyMessageDto partyMessageDto) {
        client.sayToPartyMember(partyMessageDto.getPartyMember(), partyMessageDto.getMessage());
    }

    public void sayToParty(ApiClient client, String message) {
        client.sayToParty(message);
    }

    public void canPartyLootMe(ApiClient client, Boolean value) {
        client.canPartyLootMe(value);
    }

    public void acceptPartyInvitation(ApiClient client) {
        client.acceptPartyInvitation();
    }

    public void declinePartyInvitation(ApiClient client) {
        client.declinePartyInvitation();
    }

    public void leaveParty(ApiClient client) {
        client.leaveParty();
    }

    public List<Long> getPartyMemberList(ApiClient client) {
        return client.getPartyMemberList();
    }

    public Boolean isInParty(ApiClient client) {
        return client.isInParty();
    }
}
