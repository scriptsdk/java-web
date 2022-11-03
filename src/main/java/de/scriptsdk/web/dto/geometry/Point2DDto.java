package de.scriptsdk.web.dto.geometry;

import de.scriptsdk.api.model.geometry.Point2DResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Point2DDto {
    private Integer x = 0;
    private Integer y = 0;

    public Point2DDto(Point2DResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
