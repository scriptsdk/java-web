package de.scriptsdk.web.dto.script;

import de.scriptsdk.api.model.system.ExtendedScriptInfoResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExtendedScriptInfoDto {
    private Integer timeZone;

    public ExtendedScriptInfoDto(ExtendedScriptInfoResponse scriptParameter) {
        this.setTimeZone(scriptParameter.getTimeZone());
    }
}
