package de.scriptsdk.web.dto.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdvShopInfoDto {
    private Integer type;
    private Integer color;
    private Integer amount;
    private Long price;
    private String name;
}
