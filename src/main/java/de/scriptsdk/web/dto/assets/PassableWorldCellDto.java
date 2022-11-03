package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.model.assets.WorldCellResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassableWorldCellDto {
    private Boolean state;
    private Integer z;

    public PassableWorldCellDto(WorldCellResponse response) {
        this.setState(response.getState());
        this.setZ(response.getZ());
    }
}
