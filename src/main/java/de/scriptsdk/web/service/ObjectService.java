package de.scriptsdk.web.service;

import de.scriptsdk.api.enums.Direction;
import de.scriptsdk.api.enums.Gender;
import de.scriptsdk.api.enums.Layer;
import de.scriptsdk.api.enums.Notoriety;
import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.api.model.properties.ClilocPropertyResponse;
import de.scriptsdk.web.dto.objects.ClilocPropertyDto;
import de.scriptsdk.web.dto.objects.ItemDescriptorDto;
import de.scriptsdk.web.dto.objects.RenamingDto;
import de.scriptsdk.web.dto.objects.UseItemOnMobileDto;
import de.scriptsdk.web.dto.player.DragItemDto;
import de.scriptsdk.web.dto.player.DropItemDto;
import de.scriptsdk.web.dto.player.LayerInfoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectService {

    public void usePaperdollScroll(ApiClient client, Long identity) {
        client.usePaperdollScroll(identity);
    }

    public Long getObjectAtLayer(ApiClient client, LayerInfoDto layerInfoDto) {
        return client.getObjectAtLayer(layerInfoDto.getLayer(), layerInfoDto.getId());
    }

    public void renameMobile(ApiClient client, RenamingDto renamingDto) {
        client.renameMobile(renamingDto.getMobIdentity(), renamingDto.getName());
    }

    public Boolean mobileCanBeRenamed(ApiClient client, Long identity) {
        return client.mobileCanBeRenamed(identity);
    }

    public String getName(ApiClient client, Long identity) {
        return client.getName(identity);
    }

    public String getAlternativeName(ApiClient client, Long identity) {
        return client.getAlternativeName(identity);
    }

    public String getTitle(ApiClient client, Long identity) {
        return client.getTitle(identity);
    }

    public Integer getStrength(ApiClient client, Long identity) {
        return client.getStrength(identity);
    }

    public Integer getIntelligence(ApiClient client, Long identity) {
        return client.getIntelligence(identity);
    }

    public Integer getDexterity(ApiClient client, Long identity) {
        return client.getDexterity(identity);
    }

    public Integer getHitPoints(ApiClient client, Long identity) {
        return client.getHitPoints(identity);
    }

    public Integer getMaxHitPoints(ApiClient client, Long identity) {
        return client.getMaxHitPoints(identity);
    }

    public Integer getMana(ApiClient client, Long identity) {
        return client.getMana(identity);
    }

    public Integer getMaxMana(ApiClient client, Long identity) {
        return client.getMaxMana(identity);
    }

    public Integer getStamina(ApiClient client, Long identity) {
        return client.getStamina(identity);
    }

    public Integer getMaxStamina(ApiClient client, Long identity) {
        return client.getMaxStamina(identity);
    }

    public Notoriety getNotoriety(ApiClient client, Long identity) {
        return client.getNotoriety(identity);
    }

    public Boolean isInCombatMode(ApiClient client, Long identity) {
        return client.isInCombatMode(identity);
    }

    public Boolean isNPC(ApiClient client, Long identity) {
        return client.isNPC(identity);
    }

    public Boolean isDead(ApiClient client, Long identity) {
        return client.isDead(identity);
    }

    public Boolean isRunning(ApiClient client, Long identity) {
        return client.isRunning(identity);
    }

    public Boolean isImmortal(ApiClient client, Long identity) {
        return client.isImmortal(identity);
    }

    public Boolean isPoisoned(ApiClient client, Long identity) {
        return client.isPoisoned(identity);
    }

    public Boolean isParalyzed(ApiClient client, Long identity) {
        return client.isParalyzed(identity);
    }

    public Gender getGender(ApiClient client, Long identity) {
        return client.getGender(identity);
    }

    public Integer getX(ApiClient client, Long identity) {
        return client.getX(identity);
    }

    public Integer getY(ApiClient client, Long identity) {
        return client.getY(identity);
    }

    public Layer getLayer(ApiClient client, Long identity) {
        return client.getLayer(identity);
    }

    public void requestStatus(ApiClient client, Long identity) {
        client.requestStatus(identity);
    }

    public Integer getZ(ApiClient client, Long identity) {
        return client.getZ(identity);
    }

    public String getTooltip(ApiClient client, Long identity) {
        return client.getTooltip(identity);
    }

    public Integer getType(ApiClient client, Long identity) {
        return client.getType(identity);
    }

    public List<ClilocPropertyDto> getProperties(ApiClient client, Long identity) {

        List<ClilocPropertyResponse> list = client.getProperties(identity);

        List<ClilocPropertyDto> returnable = new ArrayList<>();

        for (ClilocPropertyResponse response : list) {
            returnable.add(new ClilocPropertyDto(response));
        }

        return returnable;
    }

    public Integer getPrice(ApiClient client, Long identity) {
        return client.getPrice(identity);
    }

    public Boolean isObjectExists(ApiClient client, Long identity) {
        return client.isObjectExists(identity);
    }

    public Direction getDirection(ApiClient client, Long identity) {
        return client.getDirection(identity);
    }

    public Integer getDistance(ApiClient client, Long identity) {
        return client.getDistance(identity);
    }

    public Integer getColor(ApiClient client, Long identity) {
        return client.getColor(identity);
    }

    public Boolean isHidden(ApiClient client, Long identity) {
        return client.isHidden(identity);
    }

    public Boolean isMovable(ApiClient client, Long identity) {
        return client.isMovable(identity);
    }

    public Long getParent(ApiClient client, Long identity) {
        return client.getParent(identity);
    }

    public void useItemOnMobile(ApiClient client, UseItemOnMobileDto itemOnMobileDto) {
        client.useItemOnMobile(itemOnMobileDto.getItemId(), itemOnMobileDto.getMobileId());
    }

    public Integer getQuantity(ApiClient client, Long identity) {
        return client.getQuantity(identity);
    }

    public Boolean isContainer(ApiClient client, Long identity) {
        return client.isContainer(identity);
    }

    public void useObject(ApiClient client, Long identity) {
        client.getStrength(identity);
    }

    public Long useType(ApiClient client, ItemDescriptorDto itemDescriptorDto) {
        return client.useType(itemDescriptorDto.getType(), itemDescriptorDto.getColor());
    }

    public Long useFromGround(ApiClient client, ItemDescriptorDto itemDescriptorDto) {
        return client.useFromGround(itemDescriptorDto.getType(), itemDescriptorDto.getColor());
    }

    public void clickOnObject(ApiClient client, Long identity) {
        client.getStrength(identity);
    }

    public void wearItem(ApiClient client, LayerInfoDto layerInfoDto) {
        client.wearItem(layerInfoDto.getLayer(), layerInfoDto.getId());
    }

    public Long useType(ApiClient client, Integer objectType) {
        return client.useType(objectType);
    }

    public Boolean dragItem(ApiClient client, DragItemDto dragItemDto) {
        return client.dragItem(dragItemDto.getId(), dragItemDto.getCount());
    }

    public Boolean dropItem(ApiClient client, DropItemDto dropItemDto) {
        return client.dropItem(dropItemDto.getMoveIntoID(), dropItemDto.getX(), dropItemDto.getY(), dropItemDto.getZ());
    }
}
