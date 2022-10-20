package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.settings.BadObjectDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.SettingsService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/{id}/settings")
public class SettingsController {

    final ClientService clientService;
    final SettingsService settingsService;

    public SettingsController(ClientService clientService, SettingsService settingsService) {
        this.clientService = clientService;
        this.settingsService = settingsService;
    }

    @GetMapping(path = "/opendoorthroughmovement", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getOpenDoorThroughMovement(@PathVariable String id) {
        return settingsService.getOpenDoorThroughMovement(clientService.getClient(id));
    }

    @PostMapping(path = "/opendoorthroughmovement", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setOpenDoorThroughMovement(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setOpenDoorThroughMovement(clientService.getClient(id), value);
    }

    @GetMapping(path = "/movementthroughnpc", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMovementThroughNPC(@PathVariable String id) {
        return settingsService.getMovementThroughNPC(clientService.getClient(id));
    }

    @PostMapping(path = "/movementthroughnpc", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setMovementThroughNPC(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMovementThroughNPC(clientService.getClient(id), value);
    }

    @GetMapping(path = "/movementthroughcorner", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getMovementThroughCorner(@PathVariable String id) {
        return settingsService.getMovementThroughCorner(clientService.getClient(id));
    }

    @PostMapping(path = "/movementthroughcorner", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setMovementThroughCorner(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setMovementThroughCorner(clientService.getClient(id), value);
    }

    @GetMapping(path = "/moveheuristicmulti", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMoveHeuristicMulti(@PathVariable String id) {
        return settingsService.getMoveHeuristicMulti(clientService.getClient(id));
    }

    @PostMapping(path = "/moveheuristicmulti", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setMoveHeuristicMulti(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMoveHeuristicMulti(clientService.getClient(id), value);
    }

    @GetMapping(path = "/movecheckstamina", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMoveCheckStamina(@PathVariable String id) {
        return settingsService.getMoveCheckStamina(clientService.getClient(id));
    }

    @PostMapping(path = "/movecheckstamina", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setMoveCheckStamina(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMoveCheckStamina(clientService.getClient(id), value);
    }

    @GetMapping(path = "/movementturncost", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMovementTurnCost(@PathVariable String id) {
        return settingsService.getMovementTurnCost(clientService.getClient(id));
    }

    @PostMapping(path = "/movementturncost", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setMovementTurnCost(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setMovementTurnCost(clientService.getClient(id), value);
    }

    @GetMapping(path = "/movingbetweentwocorners", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getMovingBetweenTwoCorners(@PathVariable String id) {
        return settingsService.getMovingBetweenTwoCorners(clientService.getClient(id));
    }

    @PostMapping(path = "/movingbetweentwocorners", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setMovingBetweenTwoCorners(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setMovingBetweenTwoCorners(clientService.getClient(id), value);
    }

    @GetMapping(path = "/finddistance", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getFindDistance(@PathVariable String id) {
        return settingsService.getFindDistance(clientService.getClient(id));
    }

    @PostMapping(path = "/finddistance", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setFindDistance(@PathVariable String id, @RequestBody Integer distance) {
        settingsService.setFindDistance(clientService.getClient(id), distance);
    }

    @GetMapping(path = "/findvertical", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getFindVertical(@PathVariable String id) {
        return settingsService.getFindVertical(clientService.getClient(id));
    }

    @PostMapping(path = "/findvertical", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setFindVertical(@PathVariable String id, @RequestBody Integer distance) {
        settingsService.setFindVertical(clientService.getClient(id), distance);
    }

    @GetMapping(path = "/findinnullpointlocation", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getFindInNullPointLocation(@PathVariable String id) {
        return settingsService.getFindInNullPointLocation(clientService.getClient(id));
    }

    @PostMapping(path = "/findinnullpointlocation", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setFindInNullPointLocation(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setFindInNullPointLocation(clientService.getClient(id), value);
    }

    @GetMapping(path = "/autoreconnectmode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getAutoReconnectMode(@PathVariable String id) {
        return settingsService.getAutoReconnectMode(clientService.getClient(id));
    }

    @PostMapping(path = "/autoreconnectmode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setAutoReconnectMode(@PathVariable String id, @RequestBody Boolean newState) {
        settingsService.setAutoReconnectMode(clientService.getClient(id), newState);
    }

    @GetMapping(path = "/pauseondisconnectmode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getPauseOnDisconnectMode(@PathVariable String id) {
        return settingsService.getPauseOnDisconnectMode(clientService.getClient(id));
    }

    @PostMapping(path = "/pauseondisconnectmode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setPauseOnDisconnectMode(@PathVariable String id, @RequestBody Boolean newState) {
        settingsService.setPauseOnDisconnectMode(clientService.getClient(id), newState);
    }

    @GetMapping(path = "/autobuydelay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getAutoBuyDelay(@PathVariable String id) {
        return settingsService.getAutoBuyDelay(clientService.getClient(id));
    }

    @PostMapping(path = "/autobuydelay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setAutoBuyDelay(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setAutoBuyDelay(clientService.getClient(id), value);
    }

    @GetMapping(path = "/autoselldelay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getAutoSellDelay(@PathVariable String id) {
        return settingsService.getAutoSellDelay(clientService.getClient(id));
    }

    @PostMapping(path = "/autoselldelay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setAutoSellDelay(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setAutoSellDelay(clientService.getClient(id), value);
    }

    @GetMapping(path = "/silentmode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getSilentMode(@PathVariable String id) {
        return settingsService.getSilentMode(clientService.getClient(id));
    }

    @PostMapping(path = "/silentmode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setSilentMode(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setSilentMode(clientService.getClient(id), value);
    }

    @GetMapping(path = "/showipcexceptionwindow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getShowIPCExceptionWindow(@PathVariable String id) {
        return settingsService.getShowIPCExceptionWindow(clientService.getClient(id));
    }

    @PostMapping(path = "/showipcexceptionwindow", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setShowIPCExceptionWindow(@PathVariable String id, @RequestBody Boolean state) {
        settingsService.setShowIPCExceptionWindow(clientService.getClient(id), state);
    }

    @GetMapping(path = "/dressspeed", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getDressSpeed(@PathVariable String id) {
        return settingsService.getDressSpeed(clientService.getClient(id));
    }

    @PostMapping(path = "/dressspeed", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setDressSpeed(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setDressSpeed(clientService.getClient(id), value);
    }

    @PostMapping(path = "/unequipitemsmacro", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setUnEquipItemsMacro(@PathVariable String id) {
        settingsService.setUnEquipItemsMacro(clientService.getClient(id));
    }

    @PostMapping(path = "/equipitemsmacro", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setEquipItemsMacro(@PathVariable String id) {
        settingsService.setEquipItemsMacro(clientService.getClient(id));
    }

    @PostMapping(path = "/badlocation", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setBadLocation(@PathVariable String id, @RequestBody Point2DDto point2DDto) {
        settingsService.setBadLocation(clientService.getClient(id), point2DDto);
    }

    @PostMapping(path = "/goodlocation", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setGoodLocation(@PathVariable String id, @RequestBody Point2DDto point2DDto) {
        settingsService.setGoodLocation(clientService.getClient(id), point2DDto);
    }

    @DeleteMapping(path = "/badlocationlist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void clearBadLocationList(@PathVariable String id) {
        settingsService.clearBadLocationList(clientService.getClient(id));
    }

    @PostMapping(path = "/badobject", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setBadObject(@PathVariable String id, @RequestBody BadObjectDto badObjectDto) {
        settingsService.setBadObject(clientService.getClient(id), badObjectDto);
    }

    @DeleteMapping(path = "/badobjectlist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void clearBadObjectList(@PathVariable String id) {
        settingsService.clearBadObjectList(clientService.getClient(id));
    }

    @GetMapping(path = "/coordinationcheckondrop", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean getCoordinationCheckOnDrop(@PathVariable String id) {
        return settingsService.getCoordinationCheckOnDrop(clientService.getClient(id));
    }

    @PostMapping(path = "/coordinationcheckondrop", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setCoordinationCheckOnDrop(@PathVariable String id, @RequestBody Boolean value) {
        settingsService.setCoordinationCheckOnDrop(clientService.getClient(id), value);
    }

    @GetMapping(path = "/dropdelay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getDropDelay(@PathVariable String id) {
        return settingsService.getDropDelay(clientService.getClient(id));
    }

    @PostMapping(path = "/dropdelay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setDropDelay(@PathVariable String id, @RequestBody Integer value) {
        settingsService.setDropDelay(clientService.getClient(id), value);
    }

    @PostMapping(path = "/catchbag", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setCatchBag(@PathVariable String id, @RequestBody Long objectIdentity) {
        settingsService.setCatchBag(clientService.getClient(id), objectIdentity);
    }

    @DeleteMapping(path = "/catchbag", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void unsetCatchBag(@PathVariable String id) {
        settingsService.unsetCatchBag(clientService.getClient(id));
    }

    @GetMapping(path = "/pickupitem", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getPickupItem(@PathVariable String id) {
        return settingsService.getPickupItem(clientService.getClient(id));
    }

    @PostMapping(path = "/pickupitem", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setPickupItem(@PathVariable String id, @RequestBody Long itemIdentity) {
        settingsService.setPickupItem(clientService.getClient(id), itemIdentity);
    }
}
