package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.ItemDeletedEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ItemDeletedEventDto extends AbstractEventDto<ItemDeletedEvent> {
    private Long id;

    @Override
    public void parse(ItemDeletedEvent object) {
        this.setId(object.getId());
    }
}
