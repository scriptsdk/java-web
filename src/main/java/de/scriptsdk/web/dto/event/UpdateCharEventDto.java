package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.UpdateCharEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateCharEventDto extends AbstractEventDto<UpdateCharEvent> {
    private Long id;

    @Override
    public void parse(UpdateCharEvent object) {
        this.setId(object.getId());
    }
}
