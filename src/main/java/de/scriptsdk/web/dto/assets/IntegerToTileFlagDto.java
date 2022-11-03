package de.scriptsdk.web.dto.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IntegerToTileFlagDto {
    private Integer group = 0;
    private Integer flags = 0;
}
