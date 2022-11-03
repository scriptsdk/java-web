package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.PartyInviteEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PartyInviteEventDto extends AbstractEventDto<PartyInviteEvent> {
    private Long inviterId;

    @Override
    public void parse(PartyInviteEvent object) {
        this.setInviterId(object.getInviterId());
    }
}
