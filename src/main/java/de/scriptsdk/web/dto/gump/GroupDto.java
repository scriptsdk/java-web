package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.GroupResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDto {
    private Integer groupNumber = 0;
    private Integer page = 0;
    private Integer elementNumber = 0;

    public GroupDto(GroupResponse response) {
        this.setGroupNumber(response.getGroupNumber());
        this.setPage(response.getPage());
        this.setElementNumber(response.getElementNumber());
    }
}
