package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.ClilocSpeechAffixEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ClilocSpeechAffixEventDto extends AbstractEventDto<ClilocSpeechAffixEvent> {
    private String clilocText;
    private String senderName;
    private Long senderId;
    private String affix;
    private Long clilocId;

    @Override
    public void parse(ClilocSpeechAffixEvent object) {
        this.setClilocText(object.getClilocText());
        this.setSenderId(object.getSenderId());
        this.setSenderName(object.getSenderName());
        this.setAffix(object.getAffix());
        this.setClilocId(object.getClilocId());
    }
}
