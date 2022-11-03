package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.SetGlobalVarEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SetGlobalVarEventDto extends AbstractEventDto<SetGlobalVarEvent> {
    private String value;
    private String varName;

    @Override
    public void parse(SetGlobalVarEvent object) {
        setValue(object.getValue());
        setVarName(object.getVarName());
    }
}
