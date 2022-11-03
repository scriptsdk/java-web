package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.enums.LockState;
import de.scriptsdk.api.enums.StatKind;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StateLockStateSetterDto {
    StatKind statKind = StatKind.STRENGTH;
    LockState lockState = LockState.LOCKED;
}
