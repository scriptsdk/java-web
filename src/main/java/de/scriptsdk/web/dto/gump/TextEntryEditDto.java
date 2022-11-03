package de.scriptsdk.web.dto.gump;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TextEntryEditDto {

    private Integer gumpIndex = 0;
    private Integer textEntryID = 0;
    private String value = " ";
}
