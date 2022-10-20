package de.scriptsdk.web.dto.geometry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Point3DDto {
    private Integer x;
    private Integer y;
    private Integer z;
}
