package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.HuedGumpPictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HuedGumpPictureDto {
    private Integer graphic = 0;
    private Integer color = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public HuedGumpPictureDto(HuedGumpPictureResponse response) {
        this.setGraphic(response.getGraphic());
        this.setY(response.getY());
        this.setX(response.getX());
        this.setElementNumber(response.getElementNumber());
        this.setColor(response.getColor());
    }
}
