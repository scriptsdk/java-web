package de.scriptsdk.web.service;

import de.scriptsdk.api.enums.Facet;
import de.scriptsdk.api.enums.Race;
import de.scriptsdk.api.model.network.ApiClient;
import org.springframework.stereotype.Service;

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
}
