package de.scriptsdk.web.controller;

import de.scriptsdk.api.enums.Direction;
import de.scriptsdk.api.enums.Gender;
import de.scriptsdk.api.enums.Layer;
import de.scriptsdk.api.enums.Notoriety;
import de.scriptsdk.web.dto.objects.ClilocPropertyDto;
import de.scriptsdk.web.dto.objects.ItemDescriptorDto;
import de.scriptsdk.web.dto.objects.RenamingDto;
import de.scriptsdk.web.dto.objects.UseItemOnMobileDto;
import de.scriptsdk.web.dto.player.DragItemDto;
import de.scriptsdk.web.dto.player.DropItemDto;
import de.scriptsdk.web.dto.player.LayerInfoDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.ObjectService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("{id}/object")
public class ObjectController {
    final ObjectService objectService;
    final ClientService clientService;

    public ObjectController(ObjectService objectService, ClientService clientService) {
        this.objectService = objectService;
        this.clientService = clientService;
    }

    @PostMapping(path = "use-paperdoll-scroll", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Opens paperdoll", tags = {"object"})
    public void usePaperdollScroll(@PathVariable String id, @RequestBody Long identity) {
        objectService.usePaperdollScroll(clientService.getClient(id), identity);
    }

    @GetMapping(path = "object-at-layer", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if from passed layer", tags = {"object"})
    public @ResponseBody Long getObjectAtLayer(@PathVariable String id, @RequestBody LayerInfoDto layerInfoDto) {
        return objectService.getObjectAtLayer(clientService.getClient(id), layerInfoDto);
    }

    @PostMapping(path = "rename-mobile", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Renames a mobile", tags = {"object"})
    public void renameMobile(@PathVariable String id, @RequestBody RenamingDto renamingDto) {
        objectService.renameMobile(clientService.getClient(id), renamingDto);
    }

    @GetMapping(path = "mobile-can-be-renamed", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile can be renamed", tags = {"object"})
    public @ResponseBody Boolean mobileCanBeRenamed(@PathVariable String id, @RequestBody Long identity) {
        return objectService.mobileCanBeRenamed(clientService.getClient(id), identity);
    }

    @GetMapping(path = "name", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns name", tags = {"object"})
    public @ResponseBody String getName(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getName(clientService.getClient(id), identity);
    }

    @GetMapping(path = "alternative-name", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns alternative name", tags = {"object"})
    public @ResponseBody String getAlternativeName(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getAlternativeName(clientService.getClient(id), identity);
    }

    @GetMapping(path = "title", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns title", tags = {"object"})
    public @ResponseBody String getTitle(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getTitle(clientService.getClient(id), identity);
    }

    @GetMapping(path = "strength", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns strength", tags = {"object"})
    public @ResponseBody Integer getStrength(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getStrength(clientService.getClient(id), identity);
    }

    @GetMapping(path = "intelligence", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns intelligence", tags = {"object"})
    public @ResponseBody Integer getIntelligence(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getIntelligence(clientService.getClient(id), identity);
    }

    @GetMapping(path = "dexterity", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns dexterity", tags = {"object"})
    public @ResponseBody Integer getDexterity(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getDexterity(clientService.getClient(id), identity);
    }

    @GetMapping(path = "hit-points", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current hit points", tags = {"object"})
    public @ResponseBody Integer getHitPoints(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getHitPoints(clientService.getClient(id), identity);
    }

    @GetMapping(path = "max-hit-points", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum hit points", tags = {"object"})
    public @ResponseBody Integer getMaxHitPoints(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getMaxHitPoints(clientService.getClient(id), identity);
    }

    @GetMapping(path = "mana", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current mana", tags = {"object"})
    public @ResponseBody Integer getMana(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getMana(clientService.getClient(id), identity);
    }

    @GetMapping(path = "max-mana", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum mana", tags = {"object"})
    public @ResponseBody Integer getMaxMana(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getMaxMana(clientService.getClient(id), identity);
    }

    @GetMapping(path = "stamina", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns current stamina", tags = {"object"})
    public @ResponseBody Integer getStamina(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getStamina(clientService.getClient(id), identity);
    }

    @GetMapping(path = "max-stamina", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns maximum stamina", tags = {"object"})
    public @ResponseBody Integer getMaxStamina(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getMaxStamina(clientService.getClient(id), identity);
    }

    @GetMapping(path = "notoriety", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns notoriety", tags = {"object"})
    public @ResponseBody Notoriety getNotoriety(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getNotoriety(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-in-combat-mode", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is in combat mode", tags = {"object"})
    public @ResponseBody Boolean isInCombatMode(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isInCombatMode(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-npc", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is a npc", tags = {"object"})
    public @ResponseBody Boolean isNPC(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isNPC(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-dead", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is dead", tags = {"object"})
    public @ResponseBody Boolean isDead(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isDead(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-running", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is running", tags = {"object"})
    public @ResponseBody Boolean isRunning(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isRunning(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-immortal", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is immortal", tags = {"object"})
    public @ResponseBody Boolean isImmortal(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isImmortal(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-poisoned", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is poisoned", tags = {"object"})
    public @ResponseBody Boolean isPoisoned(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isPoisoned(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-paralyzed", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is paralyzed", tags = {"object"})
    public @ResponseBody Boolean isParalyzed(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isParalyzed(clientService.getClient(id), identity);
    }

    @GetMapping(path = "gender", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns gender of mobile", tags = {"object"})
    public @ResponseBody Gender getGender(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getGender(clientService.getClient(id), identity);
    }

    @GetMapping(path = "x", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns x-axis", tags = {"object"})
    public @ResponseBody Integer getX(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getX(clientService.getClient(id), identity);
    }

    @GetMapping(path = "y", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns y-axis", tags = {"object"})
    public @ResponseBody Integer getY(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getY(clientService.getClient(id), identity);
    }

    @GetMapping(path = "layer", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns layer", tags = {"object"})
    public @ResponseBody Layer getLayer(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getLayer(clientService.getClient(id), identity);
    }

    @PostMapping(path = "request-status", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Opens status window", tags = {"object"})
    public void requestStatus(@PathVariable String id, @RequestBody Long identity) {
        objectService.requestStatus(clientService.getClient(id), identity);
    }

    @GetMapping(path = "z", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns z-axis", tags = {"object"})
    public @ResponseBody Integer getZ(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getZ(clientService.getClient(id), identity);
    }

    @GetMapping(path = "tooltip", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns tooltip", tags = {"object"})
    public @ResponseBody String getTooltip(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getTooltip(clientService.getClient(id), identity);
    }

    @GetMapping(path = "type", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns object type", tags = {"object"})
    public @ResponseBody Integer getType(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getType(clientService.getClient(id), identity);
    }


    @GetMapping(path = "properties", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns tooltip as cliloc properties", tags = {"object"})
    public @ResponseBody List<ClilocPropertyDto> getProperties(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getProperties(clientService.getClient(id), identity);
    }

    @GetMapping(path = "price", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns price", tags = {"object"})
    public @ResponseBody Integer getPrice(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getPrice(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-object-exist", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if object is valid", tags = {"object"})
    public @ResponseBody Boolean isObjectExists(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isObjectExists(clientService.getClient(id), identity);
    }

    @GetMapping(path = "direction", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns direction", tags = {"object"})
    public @ResponseBody Direction getDirection(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getDirection(clientService.getClient(id), identity);
    }

    @GetMapping(path = "distance", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns distance between object and player", tags = {"object"})
    public @ResponseBody Integer getDistance(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getDistance(clientService.getClient(id), identity);
    }

    @GetMapping(path = "color", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns object color", tags = {"object"})
    public @ResponseBody Integer getColor(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getColor(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-hidden", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if mobile is hidden", tags = {"object"})
    public @ResponseBody Boolean isHidden(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isHidden(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-movable", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if object is movable", tags = {"object"})
    public @ResponseBody Boolean isMovable(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isMovable(clientService.getClient(id), identity);
    }

    @GetMapping(path = "parent", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns id of parent", tags = {"object"})
    public @ResponseBody Long getParent(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getParent(clientService.getClient(id), identity);
    }

    @PostMapping(path = "use-item-on-mobile", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Uses an item onto mobile", tags = {"object"})
    public void useItemOnMobile(@PathVariable String id, @RequestBody UseItemOnMobileDto itemOnMobileDto) {
        objectService.useItemOnMobile(clientService.getClient(id), itemOnMobileDto);
    }

    @GetMapping(path = "quantity", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns quantity", tags = {"object"})
    public @ResponseBody Integer getQuantity(@PathVariable String id, @RequestBody Long identity) {
        return objectService.getQuantity(clientService.getClient(id), identity);
    }

    @GetMapping(path = "is-container", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if object is a container", tags = {"object"})
    public @ResponseBody Boolean isContainer(@PathVariable String id, @RequestBody Long identity) {
        return objectService.isContainer(clientService.getClient(id), identity);
    }

    @PostMapping(path = "use-object", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Double clicks object", tags = {"object"})
    public void useObject(@PathVariable String id, @RequestBody Long identity) {
        objectService.useObject(clientService.getClient(id), identity);
    }

    @PostMapping(path = "use-type-advanced", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Double clicks an object by params", tags = {"object"})
    public @ResponseBody Long useType(@PathVariable String id, @RequestBody ItemDescriptorDto itemDescriptorDto) {
        return objectService.useType(clientService.getClient(id), itemDescriptorDto);
    }

    @PostMapping(path = "use-from-ground", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Double clicks an object from ground by params", tags = {"object"})
    public @ResponseBody Long useFromGround(@PathVariable String id, @RequestBody ItemDescriptorDto itemDescriptorDto) {
        return objectService.useFromGround(clientService.getClient(id), itemDescriptorDto);
    }

    @PostMapping(path = "click-on-object", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Single click onto an object", tags = {"object"})
    public void clickOnObject(@PathVariable String id, @RequestBody Long identity) {
        objectService.clickOnObject(clientService.getClient(id), identity);
    }

    @PostMapping(path = "wear-item", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Wears an item", tags = {"object"})
    public void wearItem(@PathVariable String id, @RequestBody LayerInfoDto layerInfoDto) {
        objectService.wearItem(clientService.getClient(id), layerInfoDto);
    }

    @PostMapping(path = "use-type", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Double click object by Type", tags = {"object"})
    public @ResponseBody Long useType(@PathVariable String id, @RequestBody Integer objectType) {
        return objectService.useType(clientService.getClient(id), objectType);
    }

    @PostMapping(path = "drag-item", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Drags item", tags = {"object"})
    public @ResponseBody Boolean dragItem(@PathVariable String id, @RequestBody DragItemDto dragItemDto) {
        return objectService.dragItem(clientService.getClient(id), dragItemDto);
    }

    @PostMapping(path = "drop-item", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Drop item", tags = {"object"})
    public @ResponseBody Boolean dropItem(@PathVariable String id, @RequestBody DropItemDto dropItemDto) {
        return objectService.dropItem(clientService.getClient(id), dropItemDto);
    }
}
