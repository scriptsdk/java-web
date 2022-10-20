package de.scriptsdk.web.dto.stealth;

import de.scriptsdk.api.enums.UIWindowType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientUIWindowDto {
    private UIWindowType uiWindowType;
    private Long id;
}
