package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.enums.LockState;
import de.scriptsdk.api.enums.SkillType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SkillLockStateSetterDto {
    SkillType skillType = SkillType.ANATOMY;
    LockState lockState = LockState.LOCKED;
}