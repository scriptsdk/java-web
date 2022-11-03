package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.enums.Facet;
import de.scriptsdk.api.enums.TileType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TilesDto {
    private TileType type = TileType.LAND_TILE;
    private Integer xMin = 0;
    private Integer yMin = 0;
    private Integer xMax = 0;
    private Integer yMax = 0;
    private Facet facet = Facet.FELUCCA;
    private List<Integer> tiles = new ArrayList<>();
}
