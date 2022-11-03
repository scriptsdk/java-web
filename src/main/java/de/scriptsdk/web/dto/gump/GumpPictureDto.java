package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.GumpPictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GumpPictureDto {
    private Integer id = 0;
    private Integer hue = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public GumpPictureDto(GumpPictureResponse response) {
        this.setId(response.getId());
        this.setHue(response.getHue());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
