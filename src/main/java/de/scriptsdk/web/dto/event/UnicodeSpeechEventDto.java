package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.UnicodeSpeechEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UnicodeSpeechEventDto extends AbstractEventDto<UnicodeSpeechEvent> {
    private String senderName;
    private String text;
    private Long senderId;

    @Override
    public void parse(UnicodeSpeechEvent object) {
        this.setText(object.getText());
        this.setSenderId(object.getSenderId());
        this.setSenderName(object.getSenderName());
    }
}
