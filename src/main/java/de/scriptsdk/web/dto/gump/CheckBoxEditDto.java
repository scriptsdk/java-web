package de.scriptsdk.web.dto.gump;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckBoxEditDto {
    private Integer gumpIndex = 0;
    private Integer checkBoxID = 0;
    private Integer value = 0;
}
