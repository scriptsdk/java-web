package de.scriptsdk.web.dto.objects;

import de.scriptsdk.api.model.properties.ClilocPropertyResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClilocPropertyDto {
    private Long clilocID = 0L;
    private List<String> args = new ArrayList<>();

    public ClilocPropertyDto(ClilocPropertyResponse response) {
        this.setClilocID(response.getClilocID());
        this.setArgs(response.getArgs());
    }
}
