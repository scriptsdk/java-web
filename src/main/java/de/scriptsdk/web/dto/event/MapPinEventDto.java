package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.MapPinEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MapPinEventDto extends AbstractEventDto<MapPinEvent> {
    private Long id;
    private Integer action;
    private Integer pinId;
    private Integer x;
    private Integer y;

    @Override
    public void parse(MapPinEvent object) {
        this.setId(object.getId());
        this.setAction(object.getAction());
        this.setPinId(object.getPinId());
        this.setX(object.getX());
        this.setY(object.getY());
    }
}
