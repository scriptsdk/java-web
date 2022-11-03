package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.QuestArrowEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class QuestArrowEventDto extends AbstractEventDto<QuestArrowEvent> {
    private Integer x;
    private Integer y;
    private Boolean isActive;

    @Override
    public void parse(QuestArrowEvent object) {
        this.setX(object.getX());
        this.setY(object.getY());
        this.setIsActive(object.getIsActive());
    }
}
