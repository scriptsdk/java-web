package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.Facet;
import de.scriptsdk.api.enums.Race;
import de.scriptsdk.core.exceptions.BaseException;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.PlayerService;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{id}/player")
public class PlayerController {
    final ClientService clientService;

    final PlayerService playerService;

    public PlayerController(ClientService clientService, PlayerService playerService) {
        this.clientService = clientService;
        this.playerService = playerService;
    }

    @GetMapping(path = "/strength", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getStrength(@PathVariable String id) throws BaseException {
        return playerService.getStrength(clientService.getClient(id));
    }

    @GetMapping(path = "/intelligence", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getIntelligence(@PathVariable String id) throws BaseException {
        return playerService.getIntelligence(clientService.getClient(id));
    }

    @GetMapping(path = "/dexterity", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getDexterity(@PathVariable String id) throws BaseException {
        return playerService.getDexterity(clientService.getClient(id));
    }

    @GetMapping(path = "/hitpoints", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getHitPoints(@PathVariable String id) throws BaseException {
        return playerService.getHitPoints(clientService.getClient(id));
    }

    @GetMapping(path = "/maxhitpoints", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMaxHitPoints(@PathVariable String id) throws BaseException {
        return playerService.getMaxHitPoints(clientService.getClient(id));
    }

    @GetMapping(path = "/mana", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMana(@PathVariable String id) throws BaseException {
        return playerService.getMana(clientService.getClient(id));
    }

    @GetMapping(path = "/maxmana", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMaxMana(@PathVariable String id) throws BaseException {
        return playerService.getMaxMana(clientService.getClient(id));
    }

    @GetMapping(path = "/stamina", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getStamina(@PathVariable String id) throws BaseException {
        return playerService.getStamina(clientService.getClient(id));
    }

    @GetMapping(path = "/maxstamina", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMaxStamina(@PathVariable String id) throws BaseException {
        return playerService.getMaxStamina(clientService.getClient(id));
    }

    @GetMapping(path = "/luck", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getLuck(@PathVariable String id) throws BaseException {
        return playerService.getLuck(clientService.getClient(id));
    }

    @GetMapping(path = "/totalstats", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getTotalStats(@PathVariable String id) throws BaseException {
        return playerService.getTotalStats(clientService.getClient(id));
    }

    @GetMapping(path = "armor", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getArmor(@PathVariable String id) throws BaseException {
        return playerService.getArmor(clientService.getClient(id));
    }

    @GetMapping(path = "weight", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getWeight(@PathVariable String id) throws BaseException {
        return playerService.getWeight(clientService.getClient(id));
    }

    @PostMapping(path = "opendoor", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void openDoor(@PathVariable String id) {
        playerService.openDoor(clientService.getClient(id));
    }

    @PostMapping(path = "bow", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void bow(@PathVariable String id) {
        playerService.bow(clientService.getClient(id));
    }

    @PostMapping(path = "salute", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void salute(@PathVariable String id) {
        playerService.salute(clientService.getClient(id));
    }

    @GetMapping(path = "predictedx", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getPredictedX(@PathVariable String id) {
        return playerService.getPredictedX(clientService.getClient(id));
    }

    @GetMapping(path = "predictedy", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getPredictedY(@PathVariable String id) {
        return playerService.getPredictedY(clientService.getClient(id));
    }

    @GetMapping(path = "predictedz", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getPredictedZ(@PathVariable String id) {
        return playerService.getPredictedZ(clientService.getClient(id));
    }

    @GetMapping(path = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getPlayerID(@PathVariable String id) {
        return playerService.getPlayerID(clientService.getClient(id));
    }

    @GetMapping(path = "name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getName(@PathVariable String id) {
        return playerService.getName(clientService.getClient(id));
    }

    @GetMapping(path = "facet", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Facet getFacet(@PathVariable String id) {
        return playerService.getFacet(clientService.getClient(id));
    }

    @GetMapping(path = "title", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody String getTitle(@PathVariable String id) {
        return playerService.getTitle(clientService.getClient(id));
    }

    @GetMapping(path = "gold", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getGold(@PathVariable String id) {
        return playerService.getGold(clientService.getClient(id));
    }

    @GetMapping(path = "maxweight", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMaxWeight(@PathVariable String id) {
        return playerService.getMaxWeight(clientService.getClient(id));
    }

    @GetMapping(path = "race", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Race getRace(@PathVariable String id) {
        return playerService.getRace(clientService.getClient(id));
    }

    @GetMapping(path = "maxpets", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getMaxPets(@PathVariable String id) {
        return playerService.getPets(clientService.getClient(id));
    }

    @GetMapping(path = "pets", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getPets(@PathVariable String id) {
        return playerService.getPets(clientService.getClient(id));
    }

    @GetMapping(path = "fireresistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getFireResistance(@PathVariable String id) {
        return playerService.getFireResistance(clientService.getClient(id));
    }

    @GetMapping(path = "coldresistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getColdResistance(@PathVariable String id) {
        return playerService.getColdResistance(clientService.getClient(id));
    }

    @GetMapping(path = "poisonresistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getPoisonResistance(@PathVariable String id) {
        return playerService.getPoisonResistance(clientService.getClient(id));
    }

    @GetMapping(path = "energyresistance", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Integer getEnergyResistance(@PathVariable String id) {
        return playerService.getEnergyResistance(clientService.getClient(id));
    }

    @GetMapping(path = "lastcontainer", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getLastContainer(@PathVariable String id) {
        return playerService.getLastContainer(clientService.getClient(id));
    }

    @GetMapping(path = "lasttarget", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getLastTarget(@PathVariable String id) {
        return playerService.getLastAttacker(clientService.getClient(id));
    }

    @GetMapping(path = "lastattacker", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getLastAttacker(@PathVariable String id) {
        return playerService.getLastAttacker(clientService.getClient(id));
    }

    @GetMapping(path = "laststatus", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getLastStatus(@PathVariable String id) {
        return playerService.getLastStatus(clientService.getClient(id));
    }

    @GetMapping(path = "lastobject", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getLastObject(@PathVariable String id) {
        return playerService.getLastObject(clientService.getClient(id));
    }

    @GetMapping(path = "backpack", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getBackpackID(@PathVariable String id) {
        return playerService.getBackpackID(clientService.getClient(id));
    }

    @GetMapping(path = "hidden", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isHidden(@PathVariable String id) {
        return playerService.isPoisoned(clientService.getClient(id));
    }

    @GetMapping(path = "poisoned", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isPoisoned(@PathVariable String id) {
        return playerService.isPoisoned(clientService.getClient(id));
    }

    @GetMapping(path = "paralyzed", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isParalyzed(@PathVariable String id) {
        return playerService.isParalyzed(clientService.getClient(id));
    }

    @GetMapping(path = "dead", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isDead(@PathVariable String id) {
        return playerService.isDead(clientService.getClient(id));
    }

    @GetMapping(path = "combattarget", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Long getCombatTarget(@PathVariable String id) {
        return playerService.getCombatTarget(clientService.getClient(id));
    }

    @PostMapping(path = "combatmode", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public void setCombatMode(@PathVariable String id, Boolean value) {
        playerService.setCombatMode(clientService.getClient(id), value);
    }

    @GetMapping(path = "immortal", produces = MediaType.APPLICATION_JSON_VALUE)
    @Description("")
    public @ResponseBody Boolean isImmortal(@PathVariable String id) {
        return playerService.isImmortal(clientService.getClient(id));
    }

    /*
    public Gender getGender() {}
    public ExtendedPlayerInfoResponse getExtendedInfo() {}

    public void usePrimaryAbility() {}
    public void useSecondaryAbility() {}
    public String getActiveAbility() {}
    public void toggleFly() {}
    public void changeStatLockState(StatKind statKind, LockState lockState) {}
    public LockState getStatLockState(StatKind statKind) {}
    public BaseList<BuffIconResponse> getBuffBarInfo() {}
    public Double getCurrentSkillValue(SkillType skillType) {}
    public void useSkill(SkillType skillType) {}
    public Double getSkillCap(SkillType skillType) {}
    public Double getSkillValue(SkillType skillType) {}
    public Boolean isActiveAbility(Ability ability) {}
    public Boolean isActiveSpellOrAbilityById(Integer id) {}
    public void setUnmountTimer(Integer value) {}
    public Integer getRunMountTimer() {}
    public void setRunMountTimer(Integer value) {}
    public Integer getWalkMountTimer() {}
    public void setWalkMountTimer(Integer value) {}
    public Integer getRunUnmountTimer() {}
    public Integer getWalkUnmountTimer() {}
    public void setWalkUnmountTimer(Integer value) {}
        public void setDress() {}
    public void requestHelpGump() {}
    public void requestQuestGump() {}
    public void requestVirtuesGump() {}
    public void useVirtue(VirtueType virtue) {}
    public void useVirtueById(Integer virtueAsValue) {}
        public void attack(Long combatTarget) {}
    public void usePaperdollScroll() {}
    public void changeSkillLockState(SkillType skillType, LockState lockState) {}
    public BaseList<LayerInfoResponse> getDressSet() {}
    public Direction getPredictedDirection() {}
    public Integer getLastStepQUsedDoor() {}
    public Integer step(Direction direction, Boolean performAsRunner) {}
    public Integer stepQ(Direction direction, Boolean performAsRunner) {}
    public void useBandageSelf() {}
    public LockState getSkillLockState(SkillType skillType) {}
    public void equipLastWeapon() {}
    public Boolean moveXYZ(Integer x, Integer y, Integer z, Integer accuracyXY, Integer accuracyZ, Boolean performAsRunner) {}
    public Boolean moveXY(Integer x, Integer y, Boolean optimized, Integer accuracyXY, Boolean performAsRunner) {}

    public void castSpellById(Integer spellID) {}

    public QuestArrowResponse getQuestArrow() {}


    public Boolean checkLineOfSight(Point3DRequest from, Point3DRequest to,

    public void stopMover() {}
     */
}
