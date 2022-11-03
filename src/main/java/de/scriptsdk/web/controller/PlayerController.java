package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.*;
import de.scriptsdk.web.dto.player.*;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/player")
public class PlayerController {
    final ClientService clientService;

    final PlayerService playerService;

    public PlayerController(ClientService clientService, PlayerService playerService) {
        this.clientService = clientService;
        this.playerService = playerService;
    }

    @GetMapping(path = "strength", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns strength", tags = {"player"})
    public @ResponseBody Integer getStrength(@PathVariable String id) {
        return playerService.getStrength(clientService.getClient(id));
    }

    @GetMapping(path = "intelligence", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns intelligence", tags = {"player"})
    public @ResponseBody Integer getIntelligence(@PathVariable String id) {
        return playerService.getIntelligence(clientService.getClient(id));
    }

    @GetMapping(path = "dexterity", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns dexterity", tags = {"player"})
    public @ResponseBody Integer getDexterity(@PathVariable String id) {
        return playerService.getDexterity(clientService.getClient(id));
    }

    @GetMapping(path = "hitpoints", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current hit points", tags = {"player"})
    public @ResponseBody Integer getHitPoints(@PathVariable String id) {
        return playerService.getHitPoints(clientService.getClient(id));
    }

    @GetMapping(path = "max-hitpoints", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum hit points", tags = {"player"})
    public @ResponseBody Integer getMaxHitPoints(@PathVariable String id) {
        return playerService.getMaxHitPoints(clientService.getClient(id));
    }

    @GetMapping(path = "mana", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current mana", tags = {"player"})
    public @ResponseBody Integer getMana(@PathVariable String id) {
        return playerService.getMana(clientService.getClient(id));
    }

    @GetMapping(path = "max-mana", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum mana", tags = {"player"})
    public @ResponseBody Integer getMaxMana(@PathVariable String id) {
        return playerService.getMaxMana(clientService.getClient(id));
    }

    @GetMapping(path = "stamina", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current stamina", tags = {"player"})
    public @ResponseBody Integer getStamina(@PathVariable String id) {
        return playerService.getStamina(clientService.getClient(id));
    }

    @GetMapping(path = "max-stamina", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum stamina", tags = {"player"})
    public @ResponseBody Integer getMaxStamina(@PathVariable String id) {
        return playerService.getMaxStamina(clientService.getClient(id));
    }

    @GetMapping(path = "luck", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current luck", tags = {"player"})
    public @ResponseBody Integer getLuck(@PathVariable String id) {
        return playerService.getLuck(clientService.getClient(id));
    }

    @GetMapping(path = "total-stats", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns total amount of current stats", tags = {"player"})
    public @ResponseBody Integer getTotalStats(@PathVariable String id) {
        return playerService.getTotalStats(clientService.getClient(id));
    }

    @GetMapping(path = "physical-resistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current physical resistance", tags = {"player"})
    public @ResponseBody Integer getArmor(@PathVariable String id) {
        return playerService.getArmor(clientService.getClient(id));
    }

    @GetMapping(path = "weight", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current weight", tags = {"player"})
    public @ResponseBody Integer getWeight(@PathVariable String id) {
        return playerService.getWeight(clientService.getClient(id));
    }

    @PostMapping(path = "open-door", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Opens a door", tags = {"player"})
    public void openDoor(@PathVariable String id) {
        playerService.openDoor(clientService.getClient(id));
    }

    @PostMapping(path = "bow", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Executes a bow", tags = {"player"})
    public void bow(@PathVariable String id) {
        playerService.bow(clientService.getClient(id));
    }

    @PostMapping(path = "salute", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Salutes", tags = {"player"})
    public void salute(@PathVariable String id) {
        playerService.salute(clientService.getClient(id));
    }

    @GetMapping(path = "predicted-x", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a prediction about next position x", tags = {"player"})
    public @ResponseBody Integer getPredictedX(@PathVariable String id) {
        return playerService.getPredictedX(clientService.getClient(id));
    }

    @GetMapping(path = "predicted-y", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a prediction about next position y", tags = {"player"})
    public @ResponseBody Integer getPredictedY(@PathVariable String id) {
        return playerService.getPredictedY(clientService.getClient(id));
    }

    @GetMapping(path = "predicted-z", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a prediction about next position z", tags = {"player"})
    public @ResponseBody Integer getPredictedZ(@PathVariable String id) {
        return playerService.getPredictedZ(clientService.getClient(id));
    }

    @GetMapping(path = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id", tags = {"player"})
    public @ResponseBody Long getPlayerID(@PathVariable String id) {
        return playerService.getPlayerID(clientService.getClient(id));
    }

    @GetMapping(path = "name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name", tags = {"player"})
    public @ResponseBody String getName(@PathVariable String id) {
        return playerService.getName(clientService.getClient(id));
    }

    @GetMapping(path = "facet", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current facet", tags = {"player"})
    public @ResponseBody Facet getFacet(@PathVariable String id) {
        return playerService.getFacet(clientService.getClient(id));
    }

    @GetMapping(path = "title", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns title", tags = {"player"})
    public @ResponseBody String getTitle(@PathVariable String id) {
        return playerService.getTitle(clientService.getClient(id));
    }

    @GetMapping(path = "gold", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current holding gold", tags = {"player"})
    public @ResponseBody Integer getGold(@PathVariable String id) {
        return playerService.getGold(clientService.getClient(id));
    }

    @GetMapping(path = "max-weight", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum weight", tags = {"player"})
    public @ResponseBody Integer getMaxWeight(@PathVariable String id) {
        return playerService.getMaxWeight(clientService.getClient(id));
    }

    @GetMapping(path = "race", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns race", tags = {"player"})
    public @ResponseBody Race getRace(@PathVariable String id) {
        return playerService.getRace(clientService.getClient(id));
    }

    @GetMapping(path = "max-pets", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maxmium pets", tags = {"player"})
    public @ResponseBody Integer getMaxPets(@PathVariable String id) {
        return playerService.getMaxPets(clientService.getClient(id));
    }

    @GetMapping(path = "pets", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current attached pets", tags = {"player"})
    public @ResponseBody Integer getPets(@PathVariable String id) {
        return playerService.getPets(clientService.getClient(id));
    }

    @GetMapping(path = "fire-resistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current fire resistance", tags = {"player"})
    public @ResponseBody Integer getFireResistance(@PathVariable String id) {
        return playerService.getFireResistance(clientService.getClient(id));
    }

    @GetMapping(path = "cold-resistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current cold resistance", tags = {"player"})
    public @ResponseBody Integer getColdResistance(@PathVariable String id) {
        return playerService.getColdResistance(clientService.getClient(id));
    }

    @GetMapping(path = "poison-resistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current poison resistance", tags = {"player"})
    public @ResponseBody Integer getPoisonResistance(@PathVariable String id) {
        return playerService.getPoisonResistance(clientService.getClient(id));
    }

    @GetMapping(path = "energy-resistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current energy resistance", tags = {"player"})
    public @ResponseBody Integer getEnergyResistance(@PathVariable String id) {
        return playerService.getEnergyResistance(clientService.getClient(id));
    }

    @GetMapping(path = "last-container", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of last viewed container", tags = {"player"})
    public @ResponseBody Long getLastContainer(@PathVariable String id) {
        return playerService.getLastContainer(clientService.getClient(id));
    }

    @GetMapping(path = "last-target", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of last target", tags = {"player"})
    public @ResponseBody Long getLastTarget(@PathVariable String id) {
        return playerService.getLastTarget(clientService.getClient(id));
    }

    @GetMapping(path = "last-attacker", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of last attacker", tags = {"player"})
    public @ResponseBody Long getLastAttacker(@PathVariable String id) {
        return playerService.getLastAttacker(clientService.getClient(id));
    }

    @GetMapping(path = "last-status", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of last viewed status window of a mobile ", tags = {"player"})
    public @ResponseBody Long getLastStatus(@PathVariable String id) {
        return playerService.getLastStatus(clientService.getClient(id));
    }

    @GetMapping(path = "last-object", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns last used object", tags = {"player"})
    public @ResponseBody Long getLastObject(@PathVariable String id) {
        return playerService.getLastObject(clientService.getClient(id));
    }

    @GetMapping(path = "backpack", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of backpack", tags = {"player"})
    public @ResponseBody Long getBackpackID(@PathVariable String id) {
        return playerService.getBackpackID(clientService.getClient(id));
    }

    @GetMapping(path = "is-hidden", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if player is hidden", tags = {"player"})
    public @ResponseBody Boolean isHidden(@PathVariable String id) {
        return playerService.isHidden(clientService.getClient(id));
    }

    @GetMapping(path = "is-poisoned", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if player is poisoned", tags = {"player"})
    public @ResponseBody Boolean isPoisoned(@PathVariable String id) {
        return playerService.isPoisoned(clientService.getClient(id));
    }

    @GetMapping(path = "is-paralyzed", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if player is paralyzed", tags = {"player"})
    public @ResponseBody Boolean isParalyzed(@PathVariable String id) {
        return playerService.isParalyzed(clientService.getClient(id));
    }

    @GetMapping(path = "is-dead", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if player is dead", tags = {"player"})
    public @ResponseBody Boolean isDead(@PathVariable String id) {
        return playerService.isDead(clientService.getClient(id));
    }

    @GetMapping(path = "combat-target", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns last combat target", tags = {"player"})
    public @ResponseBody Long getCombatTarget(@PathVariable String id) {
        return playerService.getCombatTarget(clientService.getClient(id));
    }

    @PostMapping(path = "combat-mode", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if player is in combat mode", tags = {"player"})
    public void setCombatMode(@PathVariable String id, @RequestBody Boolean value) {
        playerService.setCombatMode(clientService.getClient(id), value);
    }

    @GetMapping(path = "is-immortal", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if player is immortal", tags = {"player"})
    public @ResponseBody Boolean isImmortal(@PathVariable String id) {
        return playerService.isImmortal(clientService.getClient(id));
    }

    @GetMapping(path = "gender", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns gender", tags = {"player"})
    public @ResponseBody Gender getGender(@PathVariable String id) {
        return playerService.getGender(clientService.getClient(id));
    }

    @GetMapping(path = "extended-info", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns compressed extended info about player", tags = {"player"})
    public @ResponseBody ExtendedPlayerInfoDto getExtendedInfo(@PathVariable String id) {
        return playerService.getExtendedInfo(clientService.getClient(id));
    }

    @PostMapping(path = "use-primary-ability", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Uses primary ability", tags = {"player"})
    public void usePrimaryAbility(@PathVariable String id) {
        playerService.usePrimaryAbility(clientService.getClient(id));
    }

    @PostMapping(path = "use-secondary-ability", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Uses secondary ability", tags = {"player"})
    public void useSecondaryAbility(@PathVariable String id) {
        playerService.useSecondaryAbility(clientService.getClient(id));
    }

    @GetMapping(path = "active-ability", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current active ability", tags = {"player"})
    public @ResponseBody String getActiveAbility(@PathVariable String id) {
        return playerService.getActiveAbility(clientService.getClient(id));
    }

    @PostMapping(path = "toggle-fly", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Toggles fly mode on or off", tags = {"player"})
    public void toggleFly(@PathVariable String id) {
        playerService.toggleFly(clientService.getClient(id));
    }

    @GetMapping(path = "stat-lock-state", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns lock state of a certain stat kind", tags = {"player"})
    public @ResponseBody LockState getStatLockState(@PathVariable String id, @RequestBody StatKind statKind) {
        return playerService.getStatLockState(clientService.getClient(id), statKind);
    }

    @GetMapping(path = "buffs", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "returns a list of buffs", tags = {"player"})
    public @ResponseBody List<BuffIconMenuDto> getBuffBarInfo(@PathVariable String id) {
        return playerService.getBuffBarInfo(clientService.getClient(id));
    }

    @GetMapping(path = "current-skill-value", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current skill value of a certain skill", tags = {"player"})
    public @ResponseBody Double getCurrentSkillValue(@PathVariable String id, @RequestBody SkillType skillType) {
        return playerService.getCurrentSkillValue(clientService.getClient(id), skillType);
    }

    @PostMapping(path = "use-skill", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Uses a certain skill", tags = {"player"})
    public void useSkill(@PathVariable String id, @RequestBody SkillType skillType) {
        playerService.useSkill(clientService.getClient(id), skillType);
    }

    @GetMapping(path = "skill-cap", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns skill cap value of a certain skill", tags = {"player"})
    public @ResponseBody Double getSkillCap(@PathVariable String id, @RequestBody SkillType skillType) {
        return playerService.getSkillCap(clientService.getClient(id), skillType);
    }

    @GetMapping(path = "skill-value", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns skill value of a certain skill", tags = {"player"})
    public @ResponseBody Double getSkillValue(@PathVariable String id, @RequestBody SkillType skillType) {
        return playerService.getSkillValue(clientService.getClient(id), skillType);
    }

    @GetMapping(path = "is-active-ability", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if a certain ability is active", tags = {"player"})
    public @ResponseBody Boolean isActiveAbility(@PathVariable String id, @RequestBody Ability ability) {
        return playerService.isActiveAbility(clientService.getClient(id), ability);
    }

    @GetMapping(path = "is-active-by-id", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if skills, spells or abilities are active by id", tags = {"player"})
    public @ResponseBody Boolean isActiveSpellOrAbilityById(@PathVariable String id, @RequestBody Integer value) {
        return playerService.isActiveSpellOrAbilityById(clientService.getClient(id), value);
    }

    @GetMapping(path = "dress-set", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a list of current dressed items", tags = {"player"})
    public @ResponseBody List<LayerInfoDto> getDressSet(@PathVariable String id) {
        return playerService.getDressSet(clientService.getClient(id));
    }

    @GetMapping(path = "predicted-direction", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns next predicted direction", tags = {"player"})
    public @ResponseBody Direction getPredictedDirection(@PathVariable String id) {
        return playerService.getPredictedDirection(clientService.getClient(id));
    }

    @GetMapping(path = "last-stepq-used-door", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(tags = {"player"})
    public @ResponseBody Integer getLastStepQUsedDoor(@PathVariable String id) {
        return playerService.getLastStepQUsedDoor(clientService.getClient(id));
    }

    @PostMapping(path = "step", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Performs a step", tags = {"player"})
    public @ResponseBody Integer step(@PathVariable String id, @RequestBody StepDto stepDto) {
        return playerService.step(clientService.getClient(id), stepDto);
    }

    @PostMapping(path = "stepq", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Performs a stepq", tags = {"player"})
    public @ResponseBody Integer stepQ(@PathVariable String id, @RequestBody StepDto stepDto) {
        return playerService.stepQ(clientService.getClient(id), stepDto);
    }

    @GetMapping(path = "skill-lock-state", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns skill lock state of a certain skill", tags = {"player"})
    public @ResponseBody LockState getSkillLockState(@PathVariable String id, @RequestBody SkillType skillType) {
        return playerService.getSkillLockState(clientService.getClient(id), skillType);
    }

    @PostMapping(path = "move-xyz", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Moves towards a certain 3D location", tags = {"player"})
    public @ResponseBody Boolean moveXYZ(@PathVariable String id, @RequestBody Movement3DDto movement3DDto) {
        return playerService.moveXYZ(clientService.getClient(id), movement3DDto);
    }

    @PostMapping(path = "move-xy", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Moves towards a certain 2D location", tags = {"player"})
    public @ResponseBody Boolean moveXY(@PathVariable String id, @RequestBody Movement2DDto movement2DDto) {
        return playerService.moveXY(clientService.getClient(id), movement2DDto);
    }

    @GetMapping(path = "quest-arrow", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns 2D location targeted by Quest arrow", tags = {"player"})
    public @ResponseBody QuestArrowDto getQuestArrow(@PathVariable String id) {
        return playerService.getQuestArrow(clientService.getClient(id));
    }

    @PostMapping(path = "check-line-of-sight", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Performs a line of sight check and returns result", tags = {"player"})
    public @ResponseBody Boolean checkLineOfSight(@PathVariable String id, @RequestBody LineOfSightDto lineOfSightDto) {
        return playerService.checkLineOfSight(clientService.getClient(id), lineOfSightDto);
    }

    @PostMapping(path = "equip-last-weapon")
    @Operation(summary = "Equips the last used weapons", tags = {"player"})
    public void equipLastWeapon(@PathVariable String id) {
        playerService.equipLastWeapon(clientService.getClient(id));
    }

    @PostMapping(path = "stop-mover")
    @Operation(summary = "Stops an executed movement", tags = {"player"})
    public void stopMover(@PathVariable String id) {
        playerService.stopMover(clientService.getClient(id));
    }

    @PostMapping(path = "cast-spell-by-id", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Casts a spell by passed id", tags = {"player"})
    public void castSpellById(@PathVariable String id, @RequestBody Integer spellId) {
        playerService.castSpellById(clientService.getClient(id), spellId);
    }

    @PostMapping(path = "use-virtue", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Use certain virtue", tags = {"player"})
    public void useVirtue(@PathVariable String id, @RequestBody VirtueType virtue) {
        playerService.useVirtue(clientService.getClient(id), virtue);
    }

    @PostMapping(path = "use-virtue-by-id", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Use certain virtue by id", tags = {"player"})
    public void useVirtueById(@PathVariable String id, @RequestBody Integer virtueAsValue) {
        playerService.useVirtueById(clientService.getClient(id), virtueAsValue);
    }

    @PostMapping(path = "attack", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Performs an attack towards a certain id", tags = {"player"})
    public void attack(@PathVariable String id, @RequestBody Long combatTarget) {
        playerService.attack(clientService.getClient(id), combatTarget);
    }

    @PostMapping(path = "change-state-lock-state", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Changes the lock state of a certain stat kind", tags = {"player"})
    public void changeStatLockState(@PathVariable String id, @RequestBody StateLockStateSetterDto lockStateSetterDto) {
        playerService.changeStatLockState(clientService.getClient(id), lockStateSetterDto);
    }

    @PostMapping(path = "change-skill-lock-state", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Changes the lock state of a certain skill", tags = {"player"})
    public void changeSkillLockState(@PathVariable String id, @RequestBody SkillLockStateSetterDto lockStateSetterDto) {
        playerService.changeSkillLockState(clientService.getClient(id), lockStateSetterDto);
    }

    @PostMapping(path = "dress")
    @Operation(summary = "Stores current paperdoll as a set of dress", tags = {"player"})
    public void setDress(@PathVariable String id) {
        playerService.setDress(clientService.getClient(id));
    }

    @PostMapping(path = "request-help-gump")
    @Operation(summary = "Requests help gump", tags = {"player"})
    public void requestHelpGump(@PathVariable String id) {
        playerService.requestHelpGump(clientService.getClient(id));
    }

    @PostMapping(path = "request-quest-gump")
    @Operation(summary = "Requests quest gump", tags = {"player"})
    public void requestQuestGump(@PathVariable String id) {
        playerService.requestQuestGump(clientService.getClient(id));
    }

    @PostMapping(path = "request-virtues-gump")
    @Operation(summary = "Requests virtues gump", tags = {"player"})
    public void requestVirtuesGump(@PathVariable String id) {
        playerService.requestVirtuesGump(clientService.getClient(id));
    }

    @PostMapping(path = "use-paperdoll-scroll")
    @Operation(summary = "Opens paperdoll", tags = {"player"})
    public void usePaperdollScroll(@PathVariable String id) {
        playerService.usePaperdollScroll(clientService.getClient(id));
    }

    @GetMapping(path = "skill-name-by-id", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns skill name by id", tags = {"player"})
    public @ResponseBody String getSkillValue(@PathVariable String id, @RequestBody Integer skillId) {
        return playerService.getSkillById(clientService.getClient(id), skillId);
    }

    @PostMapping(path = "use-bandage-self")
    @Operation(summary = "Uses bandage on player", tags = {"player"})
    public void useBandageSelf(@PathVariable String id) {
        playerService.useBandageSelf(clientService.getClient(id));
    }
}
