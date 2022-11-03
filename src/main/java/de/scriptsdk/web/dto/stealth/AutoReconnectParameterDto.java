package de.scriptsdk.web.dto.stealth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AutoReconnectParameterDto {
    private String shardName = "";
    private String charName = "";
    private Boolean useItAtEveryReconnect = false;
}
