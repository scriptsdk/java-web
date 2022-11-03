package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.enums.Facet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Path3DPathArrayDto {
    private Integer fromX = 0;
    private Integer fromY = 0;
    private Integer fromZ = 0;
    private Integer toX = 0;
    private Integer toY = 0;
    private Integer toZ = 0;
    private Facet facet = Facet.FELUCCA;
    private Integer accuracyXY = 0;
    private Integer accuracyZ = 0;
    private Boolean performAsRunner = false;
}
