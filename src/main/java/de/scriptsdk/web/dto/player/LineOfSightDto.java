package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.enums.Facet;
import de.scriptsdk.api.enums.LineOfSightOption;
import de.scriptsdk.api.enums.LineOfSightType;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LineOfSightDto {
    private Point3DDto from = new Point3DDto(0, 0, 0);
    private Point3DDto to = new Point3DDto(0, 0, 0);
    private Facet facet = Facet.FELUCCA;
    private LineOfSightType losType = LineOfSightType.RUNUO;
    private LineOfSightOption losOption = LineOfSightOption.NONE;
}
