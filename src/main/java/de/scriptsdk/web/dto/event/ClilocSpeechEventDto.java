package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.ClilocSpeechEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ClilocSpeechEventDto extends AbstractEventDto<ClilocSpeechEvent> {
    private String clilocText;
    private Long senderId;
    private String senderName;
    private Long clilocId;

    @Override
    public void parse(ClilocSpeechEvent object) {
        this.setClilocId(object.getClilocId());
        this.setSenderId(object.getSenderId());
        this.setSenderName(object.getSenderName());
        this.setClilocText(object.getClilocText());
    }
}
