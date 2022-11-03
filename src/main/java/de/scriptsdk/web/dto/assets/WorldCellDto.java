package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.enums.Facet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldCellDto {
    private Integer fromX = 0;
    private Integer fromY = 0;
    private Integer fromZ = 0;
    private Integer toX = 0;
    private Integer toY = 0;
    private Facet facet = Facet.FELUCCA;
}
