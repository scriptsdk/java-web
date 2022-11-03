package de.scriptsdk.web.controller;

import de.scriptsdk.web.AbstractControllerTest;
import de.scriptsdk.web.dto.assets.*;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import de.scriptsdk.web.dto.objects.ItemDescriptorDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

class AssetsControllerTest extends AbstractControllerTest {

    protected AssetsControllerTest(WebApplicationContext context) {
        super(context);
    }

    @Test
    void getClilocByID() {
        String value = getClient().get("cliloc", getInfo().getId(), String.class, 1114779L);

        Assertions.assertNotNull(value);
    }

    @Test
    void getMapCell() {
        MapCellDto value = getClient().get("map-cell", getInfo().getId(), MapCellDto.class, new Facet2DDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void isWorldCellPassable() {
        PassableWorldCellDto value = getClient().get("is-world-cell-passable",
                getInfo().getId(), PassableWorldCellDto.class, new WorldCellDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void getTiles() {
        List<TileResultDto> value = Arrays.stream(getClient().get("tiles",
                getInfo().getId(), TileResultDto[].class, new TilesDto())).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getStaticArtBitmapAsArray() {
        BitmapDto value = getClient().get("bitmap", getInfo().getId(), BitmapDto.class, new ItemDescriptorDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void getTileFlags() {
        Long value = getClient().get("tile-flags", getInfo().getId(), Long.class, new TileFlagDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void getLandTileData() {
        LandTileDto value = getClient().get("land-tile", getInfo().getId(), LandTileDto.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void getStaticTileData() {
        StaticTileDto value = getClient().get("static-tile", getInfo().getId(), StaticTileDto.class, 0);

        Assertions.assertNotNull(value);
    }

    @Test
    void getSurfaceZ() {
        Integer value = getClient().get("surface-z", getInfo().getId(), Integer.class, new Facet2DDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void readStaticsXY() {
        List<StaticItemDto> value = Arrays.stream(getClient().get("static-items",
                getInfo().getId(), StaticItemDto[].class, new Facet2DDto())).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getLayerCount() {
        Integer value = getClient().get("layer-count", getInfo().getId(), Integer.class, new Facet2DDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void convertIntegerToTileFlags() {
        Long value = getClient().get("convert-integer-to-tile-flags",
                getInfo().getId(), Long.class, new IntegerToTileFlagDto());

        Assertions.assertNotNull(value);
    }

    @Test
    void getAllMultis() {
        List<MultiItemDto> value = Arrays.stream(getClient().get("multis",
                getInfo().getId(), MultiItemDto[].class)).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void get2DPathArray() {
        List<Point2DDto> value = Arrays.stream(getClient().get("path-2d-array",
                getInfo().getId(), Point2DDto[].class, new Path2DPathArrayDto())).toList();

        Assertions.assertNotNull(value);
    }

    @Test
    void getPathArray3D() {
        List<Point3DDto> value = Arrays.stream(getClient().get("path-3d-array",
                getInfo().getId(), Point3DDto[].class, new Path3DPathArrayDto())).toList();

        Assertions.assertNotNull(value);
    }

    @Override
    protected String getBaseUrl() {
        return "{id}/assets";
    }
}