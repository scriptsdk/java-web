package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.SpeechEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SpeechEventDto extends AbstractEventDto<SpeechEvent> {

    private String text;
    private String senderName;
    private Long senderId;

    @Override
    public void parse(SpeechEvent object) {
        this.setText(object.getText());
        this.setSenderId(object.getSenderId());
        this.setSenderName(object.getSenderName());
    }
}
