package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.core.model.generic.BaseList;
import de.scriptsdk.web.dto.geometry.Point2DDto;
import de.scriptsdk.web.dto.scanner.FindNotorietyDto;
import de.scriptsdk.web.dto.scanner.FindTypeDto;
import de.scriptsdk.web.dto.scanner.FindTypesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScannerService {

    public Long findType(ApiClient client, FindTypeDto findTypeDto) {
        return client.findType(findTypeDto.getType(), findTypeDto.getColor(),
                findTypeDto.getContainer(), findTypeDto.getScanRecursive());
    }

    public Long findNotoriety(ApiClient client, FindNotorietyDto findNotorietyDto) {
        return client.findNotoriety(findNotorietyDto.getType(), findNotorietyDto.getNotoriety());
    }

    public Long findAtCoordination(ApiClient client, Point2DDto point2DDto) {
        return client.findAtCoordination(point2DDto.getX(), point2DDto.getY());
    }

    public void ignore(ApiClient client, Long objectId) {
        client.ignore(objectId);
    }

    public void removeFromIgnoreList(ApiClient client, Long objectId) {
        client.removeFromIgnoreList(objectId);
    }

    public void resetIgnoreList(ApiClient client) {
        client.resetIgnoreList();
    }

    public List<Long> getIgnoreList(ApiClient client) {
        return client.getIgnoreList();
    }

    public List<Long> getFindList(ApiClient client) {
        return client.getFindList();
    }

    public Long getFindItem(ApiClient client) {
        return client.getFindItem();
    }

    public Integer getFindCount(ApiClient client) {
        return client.getFindCount();
    }

    public Integer getFindQuantity(ApiClient client) {
        return client.getFindQuantity();
    }

    public Integer getFindTotalQuantity(ApiClient client) {
        return client.getFindTotalQuantity();
    }

    public Long findTypes(ApiClient client, FindTypesDto findTypeDto) {
        return client.findTypes(new BaseList<>(findTypeDto.getTypes()), new BaseList<>(findTypeDto.getColors()),
                new BaseList<>(findTypeDto.getContainers()), findTypeDto.getScanRecursive());
    }
}
