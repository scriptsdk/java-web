package de.scriptsdk.web.dto.contextmenu;

import de.scriptsdk.api.model.context.ContextMenuEntryResponse;
import de.scriptsdk.api.model.context.ContextMenuResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class ContextMenuDto {
    private Long id;
    private Integer index;
    private Boolean newCliloc;

    private List<ContextMenuEntryDto> entries;

    public ContextMenuDto(ContextMenuResponse response) {
        this.id = response.getId();
        this.index = response.getIndex();
        this.newCliloc = this.getNewCliloc();

        entries = new ArrayList<>();
        if (response.getEntries() != null) {
            for (ContextMenuEntryResponse entry : response.getEntries()) {
                entries.add(new ContextMenuEntryDto(entry));
            }
        }
    }
}
