package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StepDto {
    private Direction direction = Direction.NORTH;
    private Boolean performAsRunner = false;
}
