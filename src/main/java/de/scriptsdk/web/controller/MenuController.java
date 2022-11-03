package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.menu.MenuCaptionDto;
import de.scriptsdk.web.dto.menu.MenuResponseDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.MenuService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/menu")
public class MenuController {

    final MenuService menuService;

    final ClientService clientService;

    public MenuController(MenuService menuService, ClientService clientService) {
        this.menuService = menuService;
        this.clientService = clientService;
    }

    @PostMapping(path = "wait-menu", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits for gump with certain menu caption", tags = {"menu"})
    public void waitMenu(@PathVariable String id, @RequestBody MenuCaptionDto menuCaptionDto) {
        menuService.waitMenu(clientService.getClient(id), menuCaptionDto);
    }

    @PostMapping(path = "auto-menu", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Handles button of gump with certainn menu caption", tags = {"menu"})
    public void autoMenu(@PathVariable String id, @RequestBody MenuCaptionDto menuCaptionDto) {
        menuService.autoMenu(clientService.getClient(id), menuCaptionDto);
    }

    @GetMapping(path = "menu-hook-present", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if a menu is hooked", tags = {"menu"})
    public @ResponseBody Boolean menuHookPresent(@PathVariable String id) {
        return menuService.menuHookPresent(clientService.getClient(id));
    }

    @GetMapping(path = "menu-present", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if a gump menu is visible", tags = {"menu"})
    public @ResponseBody Boolean menuPresent(@PathVariable String id) {
        return menuService.menuPresent(clientService.getClient(id));
    }

    @PostMapping(path = "cancel")
    @Operation(summary = "cancels a menu", tags = {"menu"})
    public void cancelMenu(@PathVariable String id) {
        menuService.cancelMenu(clientService.getClient(id));
    }

    @PostMapping(path = "close")
    @Operation(summary = "Closes a menu", tags = {"menu"})
    public void closeMenu(@PathVariable String id) {
        menuService.closeMenu(clientService.getClient(id));
    }

    @GetMapping(path = "last-menu-items-as-string", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns last menu items as string list", tags = {"menu"})
    public @ResponseBody List<String> getLastMenuItems(@PathVariable String id) {
        return menuService.getLastMenuItems(clientService.getClient(id));
    }

    @GetMapping(path = "menu-items-as-string", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns menu items of a current opened gump menu as string list", tags = {"menu"})
    public @ResponseBody List<String> getMenuItemsAsString(@PathVariable String id, @RequestBody String menuCaption) {
        return menuService.getMenuItemsAsString(clientService.getClient(id), menuCaption);
    }

    @GetMapping(path = "menu-items", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns items of current opened gump menu", tags = {"menu"})
    public @ResponseBody List<MenuResponseDto> getMenuItems(@PathVariable String id, @RequestBody String menuCaption) {
        return menuService.getMenuItems(clientService.getClient(id), menuCaption);
    }
}
