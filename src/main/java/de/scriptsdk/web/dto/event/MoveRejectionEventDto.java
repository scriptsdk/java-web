package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.enums.Direction;
import de.scriptsdk.api.model.event.MoveRejectionEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MoveRejectionEventDto extends AbstractEventDto<MoveRejectionEvent> {
    private Integer sourceX;
    private Integer sourceY;
    private Direction direction;
    private Integer targetX;
    private Integer targetY;

    @Override
    public void parse(MoveRejectionEvent object) {
        this.setSourceX(object.getSourceX());
        this.setSourceY(object.getSourceY());
        this.setDirection(object.getDirection());
        this.setTargetX(object.getTargetX());
        this.setTargetY(object.getTargetY());
    }
}
