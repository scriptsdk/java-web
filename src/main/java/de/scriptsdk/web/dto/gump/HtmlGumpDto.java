package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.HtmlGumpResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HtmlGumpDto {
    private Integer width = 0;
    private Integer height = 0;
    private Integer textId = 0;
    private Integer background = 0;
    private Integer scrollbar = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public HtmlGumpDto(HtmlGumpResponse response) {
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setTextId(response.getTextId());
        this.setBackground(response.getBackground());
        this.setScrollbar(response.getScrollbar());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
