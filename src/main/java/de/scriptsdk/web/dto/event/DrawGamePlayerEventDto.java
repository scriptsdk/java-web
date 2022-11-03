package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.DrawGamePlayerEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DrawGamePlayerEventDto extends AbstractEventDto<DrawGamePlayerEvent> {
    private Long id;

    @Override
    public void parse(DrawGamePlayerEvent object) {
        this.setId(object.getId());
    }
}
