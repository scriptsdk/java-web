package de.scriptsdk.web.dto.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PingRequestDto {
    private String url;
    private Integer port;
    private Integer cycles;
}
