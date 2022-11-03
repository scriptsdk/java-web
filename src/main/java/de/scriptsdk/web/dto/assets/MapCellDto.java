package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.MapCellResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MapCellDto {
    private Integer tile = 0;
    private Integer z = 0;

    public MapCellDto(MapCellResponse response) {
        this.setTile(response.getTile());
        this.setZ(response.getZ());
    }
}
