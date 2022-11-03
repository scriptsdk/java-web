package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.ButtonTileArtResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ButtonTileArtDto {
    private Integer quit = 0;
    private Integer pageId = 0;
    private Integer returnValue = 0;
    private Integer artId = 0;
    private Integer hue = 0;
    private Integer artX = 0;
    private Integer artY = 0;
    private Integer elementNumber = 0;
    private Integer releasedId = 0;
    private Integer pressedId = 0;

    public ButtonTileArtDto(ButtonTileArtResponse object) {
        this.setQuit(object.getQuit());
        this.setPageId(object.getPageId());
        this.setReturnValue(object.getReturnValue());
        this.setArtId(object.getArtId());
        this.setHue(object.getHue());
        this.setArtX(object.getArtX());
        this.setArtY(object.getArtY());
        this.setElementNumber(object.getElementNumber());
        this.setReleasedId(object.getReleasedId());
        this.setPressedId(object.getPressedId());
    }
}
