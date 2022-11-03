package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.ItemInfoEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ItemInfoEventDto extends AbstractEventDto<ItemInfoEvent> {
    private Long id;

    @Override
    public void parse(ItemInfoEvent object) {
        this.setId(object.getId());
    }
}
