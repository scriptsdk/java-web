package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.StaticItemResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaticItemDto {
    private Integer tile = 0;
    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;
    private Integer color = 0;

    public StaticItemDto(StaticItemResponse response) {
        this.setTile(response.getTile());
        this.setX(response.getX());
        this.setY(response.getY());
        this.setZ(response.getZ());
        this.setColor(response.getColor());
    }
}
