package de.scriptsdk.web.dto.stealth;

import de.scriptsdk.api.model.system.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VersionDto {

    private Integer major = 0;
    private Integer minor = 0;
    private Integer revision = 0;
    private Integer build = 0;

    public VersionDto(Version version) {
        this(version.getMajor(), version.getMinor(), version.getRevision(), version.getBuild());
    }
}
