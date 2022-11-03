package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.party.PrivatePartyMessageDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.PartyService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/party")
public class PartyController {

    final PartyService partyService;

    final ClientService clientService;

    public PartyController(PartyService partyService, ClientService clientService) {
        this.partyService = partyService;
        this.clientService = clientService;
    }

    @PostMapping(path = "invite-to-party", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Invites user to party", tags = {"party"})
    public void inviteToParty(@PathVariable String id, @RequestBody Long partyMember) {
        partyService.inviteToParty(clientService.getClient(id), partyMember);
    }

    @PostMapping(path = "remove-from-party", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Removes user from party", tags = {"party"})
    public void removeFromParty(@PathVariable String id, @RequestBody Long partyMember) {
        partyService.removeFromParty(clientService.getClient(id), partyMember);
    }

    @PostMapping(path = "say-to-member", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Write message to certain party member", tags = {"party"})
    public void sayToPartyMember(@PathVariable String id, @RequestBody PrivatePartyMessageDto partyMessageDto) {
        partyService.sayToPartyMember(clientService.getClient(id), partyMessageDto);
    }

    @PostMapping(path = "say", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Write text to whole party", tags = {"party"})
    public void sayToParty(@PathVariable String id, @RequestBody String message) {
        partyService.sayToParty(clientService.getClient(id), message);
    }

    @PostMapping(path = "party-can-loot-me", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Decide if party can loot you", tags = {"party"})
    public void canPartyLootMe(@PathVariable String id, @RequestBody Boolean value) {
        partyService.canPartyLootMe(clientService.getClient(id), value);
    }

    @PostMapping(path = "accept-invitation")
    @Operation(summary = "Accept party invitation", tags = {"party"})
    public void acceptPartyInvitation(@PathVariable String id) {
        partyService.acceptPartyInvitation(clientService.getClient(id));
    }

    @PostMapping(path = "decline-invitation")
    @Operation(summary = "Decline current party invitation", tags = {"party"})
    public void declinePartyInvitation(@PathVariable String id) {
        partyService.declinePartyInvitation(clientService.getClient(id));
    }

    @PostMapping(path = "leave")
    @Operation(summary = "Leaves current party", tags = {"party"})
    public void leaveParty(@PathVariable String id) {
        partyService.leaveParty(clientService.getClient(id));
    }

    @GetMapping(path = "party-member-list", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current party member list", tags = {"party"})
    public List<Long> getPartyMemberList(@PathVariable String id) {
        return partyService.getPartyMemberList(clientService.getClient(id));
    }

    @GetMapping(path = "is-in-party", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if a party has been established", tags = {"party"})
    public Boolean isInParty(@PathVariable String id) {
        return partyService.isInParty(clientService.getClient(id));
    }
}
