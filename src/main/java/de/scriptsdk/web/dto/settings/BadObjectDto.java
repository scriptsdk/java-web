package de.scriptsdk.web.dto.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BadObjectDto {
    private Integer type = 0;
    private Integer color = 0;
    private Integer radius = 0;
}
