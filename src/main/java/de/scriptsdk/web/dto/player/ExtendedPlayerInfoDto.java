package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.enums.Race;
import de.scriptsdk.api.model.mobile.ExtendedPlayerInfoResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExtendedPlayerInfoDto {

    private Integer maxWeight = 0;
    private Race race = Race.HUMAN;
    private Integer statCap = 0;
    private Integer maximumPets = 0;
    private Integer currentPets = 0;
    private Integer currentFireResistance = 0;
    private Integer currentColdResistance = 0;
    private Integer currentPoisonResistance = 0;
    private Integer currentEnergyResistance = 0;
    private Integer maximumFireResistance = 0;
    private Integer maximumColdResistance = 0;
    private Integer maximumPoisonResistance = 0;
    private Integer maximumEnergyResistance = 0;
    private Integer tithingPoints = 0;
    private Integer luck = 0;
    private Integer minimumDamage = 0;
    private Integer maximumDamage = 0;
    private Integer maximumArmor = 0;
    private Integer defenseChance = 0;
    private Integer maximumDefenseChance = 0;
    private Integer hitChanceIncrease = 0;
    private Integer damageIncrease = 0;
    private Integer swingSpeedIncrease = 0;
    private Integer lowerReagentCost = 0;
    private Integer spellDamageIncrease = 0;
    private Integer fasterCastRecovery = 0;
    private Integer fasterCasting = 0;
    private Integer lowerManaCost = 0;
    private Integer hitPointRegeneration = 0;
    private Integer staminaRegeneration = 0;
    private Integer manaRegeneration = 0;
    private Integer reflectPhysicalDamage = 0;
    private Integer enhancePotions = 0;
    private Integer strengthIncrease = 0;
    private Integer dexterityIncrease = 0;
    private Integer intelligenceIncrease = 0;
    private Integer hitPointIncrease = 0;
    private Integer staminaIncrease = 0;
    private Integer manaIncrease = 0;

    public ExtendedPlayerInfoDto(ExtendedPlayerInfoResponse response) {
        this.setMaxWeight(response.getMaxWeight());
        this.setRace(response.getRace());
        this.setStatCap(response.getStatCap());
        this.setMaximumPets(response.getMaximumPets());
        this.setCurrentPets(response.getCurrentPets());
        this.setCurrentFireResistance(response.getCurrentFireResistance());
        this.setCurrentColdResistance(response.getCurrentColdResistance());
        this.setCurrentPoisonResistance(response.getCurrentPoisonResistance());
        this.setCurrentEnergyResistance(response.getCurrentEnergyResistance());
        this.setMaximumFireResistance(response.getMaximumFireResistance());
        this.setMaximumColdResistance(response.getMaximumColdResistance());
        this.setMaximumPoisonResistance(response.getMaximumPoisonResistance());
        this.setMaximumEnergyResistance(response.getMaximumEnergyResistance());
        this.setTithingPoints(response.getTithingPoints());
        this.setLuck(response.getLuck());
        this.setMinimumDamage(response.getMinimumDamage());
        this.setMaximumDamage(response.getMaximumDamage());
        this.setMaximumArmor(response.getMaximumArmor());
        this.setDefenseChance(response.getDefenseChance());
        this.setMaximumDefenseChance(response.getMaximumDefenseChance());
        this.setDamageIncrease(response.getDamageIncrease());
        this.setHitChanceIncrease(response.getHitChanceIncrease());
        this.setSwingSpeedIncrease(response.getSwingSpeedIncrease());
        this.setLowerReagentCost(response.getLowerReagentCost());
        this.setSpellDamageIncrease(response.getSpellDamageIncrease());
        this.setFasterCastRecovery(response.getFasterCastRecovery());
        this.setFasterCasting(response.getFasterCasting());
        this.setLowerManaCost(response.getLowerManaCost());
        this.setHitPointRegeneration(response.getHitPointRegeneration());
        this.setStaminaRegeneration(response.getStaminaRegeneration());
        this.setManaRegeneration(response.getManaRegeneration());
        this.setReflectPhysicalDamage(response.getReflectPhysicalDamage());
        this.setEnhancePotions(response.getEnhancePotions());
        this.setStrengthIncrease(response.getStrengthIncrease());
        this.setDexterityIncrease(response.getDexterityIncrease());
        this.setIntelligenceIncrease(response.getIntelligenceIncrease());
        this.setHitPointIncrease(response.getHitPointIncrease());
        this.setStaminaIncrease(response.getStaminaIncrease());
        this.setManaIncrease(response.getManaIncrease());

    }
}
