package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.ItemPropertyResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPropertyDto {
    private Long propertyId = 0L;
    private Integer elementNumber = 0;

    public ItemPropertyDto(ItemPropertyResponse response) {
        this.setPropertyId(response.getPropertyId());
        this.setElementNumber(response.getElementNumber());
    }
}
