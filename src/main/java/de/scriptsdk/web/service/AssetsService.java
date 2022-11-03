package de.scriptsdk.web.service;

import de.scriptsdk.api.model.assets.MultiItemResponse;
import de.scriptsdk.api.model.assets.StaticItemResponse;
import de.scriptsdk.api.model.assets.TileResultResponse;
import de.scriptsdk.api.model.geometry.Point2DResponse;
import de.scriptsdk.api.model.geometry.Point3DRequest;
import de.scriptsdk.api.model.geometry.Point3DResponse;
import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.core.model.generic.BaseList;
import de.scriptsdk.web.dto.assets.*;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import de.scriptsdk.web.dto.objects.ItemDescriptorDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetsService {
    public MapCellDto getMapCell(ApiClient client, Facet2DDto object) {
        return new MapCellDto(client.getMapCell(object.getX(), object.getY(), object.getFacet()));
    }

    public PassableWorldCellDto isWorldCellPassable(ApiClient client, WorldCellDto object) {
        return new PassableWorldCellDto(client.isWorldCellPassable(object.getFromX(), object.getFromY(),
                object.getFromZ(), object.getToX(), object.getToY(), object.getFacet()));
    }

    public List<TileResultDto> getTiles(ApiClient client, TilesDto dto) {
        BaseList<Integer> tiles = new BaseList<>(dto.getTiles());

        List<TileResultResponse> list = client.getTiles(dto.getType(), dto.getXMin(), dto.getYMin(),
                dto.getXMax(), dto.getYMax(), dto.getFacet(), tiles);

        List<TileResultDto> returnable = new ArrayList<>();

        for (TileResultResponse response : list) {
            returnable.add(new TileResultDto(response));
        }
        return returnable;
    }

    public BitmapDto getStaticArtBitmapAsArray(ApiClient client, ItemDescriptorDto object) {
        return new BitmapDto(client.getStaticArtBitmapAsArray(object.getType(), object.getColor()));
    }

    public Long getTileFlags(ApiClient client, TileFlagDto dto) {
        return client.getTileFlags(dto.getGroup(), dto.getTile());
    }

    public LandTileDto getLandTileData(ApiClient client, Integer tile) {
        return new LandTileDto(client.getLandTileData(tile));
    }

    public StaticTileDto getStaticTileData(ApiClient client, Integer tile) {
        return new StaticTileDto(client.getStaticTileData(tile));
    }

    public Integer getSurfaceZ(ApiClient client, Facet2DDto object) {
        return client.getSurfaceZ(object.getX(), object.getY(), object.getFacet());
    }

    public List<StaticItemDto> readStaticsXY(ApiClient client, Facet2DDto object) {
        List<StaticItemResponse> list = client.readStaticsXY(object.getX(), object.getY(), object.getFacet());

        List<StaticItemDto> returnable = new ArrayList<>();

        for (StaticItemResponse response : list) {
            returnable.add(new StaticItemDto(response));
        }
        return returnable;
    }

    public Integer getLayerCount(ApiClient client, Facet2DDto object) {
        return client.getLayerCount(object.getX(), object.getY(), object.getFacet());
    }

    public Long convertIntegerToTileFlags(ApiClient client, IntegerToTileFlagDto dto) {
        return client.getTileFlags(dto.getGroup(), dto.getFlags());
    }


    public List<MultiItemDto> getAllMultis(ApiClient client) {
        List<MultiItemResponse> list = client.getAllMultis();

        List<MultiItemDto> returnable = new ArrayList<>();

        for (MultiItemResponse response : list) {
            returnable.add(new MultiItemDto(response));
        }
        return returnable;
    }

    public List<Point2DDto> get2DPathArray(ApiClient client, Path2DPathArrayDto object) {
        List<Point2DResponse> list = client.getPathArray(object.getDestinationX(),
                object.getDestinationY(), object.getOptimizedMovement(), object.getAccuracy());

        List<Point2DDto> returnable = new ArrayList<>();

        for (Point2DResponse response : list) {
            returnable.add(new Point2DDto(response));
        }
        return returnable;
    }

    public List<Point3DDto> getPathArray3D(ApiClient client, Path3DPathArrayDto object) {

        Point3DRequest from = new Point3DRequest(object.getFromX(), object.getFromY(), object.getFromZ());
        Point3DRequest to = new Point3DRequest(object.getToX(), object.getToY(), object.getToZ());

        List<Point3DResponse> list = client.getPathArray3D(from, to, object.getFacet(),
                object.getAccuracyXY(), object.getAccuracyZ(), object.getPerformAsRunner());

        List<Point3DDto> returnable = new ArrayList<>();

        for (Point3DResponse response : list) {
            returnable.add(new Point3DDto(response));
        }
        return returnable;
    }

    public String getClilocByID(ApiClient client, Long identity) {
        return client.getClilocByID(identity);
    }
}
