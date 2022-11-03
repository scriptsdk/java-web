package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.MapMessageEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MapMessageEventDto extends AbstractEventDto<MapMessageEvent> {
    private Long id;
    private Integer y;
    private Integer x;

    @Override
    public void parse(MapMessageEvent object) {
        this.setId(object.getId());
        this.setX(object.getX());
        this.setY(object.getY());
    }
}
