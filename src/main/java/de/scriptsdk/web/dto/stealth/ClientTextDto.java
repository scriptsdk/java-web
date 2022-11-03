package de.scriptsdk.web.dto.stealth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientTextDto {
    private Long sender = 0L;
    private Integer color = 0;
    private Integer font = 0;
    private String text = "";
}
