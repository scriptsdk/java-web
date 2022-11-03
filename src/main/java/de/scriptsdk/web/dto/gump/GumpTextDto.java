package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.GumpTextResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GumpTextDto {
    private Integer color = 0;
    private Integer textId = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public GumpTextDto(GumpTextResponse object) {
        this.setColor(object.getColor());
        this.setTextId(object.getTextId());
        this.setPage(object.getPage());
        this.setElementNumber(object.getElementNumber());
        this.setX(object.getX());
        this.setY(object.getY());
    }
}
