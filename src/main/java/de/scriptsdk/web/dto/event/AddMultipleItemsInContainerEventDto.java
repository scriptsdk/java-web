package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.AddMultipleItemsInContainerEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddMultipleItemsInContainerEventDto extends AbstractEventDto<AddMultipleItemsInContainerEvent> {
    private Long containerId;

    @Override
    public void parse(AddMultipleItemsInContainerEvent object) {
        this.setContainerId(object.getContainerId());
    }
}
