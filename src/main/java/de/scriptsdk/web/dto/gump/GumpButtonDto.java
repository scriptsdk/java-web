package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.GumpButtonResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GumpButtonDto {
    private Integer quit = 0;
    private Integer pageId = 0;
    private Integer returnValue = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer releasedId = 0;
    private Integer pressedId = 0;
    private Integer x = 0;
    private Integer y = 0;

    public GumpButtonDto(GumpButtonResponse object) {
        this.setQuit(object.getQuit());
        this.setPageId(object.getPageId());
        this.setReturnValue(object.getReturnValue());
        this.setPage(object.getPage());
        this.setElementNumber(object.getElementNumber());
        this.setReleasedId(object.getReleasedId());
        this.setPressedId(object.getPressedId());
        this.setX(object.getX());
        this.setY(object.getY());
    }
}
