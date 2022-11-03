package de.scriptsdk.web.dto.geometry;

import de.scriptsdk.api.model.geometry.Point3DResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Point3DDto {
    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;

    public Point3DDto(Point3DResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
        this.setZ(response.getZ());
    }
}
