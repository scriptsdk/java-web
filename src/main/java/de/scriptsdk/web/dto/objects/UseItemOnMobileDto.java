package de.scriptsdk.web.dto.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UseItemOnMobileDto {
    private Long itemId = 0L;
    private Long mobileId = 0L;
}
