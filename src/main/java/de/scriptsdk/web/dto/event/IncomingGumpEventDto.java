package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.IncomingGumpEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class IncomingGumpEventDto extends AbstractEventDto<IncomingGumpEvent> {
    private Long gumpId;
    private Integer type;
    private Integer x;
    private Integer y;

    @Override
    public void parse(IncomingGumpEvent object) {
        this.setGumpId(object.getGumpId());
        this.setType(object.getType());
        this.setX(object.getX());
        this.setY(object.getY());
    }
}
