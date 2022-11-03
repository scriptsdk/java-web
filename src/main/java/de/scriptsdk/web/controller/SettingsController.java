package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.settings.BadObjectDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.SettingsService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{id}/settings")
public class SettingsController {

    final ClientService clientService;
    final SettingsService settingsService;

    public SettingsController(ClientService clientService, SettingsService settingsService) {
        this.clientService = clientService;
        this.settingsService = settingsService;
    }

    @GetMapping(path = "open-door-through-movement", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if doors should be opened through moving", tags = {"settings"})
    public @ResponseBody Boolean getOpenDoorThroughMovement(@PathVariable String id) {
        return settingsService.getOpenDoorThroughMovement(clientService.getClient(id));
    }

    @PostMapping(path = "open-door-through-movement", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if doors should be opened through moving", tags = {"settings"})
    public void setOpenDoorThroughMovement(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setOpenDoorThroughMovement(clientService.getClient(id), value);
    }

    @GetMapping(path = "movement-through-npc", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if movement is allowed through npc´s", tags = {"settings"})
    public @ResponseBody Integer getMovementThroughNPC(@PathVariable String id) {
        return settingsService.getMovementThroughNPC(clientService.getClient(id));
    }

    @PostMapping(path = "movement-through-npc", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if movement is allowed through npc´s", tags = {"settings"})
    public void setMovementThroughNPC(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMovementThroughNPC(clientService.getClient(id), value);
    }

    @GetMapping(path = "movement-through-corner", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if movement is allowed through corners", tags = {"settings"})
    public @ResponseBody Boolean getMovementThroughCorner(@PathVariable String id) {
        return settingsService.getMovementThroughCorner(clientService.getClient(id));
    }

    @PostMapping(path = "movement-through-corner", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets of movement is allowed through corner", tags = {"settings"})
    public void setMovementThroughCorner(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setMovementThroughCorner(clientService.getClient(id), value);
    }

    @GetMapping(path = "move-heuristic-multi", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if movement should be heuristic on multis", tags = {"settings"})
    public @ResponseBody Integer getMoveHeuristicMulti(@PathVariable String id) {
        return settingsService.getMoveHeuristicMulti(clientService.getClient(id));
    }

    @PostMapping(path = "move-heuristic-multi", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if movement should be heuristic on multis", tags = {"settings"})
    public void setMoveHeuristicMulti(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMoveHeuristicMulti(clientService.getClient(id), value);
    }

    @GetMapping(path = "move-check-stamina", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if stamina should be checked on movement", tags = {"settings"})
    public @ResponseBody Integer getMoveCheckStamina(@PathVariable String id) {
        return settingsService.getMoveCheckStamina(clientService.getClient(id));
    }

    @PostMapping(path = "move-check-stamina", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if stamina should be checked on movement", tags = {"settings"})
    public void setMoveCheckStamina(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMoveCheckStamina(clientService.getClient(id), value);
    }

    @GetMapping(path = "movement-turn-cost",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns the movement cost", tags = {"settings"})
    public @ResponseBody Integer getMovementTurnCost(@PathVariable String id) {
        return settingsService.getMovementTurnCost(clientService.getClient(id));
    }

    @PostMapping(path = "movement-turn-cost", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets the movement cost", tags = {"settings"})
    public void setMovementTurnCost(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMovementTurnCost(clientService.getClient(id), value);
    }

    @GetMapping(path = "moving-between-two-corners", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if movement between two corners is enabled", tags = {"settings"})
    public @ResponseBody Boolean getMovingBetweenTwoCorners(@PathVariable String id) {
        return settingsService.getMovingBetweenTwoCorners(clientService.getClient(id));
    }

    @PostMapping(path = "moving-between-two-corners", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if movement between two corners is enabled", tags = {"settings"})
    public void setMovingBetweenTwoCorners(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setMovingBetweenTwoCorners(clientService.getClient(id), value);
    }

    @GetMapping(path = "find-distance",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns scanner distance", tags = {"settings"})
    public @ResponseBody Integer getFindDistance(@PathVariable String id) {
        return settingsService.getFindDistance(clientService.getClient(id));
    }

    @PostMapping(path = "find-distance", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets scanner distance", tags = {"settings"})
    public void setFindDistance(@PathVariable String id, @RequestBody Integer distance) {
        settingsService.setFindDistance(clientService.getClient(id), distance);
    }

    @GetMapping(path = "find-vertical",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns vertical scanner distance", tags = {"settings"})
    public @ResponseBody Integer getFindVertical(@PathVariable String id) {
        return settingsService.getFindVertical(clientService.getClient(id));
    }

    @PostMapping(path = "find-vertical", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets vertical scanner distance", tags = {"settings"})
    public void setFindVertical(@PathVariable String id, @RequestBody Integer distance) {
        settingsService.setFindVertical(clientService.getClient(id), distance);
    }

    @GetMapping(path = "find-in-null-point-location",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if scanner should check null point locations", tags = {"settings"})
    public @ResponseBody Boolean getFindInNullPointLocation(@PathVariable String id) {
        return settingsService.getFindInNullPointLocation(clientService.getClient(id));
    }

    @PostMapping(path = "find-in-null-point-location", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if scanner should check null point locations", tags = {"settings"})
    public void setFindInNullPointLocation(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setFindInNullPointLocation(clientService.getClient(id), value);
    }

    @GetMapping(path = "auto-reconnect-mode",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns auto reconnect is enabled", tags = {"settings"})
    public @ResponseBody Boolean getAutoReconnectMode(@PathVariable String id) {
        return settingsService.getAutoReconnectMode(clientService.getClient(id));
    }

    @PostMapping(path = "auto-reconnect-mode", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets auto reconnect mode", tags = {"settings"})
    public void setAutoReconnectMode(@PathVariable String id, @RequestBody Boolean newState) {
        settingsService.setAutoReconnectMode(clientService.getClient(id), newState);
    }

    @GetMapping(path = "pause-on-disconnect-mode",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if script should be paused on disconnect", tags = {"settings"})
    public @ResponseBody Boolean getPauseOnDisconnectMode(@PathVariable String id) {
        return settingsService.getPauseOnDisconnectMode(clientService.getClient(id));
    }

    @PostMapping(path = "pause-on-disconnect-mode", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if script should be paused on disconnect", tags = {"settings"})
    public void setPauseOnDisconnectMode(@PathVariable String id, @RequestBody Boolean newState) {
        settingsService.setPauseOnDisconnectMode(clientService.getClient(id), newState);
    }

    @GetMapping(path = "auto-buy-delay",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns auto buy delay", tags = {"settings"})
    public @ResponseBody Integer getAutoBuyDelay(@PathVariable String id) {
        return settingsService.getAutoBuyDelay(clientService.getClient(id));
    }

    @PostMapping(path = "auto-buy-delay", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets auto buy delay", tags = {"settings"})
    public void setAutoBuyDelay(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setAutoBuyDelay(clientService.getClient(id), value);
    }

    @GetMapping(path = "auto-sell-delay",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns auto sell delay", tags = {"settings"})
    public @ResponseBody Integer getAutoSellDelay(@PathVariable String id) {
        return settingsService.getAutoSellDelay(clientService.getClient(id));
    }

    @PostMapping(path = "auto-sell-delay", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets auto sell delay", tags = {"settings"})
    public void setAutoSellDelay(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setAutoSellDelay(clientService.getClient(id), value);
    }

    @GetMapping(path = "silent-mode",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if silent mode is enabled", tags = {"settings"})
    public @ResponseBody Boolean getSilentMode(@PathVariable String id) {
        return settingsService.getSilentMode(clientService.getClient(id));
    }

    @PostMapping(path = "silent-mode", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets silent mode", tags = {"settings"})
    public void setSilentMode(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setSilentMode(clientService.getClient(id), value);
    }

    @GetMapping(path = "show-ipc-exception-window",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if api exception windows should be shown", tags = {"settings"})
    public @ResponseBody Boolean getShowIPCExceptionWindow(@PathVariable String id) {
        return settingsService.getShowIPCExceptionWindow(clientService.getClient(id));
    }

    @PostMapping(path = "show-ipc-exception-window", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if api exception windows should be shown", tags = {"settings"})
    public void setShowIPCExceptionWindow(@PathVariable String id, @RequestBody Boolean state) {
        settingsService.setShowIPCExceptionWindow(clientService.getClient(id), state);
    }

    @GetMapping(path = "dress-speed",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns delay of dressing", tags = {"settings"})
    public @ResponseBody Integer getDressSpeed(@PathVariable String id) {
        return settingsService.getDressSpeed(clientService.getClient(id));
    }

    @PostMapping(path = "dress-speed", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for dressing", tags = {"settings"})
    public void setDressSpeed(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setDressSpeed(clientService.getClient(id), value);
    }

    @PostMapping(path = "unequip-items-macro")
    @Operation(summary = "Hooks unequip items macro", tags = {"settings"})
    public void setUnEquipItemsMacro(@PathVariable String id) {
        settingsService.setUnEquipItemsMacro(clientService.getClient(id));
    }

    @PostMapping(path = "equip-items-macro")
    @Operation(summary = "Hooks equip items macro", tags = {"settings"})
    public void setEquipItemsMacro(@PathVariable String id) {
        settingsService.setEquipItemsMacro(clientService.getClient(id));
    }

    @PostMapping(path = "bad-location", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets a bad location", tags = {"settings"})
    public void setBadLocation(@PathVariable String id, @RequestBody Point2DDto point2DDto) {
        settingsService.setBadLocation(clientService.getClient(id), point2DDto);
    }

    @PostMapping(path = "good-location", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets a good location", tags = {"settings"})
    public void setGoodLocation(@PathVariable String id, @RequestBody Point2DDto point2DDto) {
        settingsService.setGoodLocation(clientService.getClient(id), point2DDto);
    }

    @DeleteMapping(path = "clear-bad-location-list")
    @Operation(summary = "Clears cache of bad locations", tags = {"settings"})
    public void clearBadLocationList(@PathVariable String id) {
        settingsService.clearBadLocationList(clientService.getClient(id));
    }

    @PostMapping(path = "bad-object", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Adds a bad object to list", tags = {"settings"})
    public void setBadObject(@PathVariable String id, @RequestBody BadObjectDto badObjectDto) {
        settingsService.setBadObject(clientService.getClient(id), badObjectDto);
    }

    @DeleteMapping(path = "clear-bad-object-list")
    @Operation(summary = "Clears cache of bad objects", tags = {"settings"})
    public void clearBadObjectList(@PathVariable String id) {
        settingsService.clearBadObjectList(clientService.getClient(id));
    }

    @GetMapping(path = "coordination-check-on-drop", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if there is a check before dropping an item at a position", tags = {"settings"})
    public @ResponseBody Boolean getCoordinationCheckOnDrop(@PathVariable String id) {
        return settingsService.getCoordinationCheckOnDrop(clientService.getClient(id));
    }

    @PostMapping(path = "coordination-check-on-drop", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets if there should be a check before dropping an item at a position", tags = {"settings"})
    public void setCoordinationCheckOnDrop(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setCoordinationCheckOnDrop(clientService.getClient(id), value);
    }

    @GetMapping(path = "drop-delay",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns delay for dropping items", tags = {"settings"})
    public @ResponseBody Integer getDropDelay(@PathVariable String id) {
        return settingsService.getDropDelay(clientService.getClient(id));
    }

    @PostMapping(path = "drop-delay", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for dropping items", tags = {"settings"})
    public void setDropDelay(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setDropDelay(clientService.getClient(id), value);
    }

    @PostMapping(path = "catch-bag", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets a catch bag", tags = {"settings"})
    public void setCatchBag(@PathVariable String id, @RequestBody Long objectIdentity) {
        settingsService.setCatchBag(clientService.getClient(id), objectIdentity);
    }

    @DeleteMapping(path = "catch-bag")
    @Operation(summary = "Removes a catch bag", tags = {"settings"})
    public void unsetCatchBag(@PathVariable String id) {
        settingsService.unsetCatchBag(clientService.getClient(id));
    }

    @GetMapping(path = "pickup-item",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a pickup item id", tags = {"settings"})
    public @ResponseBody Long getPickupItem(@PathVariable String id) {
        return settingsService.getPickupItem(clientService.getClient(id));
    }

    @PostMapping(path = "pickup-item", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets a pickup item", tags = {"settings"})
    public void setPickupItem(@PathVariable String id, @RequestBody Long itemIdentity) {
        settingsService.setPickupItem(clientService.getClient(id), itemIdentity);
    }

    @PostMapping(path = "unmount-timer", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for unmounting", tags = {"settings"})
    public void setUnmountTimer(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setUnmountTimer(clientService.getClient(id), value);
    }

    @GetMapping(path = "run-mount-timer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns delay for mounting a mount", tags = {"settings"})
    public Integer getRunMountTimer(@PathVariable String id) {
        return settingsService.getRunMountTimer(clientService.getClient(id));
    }

    @PostMapping(path = "run-mount-timer", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for mounted running", tags = {"settings"})
    public void setRunMountTimer(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setRunMountTimer(clientService.getClient(id), value);
    }

    @GetMapping(path = "walk-mount-timer",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns delay for mounted walking", tags = {"settings"})
    public Integer getWalkMountTimer(@PathVariable String id) {
        return settingsService.getWalkMountTimer(clientService.getClient(id));
    }

    @PostMapping(path = "walk-mount-timer", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for mounted walking", tags = {"settings"})
    public void setWalkMountTimer(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setWalkMountTimer(clientService.getClient(id), value);
    }

    @GetMapping(path = "run-unmount-timer", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for unmounted running", tags = {"settings"})
    public Integer getRunUnmountTimer(@PathVariable String id) {
        return settingsService.getRunUnmountTimer(clientService.getClient(id));
    }

    @GetMapping(path = "walk-unmount-timer", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns delay for unmounted walking", tags = {"settings"})
    public Integer getWalkUnmountTimer(@PathVariable String id) {
        return settingsService.getWalkUnmountTimer(clientService.getClient(id));
    }

    @PostMapping(path = "walk-unmount-timer", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets delay for unmounted walking", tags = {"settings"})
    public void setWalkUnmountTimer(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setWalkUnmountTimer(clientService.getClient(id), value);
    }
}
