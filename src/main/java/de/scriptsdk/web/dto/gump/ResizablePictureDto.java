package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.ResizablePictureResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResizablePictureDto {
    private Integer gumpId = 0;
    private Integer width = 0;
    private Integer height = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;
    private Integer x = 0;
    private Integer y = 0;

    public ResizablePictureDto(ResizablePictureResponse response) {
        this.setPage(response.getPage());
        this.setGumpId(response.getGumpId());
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
