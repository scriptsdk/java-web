package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.GumpTilePictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GumpTilePictureDto {
    private Integer width = 0;
    private Integer height = 0;
    private Integer gumpId = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public GumpTilePictureDto(GumpTilePictureResponse response) {
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setGumpId(response.getGumpId());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
