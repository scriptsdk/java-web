package de.scriptsdk.web.dto.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TileFlagDto {
    private Integer group = 0;
    private Integer tile = 0;
}
