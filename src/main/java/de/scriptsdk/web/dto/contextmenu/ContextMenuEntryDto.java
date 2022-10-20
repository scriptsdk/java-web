package de.scriptsdk.web.dto.contextmenu;

import de.scriptsdk.api.enums.ContextMenuFlag;
import de.scriptsdk.api.model.context.ContextMenuEntryResponse;
import de.scriptsdk.core.interfaces.Enumerable;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ContextMenuEntryDto {
    private Integer tag;
    private Long id;
    private ContextMenuFlag flags;
    private Integer color;

    public ContextMenuEntryDto(ContextMenuEntryResponse entry) {
        this.color = getColor();
        this.id = getId();
        this.flags = Enumerable.valueOf(entry.getFlags(), ContextMenuFlag.class);
        this.tag = entry.getTag();
    }
}
