package de.scriptsdk.web.service;

import de.scriptsdk.api.enums.*;
import de.scriptsdk.api.model.assets.LayerInfoResponse;
import de.scriptsdk.api.model.buffs.BuffIconResponse;
import de.scriptsdk.api.model.geometry.Point3DRequest;
import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.player.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    public Integer getStrength(ApiClient client) {
        return client.getStrength();
    }

    public Integer getIntelligence(ApiClient client) {
        return client.getIntelligence();
    }

    public Integer getDexterity(ApiClient client) {
        return client.getDexterity();
    }

    public Integer getHitPoints(ApiClient client) {
        return client.getHitPoints();
    }

    public Integer getMaxHitPoints(ApiClient client) {
        return client.getMaxHitPoints();
    }

    public Integer getMana(ApiClient client) {
        return client.getMana();
    }

    public Integer getMaxMana(ApiClient client) {
        return client.getMaxMana();
    }

    public Integer getStamina(ApiClient client) {
        return client.getStamina();
    }

    public Integer getMaxStamina(ApiClient client) {
        return client.getMaxStamina();
    }

    public Integer getLuck(ApiClient client) {
        return client.getLuck();
    }

    public Integer getTotalStats(ApiClient client) {
        return client.getTotalStats();
    }

    public Integer getArmor(ApiClient client) {
        return client.getArmor();
    }

    public Integer getWeight(ApiClient client) {
        return client.getWeight();
    }

    public void openDoor(ApiClient client) {
        client.openDoor();
    }

    public void bow(ApiClient client) {
        client.bow();
    }

    public void salute(ApiClient client) {
        client.salute();
    }

    public Integer getPredictedX(ApiClient client) {
        return client.getPredictedX();
    }

    public Integer getPredictedY(ApiClient client) {
        return client.getPredictedY();
    }

    public Integer getPredictedZ(ApiClient client) {
        return client.getPredictedZ();
    }

    public Long getPlayerID(ApiClient client) {
        return client.getPlayerID();
    }

    public String getName(ApiClient client) {
        return client.getName();
    }

    public Facet getFacet(ApiClient client) {
        return client.getFacet();
    }

    public String getTitle(ApiClient client) {
        return client.getTitle();
    }

    public Integer getGold(ApiClient client) {
        return client.getGold();
    }

    public Integer getMaxWeight(ApiClient client) {
        return client.getMaxWeight();
    }

    public Race getRace(ApiClient client) {
        return client.getRace();
    }

    public Integer getMaxPets(ApiClient client) {
        return client.getPets();
    }

    public Integer getPets(ApiClient client) {
        return client.getPets();
    }

    public Integer getFireResistance(ApiClient client) {
        return client.getFireResistance();
    }

    public Integer getColdResistance(ApiClient client) {
        return client.getColdResistance();
    }

    public Integer getPoisonResistance(ApiClient client) {
        return client.getPoisonResistance();
    }

    public Integer getEnergyResistance(ApiClient client) {
        return client.getEnergyResistance();
    }

    public Long getLastContainer(ApiClient client) {
        return client.getLastContainer();
    }

    public Long getLastTarget(ApiClient client) {
        return client.getLastAttacker();
    }

    public Long getLastAttacker(ApiClient client) {
        return client.getLastAttacker();
    }

    public Long getLastStatus(ApiClient client) {
        return client.getLastStatus();
    }

    public Long getLastObject(ApiClient client) {
        return client.getLastObject();
    }

    public Long getBackpackID(ApiClient client) {
        return client.getBackpackID();
    }

    public Boolean isHidden(ApiClient client) {
        return client.isPoisoned();
    }

    public Boolean isPoisoned(ApiClient client) {
        return client.isPoisoned();
    }

    public Boolean isParalyzed(ApiClient client) {
        return client.isParalyzed();
    }

    public Boolean isDead(ApiClient client) {
        return client.isDead();
    }

    public Long getCombatTarget(ApiClient client) {
        return client.getCombatTarget();
    }

    public void setCombatMode(ApiClient client, Boolean value) {
        client.setCombatMode(value);
    }

    public Boolean isImmortal(ApiClient client) {
        return client.isImmortal();
    }

    public void toggleFly(ApiClient client) {
        client.toggleFly();
    }

    public String getActiveAbility(ApiClient client) {
        return client.getActiveAbility();
    }

    public void useSecondaryAbility(ApiClient client) {
        client.useSecondaryAbility();
    }

    public void usePrimaryAbility(ApiClient client) {
        client.usePrimaryAbility();
    }

    public ExtendedPlayerInfoDto getExtendedInfo(ApiClient client) {
        return new ExtendedPlayerInfoDto(client.getExtendedInfo());
    }

    public Gender getGender(ApiClient client) {
        return client.getGender();
    }

    public void useBandageSelf(ApiClient client) {
        client.useBandageSelf();
    }

    public void usePaperdollScroll(ApiClient client) {
        client.usePaperdollScroll();
    }

    public void requestVirtuesGump(ApiClient client) {
        client.requestVirtuesGump();
    }

    public void requestQuestGump(ApiClient client) {
        client.requestQuestGump();
    }

    public void requestHelpGump(ApiClient client) {
        client.requestHelpGump();
    }

    public void equipLastWeapon(ApiClient client) {
        client.equipLastWeapon();
    }

    public void stopMover(ApiClient client) {
        client.stopMover();
    }

    public void castSpellById(ApiClient client, Integer spellId) {
        client.castSpellById(spellId);
    }

    public void useVirtue(ApiClient client, VirtueType virtue) {
        client.useVirtue(virtue);
    }

    public void useVirtueById(ApiClient client, Integer virtueAsValue) {
        client.useVirtueById(virtueAsValue);
    }

    public void attack(ApiClient client, Long combatTarget) {
        client.attack(combatTarget);
    }

    public void changeStatLockState(ApiClient client, StateLockStateSetterDto lockStateSetterDto) {
        client.changeStatLockState(lockStateSetterDto.getStatKind(), lockStateSetterDto.getLockState());
    }

    public void changeSkillLockState(ApiClient client, SkillLockStateSetterDto lockStateSetterDto) {
        client.changeSkillLockState(lockStateSetterDto.getSkillType(), lockStateSetterDto.getLockState());
    }

    public void setDress(ApiClient client) {
        client.setDress();
    }

    public List<BuffIconMenuDto> getBuffBarInfo(ApiClient client) {
        List<BuffIconResponse> list = client.getBuffBarInfo();

        List<BuffIconMenuDto> returnable = new ArrayList<>();

        for (BuffIconResponse response : list) {
            returnable.add(new BuffIconMenuDto(response));
        }

        return returnable;
    }

    public LockState getStatLockState(ApiClient client, StatKind statKind) {
        return client.getStatLockState(statKind);
    }

    public Double getCurrentSkillValue(ApiClient client, SkillType skillType) {
        return client.getCurrentSkillValue(skillType);
    }

    public void useSkill(ApiClient client, SkillType skillType) {
        client.useSkill(skillType);
    }

    public Double getSkillValue(ApiClient client, SkillType skillType) {
        return client.getSkillValue(skillType);
    }

    public Boolean isActiveAbility(ApiClient client, Ability ability) {
        return client.isActiveAbility(ability);
    }

    public Boolean isActiveSpellOrAbilityById(ApiClient client, Integer value) {
        return client.isActiveSpellOrAbilityById(value);
    }

    public Integer step(ApiClient client, StepDto stepDto) {
        return client.step(stepDto.getDirection(), stepDto.getPerformAsRunner());
    }

    public Integer getLastStepQUsedDoor(ApiClient client) {
        return client.getLastStepQUsedDoor();
    }

    public Direction getPredictedDirection(ApiClient client) {
        return client.getPredictedDirection();
    }

    public List<LayerInfoDto> getDressSet(ApiClient client) {
        List<LayerInfoResponse> list = client.getDressSet();

        List<LayerInfoDto> returnable = new ArrayList<>();

        for (LayerInfoResponse response : list) {
            returnable.add(new LayerInfoDto(response));
        }

        return returnable;
    }

    public Integer stepQ(ApiClient client, StepDto stepDto) {
        return client.stepQ(stepDto.getDirection(), stepDto.getPerformAsRunner());
    }

    public LockState getSkillLockState(ApiClient client, SkillType skillType) {
        return client.getSkillLockState(skillType);
    }

    public Boolean moveXYZ(ApiClient client, Movement3DDto movement3DDto) {
        return client.moveXYZ(movement3DDto.getX(), movement3DDto.getY(), movement3DDto.getZ(),
                movement3DDto.getAccuracyXY(), movement3DDto.getAccuracyZ(), movement3DDto.getPerformAsRunner());
    }

    public Boolean moveXY(ApiClient client, Movement2DDto movement2DDto) {
        return client.moveXY(movement2DDto.getX(), movement2DDto.getY(), movement2DDto.getOptimized(),
                movement2DDto.getAccuracyXY(), movement2DDto.getPerformAsRunner());
    }

    public QuestArrowDto getQuestArrow(ApiClient client) {
        return new QuestArrowDto(client.getQuestArrow());
    }

    public Boolean checkLineOfSight(ApiClient client, LineOfSightDto lineOfSightDto) {
        Point3DRequest from = new Point3DRequest(lineOfSightDto.getFrom().getX(),
                lineOfSightDto.getFrom().getY(), lineOfSightDto.getFrom().getZ());

        Point3DRequest to = new Point3DRequest(lineOfSightDto.getTo().getX(),
                lineOfSightDto.getTo().getY(), lineOfSightDto.getTo().getZ());

        return client.checkLineOfSight(from, to, lineOfSightDto.getFacet(),
                lineOfSightDto.getLosType(), lineOfSightDto.getLosOption());
    }

    public Double getSkillCap(ApiClient client, SkillType skillType) {
        return client.getSkillCap(skillType);
    }

    public String getSkillById(ApiClient client, Integer skillId) {
        return client.getSkillById(skillId);
    }
}
