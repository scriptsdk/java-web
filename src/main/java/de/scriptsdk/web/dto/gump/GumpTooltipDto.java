package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.GumpTooltipResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GumpTooltipDto {
    private Long clilocId = 0L;
    private String arguments = "";
    private Integer page = 0;
    private Integer elementNumber = 0;

    public GumpTooltipDto(GumpTooltipResponse response) {
        this.setArguments(response.getArguments());
        this.setPage(response.getPage());
        this.setClilocId(response.getClilocId());
        this.setElementNumber(response.getElementNumber());
    }
}
