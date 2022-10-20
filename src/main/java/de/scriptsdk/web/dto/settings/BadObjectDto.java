package de.scriptsdk.web.dto.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BadObjectDto {
    private Integer type;
    private Integer color;
    private Integer radius;
}
