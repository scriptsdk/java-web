package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.BuffDebuffSystemEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BuffDebuffSystemEventDto extends AbstractEventDto<BuffDebuffSystemEvent> {
    private Long id;
    private Integer attributeID;
    private Boolean isEnabled;

    @Override
    public void parse(BuffDebuffSystemEvent object) {
        this.setId(object.getId());
        this.setAttributeID(object.getAttributeID());
        this.setIsEnabled(object.getIsEnabled());
    }
}
