package de.scriptsdk.web.dto.party;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivatePartyMessageDto {
    private Long partyMember = 0L;
    private String message = "";
}
