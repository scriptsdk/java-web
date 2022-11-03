package de.scriptsdk.web.dto.stealth;

import de.scriptsdk.api.enums.VarRegion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VarRegionDto {
    private VarRegion region = VarRegion.STEALTH;
    private String keyName = "stealth";
    private String keyValue = "";
}
