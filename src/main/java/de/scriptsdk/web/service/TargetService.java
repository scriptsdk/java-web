package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.Assets.TileModelDto;
import de.scriptsdk.web.dto.geometry.Point3DDto;
import org.springframework.stereotype.Service;

@Service
public class TargetService {

    public Long getTargetID(ApiClient client) {
        return client.getTargetID();
    }

    public void cancelTarget(ApiClient client) {
        client.isTargetPresent();
    }

    public void targetToObject(ApiClient client, Long objectId) {
        client.targetToObject(objectId);
    }

    public void targetToXYZ(ApiClient client, Point3DDto point) {
        client.targetToXYZ(point.getX(), point.getY(), point.getZ());
    }

    public void targetToTile(ApiClient client, TileModelDto model) {
        client.targetToTile(model.getTile(), model.getX(), model.getY(), model.getZ());
    }

    public void waitTargetObject(ApiClient client, Long objectId) {
        client.waitTargetObject(objectId);
    }

    public void waitTargetTile(ApiClient client, TileModelDto model) {
        client.waitTargetTile(model.getTile(), model.getX(), model.getY(), model.getZ());
    }

    public void waitTargetXYZ(ApiClient client, Point3DDto point) {
        client.waitTargetXYZ(point.getX(), point.getY(), point.getZ());
    }

    public void waitTargetSelf(ApiClient client) {
        client.isTargetPresent();
    }

    public void waitTargetType(ApiClient client, Integer objectType) {
        client.waitTargetType(objectType);
    }

    public void cancelWaitTarget(ApiClient client) {
        client.cancelWaitTarget();
    }

    public void waitTargetGround(ApiClient client, Integer objectType) {
        client.waitTargetGround(objectType);
    }

    public void waitTargetLast(ApiClient client) {
        client.waitTargetLast();
    }

    public Boolean isTargetHookIsEnabled(ApiClient client) {
        return client.isTargetHookIsEnabled();
    }

    public Boolean isTargetPresent(ApiClient client) {
        return client.isTargetPresent();
    }
}
