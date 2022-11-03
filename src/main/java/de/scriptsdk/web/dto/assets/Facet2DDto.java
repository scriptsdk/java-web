package de.scriptsdk.web.dto.assets;

import de.scriptsdk.api.enums.Facet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facet2DDto {
    Integer x = 0;
    Integer y = 0;
    Facet facet = Facet.FELUCCA;
}
