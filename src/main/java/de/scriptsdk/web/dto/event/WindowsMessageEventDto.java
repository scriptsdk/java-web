package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.WindowsMessageEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class WindowsMessageEventDto extends AbstractEventDto<WindowsMessageEvent> {
    private Long lParam;

    @Override
    public void parse(WindowsMessageEvent object) {
        this.setLParam(object.getLParam());
    }
}
