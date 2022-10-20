package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.settings.BadObjectDto;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {

    public Boolean getOpenDoorThroughMovement(ApiClient client) {
        return client.getOpenDoorThroughMovement();
    }

    public void setOpenDoorThroughMovement(ApiClient client, Boolean value) {
        client.setOpenDoorThroughMovement(value);
    }

    public Integer getMovementThroughNPC(ApiClient client) {
        return client.getMovementThroughNPC();
    }

    public void setMovementThroughNPC(ApiClient client, Integer value) {
        client.setMovementThroughNPC(value);
    }

    public Boolean getMovementThroughCorner(ApiClient client) {
        return client.getMovementThroughCorner();
    }

    public void setMovementThroughCorner(ApiClient client, Boolean value) {
        client.setMovementThroughCorner(value);
    }

    public Integer getMoveHeuristicMulti(ApiClient client) {
        return client.getMoveHeuristicMulti();
    }

    public void setMoveHeuristicMulti(ApiClient client, Integer value) {
        client.setMoveHeuristicMulti(value);
    }

    public Integer getMoveCheckStamina(ApiClient client) {
        return client.getMoveCheckStamina();
    }

    public void setMoveCheckStamina(ApiClient client, Integer value) {
        client.setMoveCheckStamina(value);
    }

    public Integer getMovementTurnCost(ApiClient client) {
        return client.getMovementTurnCost();
    }

    public void setMovementTurnCost(ApiClient client, Integer value) {
        client.setMovementTurnCost(value);
    }

    public Boolean getMovingBetweenTwoCorners(ApiClient client) {
        return client.getMovingBetweenTwoCorners();
    }

    public void setMovingBetweenTwoCorners(ApiClient client, Boolean value) {
        client.setMovingBetweenTwoCorners(value);
    }

    public Integer getFindDistance(ApiClient client) {
        return client.getFindDistance();
    }

    public void setFindDistance(ApiClient client, Integer distance) {
        client.setFindDistance(distance);
    }

    public Integer getFindVertical(ApiClient client) {
        return client.getFindVertical();
    }

    public void setFindVertical(ApiClient client, Integer distance) {
        client.setFindVertical(distance);
    }

    public Boolean getFindInNullPointLocation(ApiClient client) {
        return client.getFindInNullPointLocation();
    }

    public void setFindInNullPointLocation(ApiClient client, Boolean value) {
        client.setFindInNullPointLocation(value);
    }

    public Boolean getAutoReconnectMode(ApiClient client) {
        return client.getAutoReconnectMode();
    }

    public void setAutoReconnectMode(ApiClient client, Boolean newState) {
        client.setAutoReconnectMode(newState);
    }

    public Boolean getPauseOnDisconnectMode(ApiClient client) {
        return client.getPauseOnDisconnectMode();
    }

    public void setPauseOnDisconnectMode(ApiClient client, Boolean newState) {
        client.setPauseOnDisconnectMode(newState);
    }

    public Integer getAutoBuyDelay(ApiClient client) {
        return client.getAutoBuyDelay();
    }

    public void setAutoBuyDelay(ApiClient client, Integer value) {
        client.setAutoBuyDelay(value);
    }

    public Integer getAutoSellDelay(ApiClient client) {
        return client.getAutoSellDelay();
    }

    public void setAutoSellDelay(ApiClient client, Integer value) {
        client.setAutoSellDelay(value);
    }

    public Boolean getSilentMode(ApiClient client) {
        return client.getSilentMode();
    }

    public void setSilentMode(ApiClient client, Boolean value) {
        client.setSilentMode(value);
    }

    public Boolean getShowIPCExceptionWindow(ApiClient client) {
        return client.getShowIPCExceptionWindow();
    }

    public void setShowIPCExceptionWindow(ApiClient client, Boolean state) {
        client.setShowIPCExceptionWindow(state);
    }

    public Integer getDressSpeed(ApiClient client) {
        return client.getDressSpeed();
    }

    public void setDressSpeed(ApiClient client, Integer value) {
        client.setDressSpeed(value);
    }

    public void setUnEquipItemsMacro(ApiClient client) {
        client.setUnequipItemsMacro();
    }

    public void setEquipItemsMacro(ApiClient client) {
        client.setEquipItemsMacro();
    }

    public void setBadLocation(ApiClient client, Point2DDto point2DDto) {
        client.setBadLocation(point2DDto.getX(), point2DDto.getY());
    }

    public void setGoodLocation(ApiClient client, Point2DDto point2DDto) {
        client.setGoodLocation(point2DDto.getX(), point2DDto.getY());
    }

    public void clearBadLocationList(ApiClient client) {
        client.clearBadLocationList();
    }

    public void setBadObject(ApiClient client, BadObjectDto badObjectDto) {
        client.setBadObject(badObjectDto.getType(), badObjectDto.getColor(), badObjectDto.getRadius());
    }

    public void clearBadObjectList(ApiClient client) {
        client.clearBadObjectList();
    }

    public Boolean getCoordinationCheckOnDrop(ApiClient client) {
        return client.getCoordinationCheckOnDrop();
    }

    public void setCoordinationCheckOnDrop(ApiClient client, Boolean value) {
        client.setCoordinationCheckOnDrop(value);
    }

    public Integer getDropDelay(ApiClient client) {
        return client.getDropDelay();
    }

    public void setDropDelay(ApiClient client, Integer value) {
        client.setDropDelay(value);
    }

    public void setCatchBag(ApiClient client, Long objectIdentity) {
        client.setCatchBag(objectIdentity);
    }

    public void unsetCatchBag(ApiClient client) {
        client.unsetCatchBag();
    }

    public Long getPickupItem(ApiClient client) {
        return client.getPickupItem();
    }

    public void setPickupItem(ApiClient client, Long itemIdentity) {
        client.setPickupItem(itemIdentity);
    }
}
