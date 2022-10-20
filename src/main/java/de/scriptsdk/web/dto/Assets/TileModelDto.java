package de.scriptsdk.web.dto.Assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TileModelDto {
    Integer tile;
    private Integer x;
    private Integer y;
    private Integer z;
}
