package de.scriptsdk.web.dto.menu;

import de.scriptsdk.api.model.menu.MenuResponseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MenuResponseDto {
    private Integer model = 0;
    private Integer color = 0;
    private String text = "";

    public MenuResponseDto(MenuResponseResponse response) {
        this.setModel(response.getModel());
        this.setText(response.getText());
        this.setColor(response.getColor());
    }
}
