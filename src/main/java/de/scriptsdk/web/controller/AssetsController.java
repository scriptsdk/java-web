package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.assets.*;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import de.scriptsdk.web.dto.objects.ItemDescriptorDto;
import de.scriptsdk.web.service.AssetsService;
import de.scriptsdk.web.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/assets")
public class AssetsController {
    final AssetsService assetsService;
    final ClientService clientService;

    public AssetsController(AssetsService assetsService, ClientService clientService) {
        this.assetsService = assetsService;
        this.clientService = clientService;
    }

    @GetMapping(path = "cliloc", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns text of a certain cliloc id", tags = {"assets"})
    public @ResponseBody String getClilocByID(@PathVariable String id, @RequestBody Long identity) {
        return assetsService.getClilocByID(clientService.getClient(id), identity);
    }

    @GetMapping(path = "map-cell", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns map cell of a certain location", tags = {"assets"})
    public @ResponseBody MapCellDto getMapCell(@PathVariable String id, @RequestBody Facet2DDto object) {
        return assetsService.getMapCell(clientService.getClient(id), object);
    }

    @GetMapping(path = "is-world-cell-passable", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if world cell is passable", tags = {"assets"})
    public @ResponseBody PassableWorldCellDto isWorldCellPassable(@PathVariable String id, @RequestBody WorldCellDto object) {
        return assetsService.isWorldCellPassable(clientService.getClient(id), object);
    }

    @GetMapping(path = "tiles", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a list of Tiles by passed parameters", tags = {"assets"})
    public @ResponseBody List<TileResultDto> getTiles(@PathVariable String id, @RequestBody TilesDto object) {
        return assetsService.getTiles(clientService.getClient(id), object);
    }

    @GetMapping(path = "bitmap", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns object bitmap as byte array", tags = {"assets"})
    public @ResponseBody BitmapDto getStaticArtBitmapAsArray(@PathVariable String id, @RequestBody ItemDescriptorDto object) {
        return assetsService.getStaticArtBitmapAsArray(clientService.getClient(id), object);
    }

    @GetMapping(path = "tile-flags", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns tile flags", tags = {"assets"})
    public @ResponseBody Long getTileFlags(@PathVariable String id, @RequestBody TileFlagDto object) {
        return assetsService.getTileFlags(clientService.getClient(id), object);
    }

    @GetMapping(path = "land-tile", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns land tile info of passed tile type", tags = {"assets"})
    public @ResponseBody LandTileDto getLandTileData(@PathVariable String id, @RequestBody Integer tile) {
        return assetsService.getLandTileData(clientService.getClient(id), tile);
    }

    @GetMapping(path = "static-tile", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns static tile info of passed tile type", tags = {"assets"})
    public @ResponseBody StaticTileDto getStaticTileData(@PathVariable String id, @RequestBody Integer tile) {
        return assetsService.getStaticTileData(clientService.getClient(id), tile);
    }

    @GetMapping(path = "surface-z", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns z-axis of a passed surface", tags = {"assets"})
    public @ResponseBody Integer getSurfaceZ(@PathVariable String id, @RequestBody Facet2DDto object) {
        return assetsService.getSurfaceZ(clientService.getClient(id), object);
    }

    @GetMapping(path = "static-items", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a list of static items by passed map position", tags = {"assets"})
    public @ResponseBody List<StaticItemDto> readStaticsXY(@PathVariable String id, @RequestBody Facet2DDto object) {
        return assetsService.readStaticsXY(clientService.getClient(id), object);
    }

    @GetMapping(path = "layer-count", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of layers on passed map position", tags = {"assets"})
    public @ResponseBody Integer getLayerCount(@PathVariable String id, @RequestBody Facet2DDto object) {
        return assetsService.getLayerCount(clientService.getClient(id), object);
    }

    @GetMapping(path = "convert-integer-to-tile-flags", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Converts an integer to tile flags", tags = {"assets"})
    public @ResponseBody Long convertIntegerToTileFlags(@PathVariable String id, @RequestBody IntegerToTileFlagDto object) {
        return assetsService.convertIntegerToTileFlags(clientService.getClient(id), object);
    }

    @GetMapping(path = "multis", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a list of all multis", tags = {"assets"})
    public @ResponseBody List<MultiItemDto> getAllMultis(@PathVariable String id) {
        return assetsService.getAllMultis(clientService.getClient(id));
    }

    @GetMapping(path = "path-2d-array", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a 2D path array between 2 positions", tags = {"assets"})
    public @ResponseBody List<Point2DDto> get2DPathArray(@PathVariable String id, @RequestBody Path2DPathArrayDto object) {
        return assetsService.get2DPathArray(clientService.getClient(id), object);
    }

    @GetMapping(path = "path-3d-array", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns a 3D path array between 2 positions", tags = {"assets"})
    public @ResponseBody List<Point3DDto> getPathArray3D(@PathVariable String id, @RequestBody Path3DPathArrayDto object) {
        return assetsService.getPathArray3D(clientService.getClient(id), object);
    }
}
