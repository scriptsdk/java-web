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
    private Gender gender;
    private Race race;
    private Integer strength;
    private Integer dexterity;
    private Integer intelligence;
    private SkillType skillType1;
    private SkillType skillType2;
    private SkillType skillType3;
    private SkillType skillType4;
    private Double skillValue1;
    private Double skillValue2;
    private Double skillValue3;
    private Double skillValue4;
    private City city;
    private Integer slotIndex;

    public CharacterCreationRequest toRequest() {
        CharacterCreationRequest request = new CharacterCreationRequest();

        request.setProfileNam(this.getProfileName());
        request.setProfileNam(this.getShardName());
        request.setProfileNam(this.getCharName());
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
