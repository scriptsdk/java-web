package de.scriptsdk.web.service;

import de.scriptsdk.api.model.system.ScriptItemInfoResponse;
import de.scriptsdk.core.enums.network.ScriptState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScriptItemInfoDto {
    private Integer index = 0;
    private String name = " ";
    private ScriptState state;

    public ScriptItemInfoDto(ScriptItemInfoResponse response) {
        this.setName(response.getName());
        this.setIndex(response.getIndex());
        this.setState(response.getState());
    }
}
