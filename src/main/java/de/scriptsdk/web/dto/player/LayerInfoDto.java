package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.enums.Layer;
import de.scriptsdk.api.model.assets.LayerInfoResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LayerInfoDto {
    private Layer layer = Layer.RING;
    private Long id = 0L;

    public LayerInfoDto(LayerInfoResponse response) {
        this.setLayer(response.getLayer());
        this.setId(response.getId());
    }
}
