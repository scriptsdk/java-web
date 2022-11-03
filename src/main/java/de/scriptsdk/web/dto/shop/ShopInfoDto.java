package de.scriptsdk.web.dto.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShopInfoDto {
    private Integer type = 0;
    private Integer color = 0;
    private Integer amount = 0;
}
