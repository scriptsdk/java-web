package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.DrawObjectEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DrawObjectEventDto extends AbstractEventDto<DrawObjectEvent> {
    private Long id;

    @Override
    public void parse(DrawObjectEvent object) {
        this.setId(object.getId());
    }
}
