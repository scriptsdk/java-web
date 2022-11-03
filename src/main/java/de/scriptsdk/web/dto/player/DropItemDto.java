package de.scriptsdk.web.dto.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DropItemDto {
    private Long moveIntoID = 0L;
    private Integer x = 0;
    private Integer y = 0;
    private Integer z = 0;
}
