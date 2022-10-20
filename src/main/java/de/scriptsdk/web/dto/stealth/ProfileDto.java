package de.scriptsdk.web.dto.stealth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileDto {
    private String profileName;
    private String shardName;
    private String charName;
}
