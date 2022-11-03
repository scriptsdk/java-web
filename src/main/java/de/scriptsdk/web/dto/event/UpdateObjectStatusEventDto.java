package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.UpdateObjectStatusEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateObjectStatusEventDto extends
        AbstractEventDto<UpdateObjectStatusEvent> {
    private Long id;
    private Integer currentLife;
    private Integer maximumLife;
    private Integer currentMana;
    private Integer maximumMana;
    private Integer currentStamina;
    private Integer maximumStamina;

    @Override
    public void parse(UpdateObjectStatusEvent object) {
        this.setId(object.getId());
        this.setCurrentLife(object.getCurrentLife());
        this.setCurrentMana(object.getCurrentMana());
        this.setCurrentStamina(object.getCurrentStamina());
        this.setMaximumLife(object.getMaximumLife());
        this.setMaximumMana(object.getMaximumMana());
        this.setMaximumStamina(object.getMaximumStamina());
    }
}
