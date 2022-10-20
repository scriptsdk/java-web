package de.scriptsdk.web.dto.contextmenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContextMenuHookDto {
    private Long objectId;
    private Integer entryNumber;
}
