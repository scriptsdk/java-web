package de.scriptsdk.web.dto.scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindTypeDto {
    private Integer type = 0;
    private Integer color = 0;
    private Long container = 0L;
    private Boolean scanRecursive = false;
}
