package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.XmfHtmlGumpColorResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class XmfHtmlGumpColorDto {
    private Integer x = 0;
    private Integer y = 0;
    private Integer width = 0;
    private Integer height = 0;
    private Long clilocID = 0L;
    private Integer background = 0;
    private Integer scrollbar = 0;
    private Integer hue = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;

    public XmfHtmlGumpColorDto(XmfHtmlGumpColorResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setClilocID(response.getClilocID());
        this.setBackground(response.getBackground());
        this.setScrollbar(response.getScrollbar());
        this.setHue(response.getHue());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
    }
}
