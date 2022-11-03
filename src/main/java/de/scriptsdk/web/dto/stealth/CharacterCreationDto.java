package de.scriptsdk.web.dto.stealth;

import de.scriptsdk.api.enums.City;
import de.scriptsdk.api.enums.Gender;
import de.scriptsdk.api.enums.Race;
import de.scriptsdk.api.enums.SkillType;
import de.scriptsdk.api.model.account.CharacterCreationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CharacterCreationDto {
    private String profileName = "";
    private String shardName = "";
    private String charName = "";
    private Gender gender = Gender.MALE;
    private Race race = Race.HUMAN;
    private Integer strength = 0;
    private Integer dexterity = 0;
    private Integer intelligence = 0;
    private SkillType skillType1 = SkillType.ANATOMY;
    private SkillType skillType2 = SkillType.ANATOMY;
    private SkillType skillType3 = SkillType.ANATOMY;
    private SkillType skillType4 = SkillType.ANATOMY;
    private Double skillValue1 = 0.00;
    private Double skillValue2 = 0.00;
    private Double skillValue3 = 0.00;
    private Double skillValue4 = 0.00;
    private City city = City.NEW_HAVEN;
    private Integer slotIndex = 0;

    public CharacterCreationRequest toRequest() {
        CharacterCreationRequest request = new CharacterCreationRequest();

        request.setProfileName(this.getProfileName());
        request.setShardName(this.getShardName());
        request.setCharName(this.getCharName());
        request.setGender(this.getGender());
        request.setRace(this.getRace());
        request.setStrength(this.getStrength());
        request.setDexterity(this.getDexterity());
        request.setIntelligence(this.getIntelligence());
        request.setSkillType1(this.getSkillType1());
        request.setSkillType2(this.getSkillType2());
        request.setSkillType3(this.getSkillType3());
        request.setSkillType4(this.getSkillType4());
        request.setSkillValue1(this.getSkillValue1());
        request.setSkillValue2(this.getSkillValue2());
        request.setSkillValue3(this.getSkillValue3());
        request.setSkillValue4(this.getSkillValue4());
        request.setCity(this.getCity());
        request.setSlotIndex(this.getSlotIndex());

        return request;
    }
}
