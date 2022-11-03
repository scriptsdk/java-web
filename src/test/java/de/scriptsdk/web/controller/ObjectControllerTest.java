package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.Direction;
import de.scriptsdk.api.enums.Gender;
import de.scriptsdk.api.enums.Layer;
import de.scriptsdk.api.enums.Notoriety;
import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.objects.ClilocPropertyDto;
import de.scriptsdk.web.dto.objects.ItemDescriptorDto;
import de.scriptsdk.web.dto.objects.RenamingDto;
import de.scriptsdk.web.dto.objects.UseItemOnMobileDto;
import de.scriptsdk.web.dto.player.DragItemDto;
import de.scriptsdk.web.dto.player.DropItemDto;
import de.scriptsdk.web.dto.player.LayerInfoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class ObjectControllerTest extends AbstractControllerTest {

    protected ObjectControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void usePaperdollScroll() {
        MvcResult result = getClient().post("use-paperdoll-scroll", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getObjectAtLayer() {
        Long value = getClient().get("object-at-layer", getInfo().getId(), Long.class, new LayerInfoDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void renameMobile() {
        MvcResult result = getClient().post("rename-mobile", getInfo().getId(), new RenamingDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void mobileCanBeRenamed() {
        Boolean value = getClient().get("mobile-can-be-renamed", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getName() {
        String value = getClient().get("name", getInfo().getId(), String.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getAlternativeName() {
        String value = getClient().get("alternative-name", getInfo().getId(), String.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getTitle() {
        String value = getClient().get("title", getInfo().getId(), String.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStrength() {
        Integer value = getClient().get("strength", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getIntelligence() {
        Integer value = getClient().get("intelligence", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getDexterity() {
        Integer value = getClient().get("dexterity", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getHitPoints() {
        Integer value = getClient().get("hit-points", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxHitPoints() {
        Integer value = getClient().get("max-hit-points", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMana() {
        Integer value = getClient().get("mana", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxMana() {
        Integer value = getClient().get("max-mana", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStamina() {
        Integer value = getClient().get("stamina", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxStamina() {
        Integer value = getClient().get("max-stamina", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getNotoriety() {
        Notoriety value = getClient().get("notoriety", getInfo().getId(), Notoriety.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isInCombatMode() {
        Boolean value = getClient().get("is-in-combat-mode", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isNPC() {
        Boolean value = getClient().get("is-npc", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isDead() {
        Boolean value = getClient().get("is-dead", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isRunning() {
        Boolean value = getClient().get("is-running", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isImmortal() {
        Boolean value = getClient().get("is-immortal", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isPoisoned() {
        Boolean value = getClient().get("is-poisoned", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isParalyzed() {
        Boolean value = getClient().get("is-paralyzed", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGender() {
        Gender value = getClient().get("gender", getInfo().getId(), Gender.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getX() {
        Integer value = getClient().get("x", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getY() {
        Integer value = getClient().get("y", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLayer() {
        Layer value = getClient().get("layer", getInfo().getId(), Layer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void requestStatus() {
        MvcResult result = getClient().post("request-status", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getZ() {
        Integer value = getClient().get("z", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getTooltip() {
        String value = getClient().get("tooltip", getInfo().getId(), String.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getType() {
        Integer value = getClient().get("type", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getProperties() {
        List<ClilocPropertyDto> value = Arrays.stream(getClient().get("properties",
                getInfo().getId(), ClilocPropertyDto[].class, 0L)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getPrice() {
        Integer value = getClient().get("price", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isObjectExists() {
        Boolean value = getClient().get("is-object-exist", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getDirection() {
        Direction value = getClient().get("direction", getInfo().getId(), Direction.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getDistance() {
        Integer value = getClient().get("distance", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getColor() {
        Integer value = getClient().get("color", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isHidden() {
        Boolean value = getClient().get("is-hidden", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isMovable() {
        Boolean value = getClient().get("is-movable", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getParent() {
        Long value = getClient().get("parent", getInfo().getId(), Long.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void useItemOnMobile() {
        MvcResult result = getClient().post("use-item-on-mobile", getInfo().getId(), new UseItemOnMobileDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getQuantity() {
        Integer value = getClient().get("quantity", getInfo().getId(), Integer.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void isContainer() {
        Boolean value = getClient().get("is-container", getInfo().getId(), Boolean.class, 0L);

        Assertions.assertNotNull(value);
    }

    @Test
    void useObject() {
        MvcResult result = getClient().post("use-object", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void useType() {
        MvcResult result = getClient().post("use-type", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void useFromGround() {
        MvcResult result = getClient().post("use-from-ground", getInfo().getId(), new UseItemOnMobileDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void clickOnObject() {
        MvcResult result = getClient().post("click-on-object", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void wearItem() {
        MvcResult result = getClient().post("wear-item", getInfo().getId(), new LayerInfoDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void UseTypeAdvanced() {
        MvcResult result = getClient().post("use-type-advanced", getInfo().getId(), new ItemDescriptorDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void dragItem() {
        Boolean value = getClient().post("drag-item", getInfo().getId(), Boolean.class, new DragItemDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void dropItem() {
        Boolean value = getClient().post("drop-item", getInfo().getId(), Boolean.class, new DropItemDto());

        Assertions.assertNotNull(value);
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/object";
    }
}