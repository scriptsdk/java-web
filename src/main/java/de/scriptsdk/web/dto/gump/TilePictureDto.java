package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.TilePictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TilePictureDto {
    private Integer id = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public TilePictureDto(TilePictureResponse response) {
        this.setId(response.getId());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
