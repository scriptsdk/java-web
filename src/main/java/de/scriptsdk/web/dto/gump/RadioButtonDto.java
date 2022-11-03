package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.RadioButtonResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RadioButtonDto {
    private Integer quit = 0;
    private Integer pageId = 0;
    private Integer returnValue = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer releasedId = 0;
    private Integer pressedId = 0;
    private Integer x = 0;
    private Integer y = 0;

    public RadioButtonDto(RadioButtonResponse response) {
        this.setQuit(response.getQuit());
        this.setPageId(response.getPageId());
        this.setReturnValue(response.getReturnValue());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setReleasedId(response.getReleasedId());
        this.setPressedId(response.getPressedId());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
