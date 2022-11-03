package de.scriptsdk.web.dto.scanner;

import de.scriptsdk.api.enums.Notoriety;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindNotorietyDto {
    private Integer type = 0;
    private Notoriety notoriety = Notoriety.ENEMY;
}
