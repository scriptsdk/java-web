package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.StaticTileResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaticTileDto {
    private BigInteger flags = BigInteger.valueOf(0L);
    private Integer weight = 0;
    private Integer animationId = 0;
    private Integer height = 0;
    private Long radarColorRGBA = 0L;
    private String name = "";

    public StaticTileDto(StaticTileResponse response) {
        this.setFlags(response.getFlags());
        this.setWeight(response.getWeight());
        this.setAnimationId(response.getAnimationId());
        this.setHeight(response.getHeight());
        this.setRadarColorRGBA(response.getRadarColorRGBA());
        this.setName(response.getName());
    }
}
