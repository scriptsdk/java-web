package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.settings.BadObjectDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

class SettingsControllerTest extends AbstractControllerTest {

    protected SettingsControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getOpenDoorThroughMovement() {
        Boolean value = getClient().get("open-door-through-movement", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setOpenDoorThroughMovement() {
        MvcResult result = getClient().post("open-door-through-movement", getInfo().getId(), false);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getMovementThroughNPC() {
        Integer value = getClient().get("movement-through-npc", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setMovementThroughNPC() {
        MvcResult result = getClient().post("movement-through-npc", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getMovementThroughCorner() {
        Boolean value = getClient().get("movement-through-corner", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setMovementThroughCorner() {
        MvcResult result = getClient().post("movement-through-corner", getInfo().getId(), true);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getMoveHeuristicMulti() {
        Integer value = getClient().get("move-heuristic-multi", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setMoveHeuristicMulti() {
        MvcResult result = getClient().post("move-heuristic-multi", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getMoveCheckStamina() {
        Integer value = getClient().get("move-check-stamina", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setMoveCheckStamina() {
        MvcResult result = getClient().post("move-check-stamina", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getMovementTurnCost() {
        Integer value = getClient().get("movement-turn-cost", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setMovementTurnCost() {
        MvcResult result = getClient().post("movement-turn-cost", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getMovingBetweenTwoCorners() {
        Boolean value = getClient().get("moving-between-two-corners", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setMovingBetweenTwoCorners() {
        MvcResult result = getClient().post("moving-between-two-corners", getInfo().getId(), true);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getFindDistance() {
        Integer value = getClient().get("find-distance", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setFindDistance() {
        MvcResult result = getClient().post("find-distance", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getFindVertical() {
        Integer value = getClient().get("find-vertical", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setFindVertical() {
        MvcResult result = getClient().post("find-vertical", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getFindInNullPointLocation() {
        Boolean value = getClient().get("find-in-null-point-location", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setFindInNullPointLocation() {
        MvcResult result = getClient().post("find-in-null-point-location", getInfo().getId(), true);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getAutoReconnectMode() {
        Boolean value = getClient().get("auto-reconnect-mode", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setAutoReconnectMode() {
        MvcResult result = getClient().post("auto-reconnect-mode", getInfo().getId(), false);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getPauseOnDisconnectMode() {
        Boolean value = getClient().get("pause-on-disconnect-mode", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setPauseOnDisconnectMode() {
        MvcResult result = getClient().post("pause-on-disconnect-mode", getInfo().getId(), false);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getAutoBuyDelay() {
        Integer value = getClient().get("auto-buy-delay", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setAutoBuyDelay() {
        MvcResult result = getClient().post("auto-buy-delay", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getAutoSellDelay() {
        Integer value = getClient().get("auto-sell-delay", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setAutoSellDelay() {
        MvcResult result = getClient().post("auto-sell-delay", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getSilentMode() {
        Boolean value = getClient().get("silent-mode", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setSilentMode() {
        MvcResult result = getClient().post("silent-mode", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getShowIPCExceptionWindow() {
        Boolean value = getClient().get("show-ipc-exception-window", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setShowIPCExceptionWindow() {
        MvcResult result = getClient().post("show-ipc-exception-window", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getDressSpeed() {
        Integer value = getClient().get("dress-speed", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setDressSpeed() {
        MvcResult result = getClient().post("dress-speed", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setUnEquipItemsMacro() {
        MvcResult result = getClient().post("unequip-items-macro", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setEquipItemsMacro() {
        MvcResult result = getClient().post("equip-items-macro", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setBadLocation() {
        MvcResult result = getClient().post("bad-location", getInfo().getId(), new Point2DDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setGoodLocation() {
        MvcResult result = getClient().post("good-location", getInfo().getId(), new Point2DDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearBadLocationList() {
        MvcResult result = getClient().delete("clear-bad-location-list", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setBadObject() {
        MvcResult result = getClient().post("bad-object", getInfo().getId(), new BadObjectDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clearBadObjectList() {
        MvcResult result = getClient().delete("clear-bad-object-list", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getCoordinationCheckOnDrop() {
        Boolean value = getClient().get("coordination-check-on-drop", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setCoordinationCheckOnDrop() {
        MvcResult result = getClient().post("coordination-check-on-drop", getInfo().getId(), false);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getDropDelay() {
        Integer value = getClient().get("drop-delay", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setDropDelay() {
        MvcResult result = getClient().post("drop-delay", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setCatchBag() {
        MvcResult result = getClient().post("catch-bag", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void unsetCatchBag() {
        MvcResult result = getClient().delete("catch-bag", getInfo().getId());

        Assertions.assertNotNull(result);
    }

    @Test
    void getPickupItem() {
        Integer value = getClient().get("pickup-item", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setPickupItem() {
        MvcResult result = getClient().post("pickup-item", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setUnmountTimer() {
        MvcResult result = getClient().post("unmount-timer", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getRunMountTimer() {
        Integer value = getClient().get("run-mount-timer", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setRunMountTimer() {
        MvcResult result = getClient().post("run-mount-timer", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getWalkMountTimer() {
        Integer value = getClient().get("walk-mount-timer", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setWalkMountTimer() {
        MvcResult result = getClient().post("walk-mount-timer", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getRunUnmountTimer() {
        Integer value = getClient().get("run-mount-timer", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getWalkUnmountTimer() {
        Integer value = getClient().get("run-mount-timer", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setWalkUnmountTimer() {
        MvcResult result = getClient().post("walk-unmount-timer", getInfo().getId(), 500);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/settings";
    }
}