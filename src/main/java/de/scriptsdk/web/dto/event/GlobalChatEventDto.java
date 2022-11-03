package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.GlobalChatEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GlobalChatEventDto extends AbstractEventDto<GlobalChatEvent> {
    private Integer msgCode;
    private String name;
    private String text;

    @Override
    public void parse(GlobalChatEvent object) {
        this.setMsgCode(object.getMsgCode());
        this.setName(object.getName());
        this.setText(object.getText());
    }
}
