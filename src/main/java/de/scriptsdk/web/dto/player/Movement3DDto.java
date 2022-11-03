package de.scriptsdk.web.dto.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movement3DDto {
    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;
    private Integer accuracyXY = 0;
    private Integer accuracyZ = 0;
    private Boolean performAsRunner = false;
}
