package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.PictureInPictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PictureInPictureDto {
    private Integer graphic = 0;
    private Integer startX = 0;
    private Integer startY = 0;
    private Integer width = 0;
    private Integer height = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public PictureInPictureDto(PictureInPictureResponse response) {
        this.setGraphic(response.getGraphic());
        this.setStartX(response.getStartX());
        this.setStartY(response.getStartY());
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
