package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.CharAnimationEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CharAnimationEventDto extends AbstractEventDto<CharAnimationEvent> {
    private Long id;
    private Integer action;

    @Override
    public void parse(CharAnimationEvent object) {
        this.setId(object.getId());
        this.setAction(object.getAction());
    }
}
