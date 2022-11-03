package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.TextEntryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TextEntryDto {
    private Integer width = 0;
    private Integer height = 0;
    private Integer color = 0;
    private Integer returnValue = 0;
    private Integer defaultTextId = 0;
    private String value = "";
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public TextEntryDto(TextEntryResponse response) {
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setColor(response.getColor());
        this.setReturnValue(response.getReturnValue());
        this.setDefaultTextId(response.getDefaultTextId());
        this.setValue(response.getValue());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
