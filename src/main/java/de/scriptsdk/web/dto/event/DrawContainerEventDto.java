package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.DrawContainerEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DrawContainerEventDto extends AbstractEventDto<DrawContainerEvent> {
    private Long containerId;
    private Integer modelGump;

    @Override
    public void parse(DrawContainerEvent object) {
        this.setContainerId(object.getContainerId());
        this.setModelGump(object.getModelGump());
    }
}
