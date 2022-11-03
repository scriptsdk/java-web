package de.scriptsdk.web.dto.trade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TradeInfoDto {
    private Integer tradeIndex = 0;
    private Integer number = 0;
}
