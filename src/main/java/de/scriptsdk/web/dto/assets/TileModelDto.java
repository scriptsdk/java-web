package de.scriptsdk.web.dto.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TileModelDto {
    private Integer tile = 0;
    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;
}
