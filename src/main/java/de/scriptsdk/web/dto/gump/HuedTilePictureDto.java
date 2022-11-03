package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.HuedTilePictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HuedTilePictureDto {
    private Integer x = 0;
    private Integer y = 0;
    private Integer id = 0;
    private Integer color = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;

    public HuedTilePictureDto(HuedTilePictureResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
        this.setId(response.getId());
        this.setColor(response.getColor());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
    }
}
