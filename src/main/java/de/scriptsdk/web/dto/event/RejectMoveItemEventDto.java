package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.RejectMoveItemEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RejectMoveItemEventDto extends AbstractEventDto<RejectMoveItemEvent> {
    private Integer reason;

    @Override
    public void parse(RejectMoveItemEvent object) {
        this.setReason(object.getReason());
    }
}
