package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.UpperWordCaseToggleResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpperWordCaseToggleDto {
    private String arguments = "";
    private Integer elementNumber = 0;

    public UpperWordCaseToggleDto(UpperWordCaseToggleResponse response) {
        this.setArguments(response.getArguments());
        this.setElementNumber(response.getElementNumber());
    }
}
