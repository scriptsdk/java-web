package de.scriptsdk.web.dto.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RenamingDto {
    private Long mobIdentity = 0L;
    private String name = " ";
}
