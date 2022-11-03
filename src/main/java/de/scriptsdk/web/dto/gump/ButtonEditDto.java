package de.scriptsdk.web.dto.gump;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ButtonEditDto {
    private Integer gumpIndex = 0;
    private Integer buttonId = 0;
}
