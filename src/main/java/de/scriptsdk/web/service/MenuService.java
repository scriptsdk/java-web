package de.scriptsdk.web.service;

import de.scriptsdk.api.model.menu.MenuResponseResponse;
import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.menu.MenuCaptionDto;
import de.scriptsdk.web.dto.menu.MenuResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    public void waitMenu(ApiClient client, MenuCaptionDto menuCaptionDto) {
        client.waitMenu(menuCaptionDto.getMenuCaption(), menuCaptionDto.getElementCaption());
    }

    public void autoMenu(ApiClient client, MenuCaptionDto menuCaptionDto) {
        client.autoMenu(menuCaptionDto.getMenuCaption(), menuCaptionDto.getElementCaption());
    }

    public Boolean menuHookPresent(ApiClient client) {
        return client.menuHookPresent();
    }

    public Boolean menuPresent(ApiClient client) {
        return client.menuPresent();
    }

    public void cancelMenu(ApiClient client) {
        client.cancelMenu();
    }

    public void closeMenu(ApiClient client) {
        client.closeMenu();
    }

    public List<String> getLastMenuItems(ApiClient client) {
        return client.getLastMenuItems();
    }

    public List<String> getMenuItemsAsString(ApiClient client, String menuCaption) {
        return client.getMenuItemsAsString(menuCaption);
    }

    public List<MenuResponseDto> getMenuItems(ApiClient client, String menuCaption) {
        List<MenuResponseResponse> list = client.getMenuItems(menuCaption);

        List<MenuResponseDto> returnable = new ArrayList<>();

        for (MenuResponseResponse response : list) {
            returnable.add(new MenuResponseDto(response));
        }

        return returnable;
    }
}
