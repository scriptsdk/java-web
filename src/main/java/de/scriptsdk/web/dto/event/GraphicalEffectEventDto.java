package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.GraphicalEffectEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GraphicalEffectEventDto extends AbstractEventDto<GraphicalEffectEvent> {
    private Integer fixedDir;
    private Long srcId;
    private Integer srcZ;
    private Integer srcX;
    private Integer srcY;
    private Long destId;
    private Integer destX;
    private Integer destY;
    private Integer destZ;
    private Integer type;
    private Integer itemId;

    @Override
    public void parse(GraphicalEffectEvent object) {
        this.setFixedDir(object.getFixedDir());
        this.setSrcId(object.getSrcId());
        this.setSrcX(object.getSrcX());
        this.setSrcY(object.getSrcY());
        this.setSrcZ(object.getSrcZ());
        this.setDestId(object.getDestId());
        this.setDestX(object.getDestX());
        this.setDestY(object.getDestY());
        this.setDestZ(object.getDestZ());
        this.setType(object.getType());
        this.setItemId(object.getItemId());
    }
}
