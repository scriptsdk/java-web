package de.scriptsdk.web.dto.stealth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HuedTextDto {
    private String text = "";
    private Integer color = 0;
}
