package de.scriptsdk.web.dto.stealth;

import de.scriptsdk.api.model.target.TargetInfoResponse;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TargetInfoDto {
    private Long id = 0L;
    private Integer tile = 0;
    private Point3DDto point;

    public TargetInfoDto(TargetInfoResponse clientTargetResponse) {
        this.setId(clientTargetResponse.getId());
        this.setTile(clientTargetResponse.getTile());
        this.setPoint(new Point3DDto(clientTargetResponse.getX(),
                clientTargetResponse.getY(), clientTargetResponse.getZ()));
    }
}
