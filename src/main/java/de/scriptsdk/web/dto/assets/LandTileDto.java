package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.LandTileResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LandTileDto {
    private Long flags = 0L;
    private Long flags2 = 0L;
    private Integer textureId = 0;
    private String name = "";

    public LandTileDto(LandTileResponse response) {
        this.setFlags(response.getFlags());
        this.setFlags2(response.getFlags2());
        this.setName(response.getName());
        this.setTextureId(response.getTextureId());
    }
}
