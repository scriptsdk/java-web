package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.TilePictureAsGumpPictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TilePictureAsGumpPictureDto {
    private Integer x = 0;
    private Integer y = 0;
    private Integer graphic = 0;
    private Integer color = 0;
    private Integer race = 0;
    private Integer bodyType = 0;
    private Integer elementNumber = 0;

    public TilePictureAsGumpPictureDto(TilePictureAsGumpPictureResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
        this.setGraphic(response.getGraphic());
        this.setColor(response.getColor());
        this.setRace(response.getRace());
        this.setBodyType(response.getBodyType());
        this.setElementNumber(response.getElementNumber());
    }
}
