package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.AddItemToContainerEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddItemToContainerEventDto extends AbstractEventDto<AddItemToContainerEvent> {
    private Long itemId;
    private Long containerId;

    @Override
    public void parse(AddItemToContainerEvent object) {
        this.setItemId(object.getItemId());
        this.setContainerId(object.getContainerId());
    }
}
