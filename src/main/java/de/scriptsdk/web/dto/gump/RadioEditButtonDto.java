package de.scriptsdk.web.dto.gump;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RadioEditButtonDto {
    private Integer gumpIndex = 0;
    private Integer radioButtonID = 0;
    private Integer value = 0;
}
