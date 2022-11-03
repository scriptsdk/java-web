package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.XmfHtmlGumpResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class XmfHtmlGumpDto {
    private Integer x = 0;
    private Integer y = 0;
    private Integer width = 0;
    private Integer height = 0;
    private Long clilocId = 0L;
    private Integer background = 0;
    private Integer scrollbar = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;

    public XmfHtmlGumpDto(XmfHtmlGumpResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setClilocId(response.getClilocId());
        this.setBackground(response.getBackground());
        this.setScrollbar(response.getScrollbar());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
    }
}
