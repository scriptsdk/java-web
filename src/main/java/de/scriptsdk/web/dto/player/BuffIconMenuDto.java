package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.model.buffs.BuffIconResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuffIconMenuDto {
    private Integer attributeId = 0;
    private LocalDateTime startedAt;
    private Integer remainingSeconds;
    private Long clilocId1;
    private Long clilocId2;

    public BuffIconMenuDto(BuffIconResponse response) {
        this.setAttributeId(response.getAttributeId());
        this.setStartedAt(response.getStartedAt());
        this.setRemainingSeconds(response.getRemainingSeconds());
        this.setClilocId1(response.getClilocId1());
        this.setClilocId2(response.getClilocId2());
    }
}
