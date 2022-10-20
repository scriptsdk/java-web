package de.scriptsdk.web.dto.scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindTypeDto {
    private Integer type;
    private Integer color;
    private Long container;
    private Boolean scanRecursive;
}
