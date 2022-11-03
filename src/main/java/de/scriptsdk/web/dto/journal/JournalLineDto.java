package de.scriptsdk.web.dto.journal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JournalLineDto {
    private Integer index = 0;
    private String value = " ";
}
