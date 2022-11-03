package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.IRCIncomingTextEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class IRCIncomingTextEventDto extends AbstractEventDto<IRCIncomingTextEvent> {
    private String message;

    @Override
    public void parse(IRCIncomingTextEvent object) {
        this.setMessage(object.getMessage());
    }
}
