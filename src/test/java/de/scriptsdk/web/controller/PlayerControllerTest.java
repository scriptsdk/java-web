package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.*;
import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.player.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class PlayerControllerTest extends AbstractControllerTest {

    protected PlayerControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getStrength() {
        Integer value = getClient().get("strength", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getIntelligence() {
        Integer value = getClient().get("intelligence", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getDexterity() {
        Integer value = getClient().get("dexterity", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getHitPoints() {
        Integer value = getClient().get("hitpoints", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxHitPoints() {
        Integer value = getClient().get("max-hitpoints", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMana() {
        Integer value = getClient().get("mana", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxMana() {
        Integer value = getClient().get("max-mana", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStamina() {
        Integer value = getClient().get("stamina", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxStamina() {
        Integer value = getClient().get("max-stamina", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLuck() {
        Integer value = getClient().get("luck", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getTotalStats() {
        Integer value = getClient().get("total-stats", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getArmor() {
        Integer value = getClient().get("physical-resistance", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getWeight() {
        Integer value = getClient().get("weight", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void openDoor() {
        MvcResult result = getClient().post("open-door", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void bow() {
        MvcResult result = getClient().post("bow", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void salute() {
        MvcResult result = getClient().post("salute", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getPredictedX() {
        Integer value = getClient().get("predicted-x", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getPredictedY() {
        Integer value = getClient().get("predicted-y", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getPredictedZ() {
        Integer value = getClient().get("predicted-z", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getPlayerID() {
        Long value = getClient().get("id", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getName() {
        String value = getClient().get("name", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getFacet() {
        Facet value = getClient().get("facet", getInfo().getId(), Facet.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getTitle() {
        String value = getClient().get("title", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGold() {
        Integer value = getClient().get("gold", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxWeight() {
        Integer value = getClient().get("max-weight", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getRace() {
        Race value = getClient().get("race", getInfo().getId(), Race.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMaxPets() {
        Integer value = getClient().get("max-pets", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getPets() {
        Integer value = getClient().get("pets", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getFireResistance() {
        Integer value = getClient().get("fire-resistance", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getColdResistance() {
        Integer value = getClient().get("cold-resistance", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getPoisonResistance() {
        Integer value = getClient().get("poison-resistance", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getEnergyResistance() {
        Integer value = getClient().get("energy-resistance", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastContainer() {
        Long value = getClient().get("last-container", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastTarget() {
        Long value = getClient().get("last-target", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastAttacker() {
        Long value = getClient().get("last-attacker", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastStatus() {
        Long value = getClient().get("last-status", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastObject() {
        Long value = getClient().get("last-object", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getBackpackID() {
        Long value = getClient().get("backpack", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isHidden() {
        Boolean value = getClient().get("is-hidden", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isPoisoned() {
        Boolean value = getClient().get("is-poisoned", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isParalyzed() {
        Boolean value = getClient().get("is-paralyzed", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void isDead() {
        Boolean value = getClient().get("is-dead", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getCombatTarget() {
        Long value = getClient().get("combat-target", getInfo().getId(), Long.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void setCombatMode() {
        MvcResult result = getClient().post("combat-mode", getInfo().getId(), false);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void isImmortal() {
        Boolean value = getClient().get("is-immortal", getInfo().getId(), Boolean.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getGender() {
        Gender value = getClient().get("gender", getInfo().getId(), Gender.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getExtendedInfo() {
        ExtendedPlayerInfoDto value = getClient().get("extended-info", getInfo().getId(), ExtendedPlayerInfoDto.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void usePrimaryAbility() {
        MvcResult result = getClient().post("use-primary-ability", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void useSecondaryAbility() {
        MvcResult result = getClient().post("use-secondary-ability", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getActiveAbility() {
        String value = getClient().get("active-ability", getInfo().getId(), String.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void toggleFly() {
        MvcResult result = getClient().post("toggle-fly", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getStatLockState() {
        LockState value = getClient().get("active-ability", getInfo().getId(), LockState.class, StatKind.STRENGTH);

        Assertions.assertNotNull(value);
    }

    @Test
    void getBuffBarInfo() {
        List<BuffIconMenuDto> value = Arrays.stream(getClient().get("buffs",
                getInfo().getId(), BuffIconMenuDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getCurrentSkillValue() {
        Double value = getClient().
                get("current-skill-value", getInfo().getId(), Double.class, SkillType.ALCHEMY);

        Assertions.assertNotNull(value);
    }

    @Test
    void useSkill() {
        MvcResult result = getClient().post("use-skill", getInfo().getId(), SkillType.ALCHEMY);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getSkillCap() {
        Double value = getClient().get("skill-cap", getInfo().getId(), Double.class, SkillType.ALCHEMY);

        Assertions.assertNotNull(value);
    }

    @Test
    void getSkillValue() {
        Double value = getClient().get("skill-value", getInfo().getId(), Double.class, SkillType.ALCHEMY);

        Assertions.assertNotNull(value);
    }

    @Test
    void isActiveAbility() {
        Boolean value = getClient().get("is-active-ability", getInfo().getId(), Boolean.class, Ability.FISTS_OF_FURY);

        Assertions.assertNotNull(value);
    }

    @Test
    void isActiveSpellOrAbilityById() {
        Boolean value = getClient().get("is-active-by-id", getInfo().getId(),
                Boolean.class, Ability.FISTS_OF_FURY.getId());

        Assertions.assertNotNull(value);
    }

    @Test
    void getDressSet() {
        List<LayerInfoDto> value = Arrays.stream(getClient().get("dress-set",
                getInfo().getId(), LayerInfoDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getPredictedDirection() {
        Direction value = getClient().get("predicted-direction", getInfo().getId(), Direction.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void getLastStepQUsedDoor() {
        Integer value = getClient().get("last-stepq-used-door", getInfo().getId(), Integer.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void step() {
        MvcResult result = getClient().post("step", getInfo().getId(), new StepDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void stepQ() {
        MvcResult result = getClient().post("stepq", getInfo().getId(), new StepDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void getSkillLockState() {
        LockState value = getClient().get("skill-lock-state", getInfo().getId(),
                LockState.class, SkillType.ALCHEMY);

        Assertions.assertNotNull(value);
    }

    @Test
    void moveXYZ() {
        Boolean value = getClient().post("move-xyz", getInfo().getId(), Boolean.class, new Movement3DDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void moveXY() {
        Boolean value = getClient().post("move-xy", getInfo().getId(), Boolean.class, new Movement2DDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void getQuestArrow() {
        QuestArrowDto value = getClient().get("quest-arrow", getInfo().getId(), QuestArrowDto.class);

        Assertions.assertNotNull(value);
    }

    @Test
    void checkLineOfSight() {
        Boolean value = getClient().post("check-line-of-sight", getInfo().getId(), Boolean.class, new LineOfSightDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void equipLastWeapon() {
        MvcResult result = getClient().post("equip-last-weapon", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void stopMover() {
        MvcResult result = getClient().post("stop-mover", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void castSpellById() {
        MvcResult result = getClient().post("cast-spell-by-id", getInfo().getId(), Spell.CREATE_FOOD.getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void useVirtue() {
        MvcResult result = getClient().post("use-virtue", getInfo().getId(), VirtueType.VALOR);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void useVirtueById() {
        MvcResult result = getClient().post("use-virtue-by-id", getInfo().getId(), VirtueType.VALOR.getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void attack() {
        MvcResult result = getClient().post("attack", getInfo().getId(), 0L);

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void changeStatLockState() {
        MvcResult result = getClient().post("change-state-lock-state", getInfo().getId(), new StateLockStateSetterDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void changeSkillLockState() {
        MvcResult result = getClient().post("change-skill-lock-state", getInfo().getId(), new SkillLockStateSetterDto());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void setDress() {
        MvcResult result = getClient().post("dress", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void requestHelpGump() {
        MvcResult result = getClient().post("request-help-gump", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void requestQuestGump() {
        MvcResult result = getClient().post("request-quest-gump", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void requestVirtuesGump() {
        MvcResult result = getClient().post("request-virtues-gump", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void usePaperdollScroll() {
        MvcResult result = getClient().post("use-paperdoll-scroll", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    void useBandageSelf() {
        MvcResult result = getClient().post("use-bandage-self", getInfo().getId());

        Assertions.assertEquals(200, result.getResponse().getStatus());
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/player";
    }
}