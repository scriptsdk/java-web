package de.scriptsdk.web.dto.stealth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientTextDto {
    private Long sender;
    private Integer color;
    private Integer font;
    private String text;
}
