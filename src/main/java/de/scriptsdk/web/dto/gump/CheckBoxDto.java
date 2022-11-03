package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.CheckBoxResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckBoxDto {
    private Integer status = 0;
    private Integer returnValue = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer releasedId = 0;
    private Integer pressedId = 0;
    private Integer x = 0;
    private Integer y = 0;

    public CheckBoxDto(CheckBoxResponse object) {
        this.setPage(object.getPage());
        this.setX(object.getX());
        this.setY(object.getY());
        this.setStatus(object.getStatus());
        this.setReturnValue(object.getReturnValue());
        this.setElementNumber(object.getElementNumber());
        this.setReleasedId(object.getReleasedId());
        this.setPressedId(object.getPressedId());
    }
}
