package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.GumpTextEntryEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GumpTextEntryEventDto extends AbstractEventDto<GumpTextEntryEvent> {
    private Long id;
    private String title;
    private Integer inputStyle;
    private Long maxValue;
    private String title2;

    @Override
    public void parse(GumpTextEntryEvent object) {
        this.setId(object.getId());
        this.setTitle(object.getTitle());
        this.setInputStyle(object.getInputStyle());
        this.setMaxValue(object.getMaxValue());
        this.setTitle2(object.getTitle2());
    }
}
