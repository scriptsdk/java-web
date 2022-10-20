package de.scriptsdk.web.dto.stealth;

import de.scriptsdk.api.model.system.StealthInfoResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StealthInfoDto {
    private VersionDto version;
    private Integer buildVersion;
    private LocalDateTime buildDate;
    private Integer gitRevisionNumber;
    private String gitRevision;

    public StealthInfoDto(StealthInfoResponse stealthInfo) {
        this.setVersion(new VersionDto(stealthInfo.getVersion()));
        this.setBuildVersion(stealthInfo.getBuildVersion());
        this.setBuildDate(stealthInfo.getBuildDate());
        this.setGitRevisionNumber(stealthInfo.getGitRevisionNumber());
        this.setGitRevision(stealthInfo.getGitRevision());
    }
}
