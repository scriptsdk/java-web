package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.DeathEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeathEventDto extends AbstractEventDto<DeathEvent> {
    private Boolean isDead;

    @Override
    public void parse(DeathEvent object) {
        this.setIsDead(object.getIsDead());
    }
}
