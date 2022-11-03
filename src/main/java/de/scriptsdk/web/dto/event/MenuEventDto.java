package de.scriptsdk.web.dto.event;

import de.scriptsdk.api.model.event.MenuEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MenuEventDto extends AbstractEventDto<MenuEvent> {
    private Long dialogId;
    private Integer menuId;

    @Override
    public void parse(MenuEvent object) {
        this.setDialogId(object.getDialogId());
        this.setMenuId(object.getMenuId());
    }
}
