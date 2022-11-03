package de.scriptsdk.web.dto.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Path2DPathArrayDto {
    private Integer destinationX = 0;
    private Integer destinationY = 0;
    private Boolean optimizedMovement = false;
    private Integer accuracy = 0;
}
