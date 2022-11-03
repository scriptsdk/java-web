package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.TileResultResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TileResultDto {
    private Integer tile = 0;
    private Integer x;
    private Integer y;
    private Integer z;

    public TileResultDto(TileResultResponse response) {
        this.setTile(response.getTile());
        this.setX(response.getX());
        this.setY(response.getY());
        this.setZ(response.getZ());
    }
}
