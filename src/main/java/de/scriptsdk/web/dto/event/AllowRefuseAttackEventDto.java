package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.AllowRefuseAttackEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AllowRefuseAttackEventDto extends AbstractEventDto<AllowRefuseAttackEvent> {
    private Long id;
    private Boolean attackIsAllowed;

    @Override
    public void parse(AllowRefuseAttackEvent object) {
        this.setId(object.getId());
        this.setAttackIsAllowed(object.getAttackIsAllowed());
    }
}
