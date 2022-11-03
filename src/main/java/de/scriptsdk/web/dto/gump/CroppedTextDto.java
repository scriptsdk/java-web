package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.CroppedTextResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CroppedTextDto {
    private Integer width = 0;
    private Integer height = 0;
    private Integer color = 0;
    private Integer textId = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public CroppedTextDto(CroppedTextResponse response) {
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setColor(response.getColor());
        this.setTextId(response.getTextId());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
