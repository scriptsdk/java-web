package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.MultiItemResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MultiItemDto {
    private Long id = 0L;
    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;
    private Integer minX = 0;
    private Integer minY = 0;
    private Integer maxX = 0;
    private Integer maxY = 0;
    private Integer width = 0;
    private Integer height = 0;

    public MultiItemDto(MultiItemResponse response) {
        this.setId(response.getId());
        this.setX(response.getX());
        this.setY(response.getY());
        this.setZ(response.getZ());
        this.setMinX(response.getMinX());
        this.setMinY(response.getMinY());
        this.setMaxX(response.getMaxX());
        this.setMaxY(response.getMaxY());
        this.setWidth(response.getWidth());
        this.setHeight(response.getHeight());
    }
}
