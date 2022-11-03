package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.SoundEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SoundEventDto extends AbstractEventDto<SoundEvent> {
    private Integer soundId;
    private Integer x;
    private Integer y;
    private Integer z;

    @Override
    public void parse(SoundEvent object) {
        this.setSoundId(object.getSoundId());
        this.setX(object.getX());
        this.setY(object.getY());
        this.setZ(object.getZ());
    }
}
