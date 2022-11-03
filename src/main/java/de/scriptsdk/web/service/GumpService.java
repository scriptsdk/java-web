package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.gump.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GumpService {

    public void clearGumpsIgnore(ApiClient client) {
        client.clearGumpsIgnore();
    }

    public void waitGumpInt(ApiClient client, Integer index) {
        client.waitGumpInt(index);
    }

    public void waitGumpTextEntry(ApiClient client, String value) {
        client.waitGumpTextEntry(value);
    }

    public void gumpAutoTextEntry(ApiClient client, AutoTextEntryDto autoTextEntryDto) {
        client.gumpAutoTextEntry(autoTextEntryDto.getTextEntryID(), autoTextEntryDto.getValue());
    }

    public void gumpAutoRadiobutton(ApiClient client, AutoRadioButtonDto autoRadioButtonDto) {
        client.gumpAutoRadiobutton(autoRadioButtonDto.getRadioButtonID(), autoRadioButtonDto.getValue());
    }

    public void gumpAutoCheckBox(ApiClient client, AutoCheckBoxDto autoCheckBoxDto) {
        client.gumpAutoCheckBox(autoCheckBoxDto.getCheckBoxID(), autoCheckBoxDto.getValue());
    }

    public Boolean clickGumpButton(ApiClient client, ButtonEditDto buttonEditDto) {
        return client.clickGumpButton(buttonEditDto.getGumpIndex(), buttonEditDto.getButtonId());
    }

    public Boolean editGumpTextEntry(ApiClient client, TextEntryEditDto textEntryEditDto) {
        return client.editGumpTextEntry(textEntryEditDto.getGumpIndex(), textEntryEditDto.getTextEntryID(),
                textEntryEditDto.getValue());
    }

    public Boolean editGumpRadioButton(ApiClient client, RadioEditButtonDto radioEditButtonDto) {
        return client.editGumpRadioButton(radioEditButtonDto.getGumpIndex(), radioEditButtonDto.getRadioButtonID(),
                radioEditButtonDto.getValue());
    }

    public Boolean editGumpCheckBox(ApiClient client, CheckBoxEditDto checkBoxEditDto) {
        return client.editGumpCheckBox(checkBoxEditDto.getGumpIndex(), checkBoxEditDto.getCheckBoxID(),
                checkBoxEditDto.getValue());
    }

    public Integer getGumpsCount(ApiClient client) {
        return client.getGumpsCount();
    }

    public void closeSimpleGump(ApiClient client, Integer gumpIndex) {
        client.closeSimpleGump(gumpIndex);
    }

    public Long getGumpSerial(ApiClient client, Integer gumpIndex) {
        return client.getGumpSerial(gumpIndex);
    }

    public Long getGumpID(ApiClient client, Integer gumpIndex) {
        return client.getGumpID(gumpIndex);
    }

    public Boolean getGumpNoClose(ApiClient client, Integer gumpIndex) {
        return client.getGumpNoClose(gumpIndex);
    }

    public List<String> getGumpTextLines(ApiClient client, Integer gumpIndex) {
        return client.getGumpTextLines(gumpIndex);
    }

    public List<String> getGumpFullLines(ApiClient client, Integer gumpIndex) {
        return client.getGumpFullLines(gumpIndex);
    }

    public List<String> getGumpShortLines(ApiClient client, Integer gumpIndex) {
        return client.getGumpShortLines(gumpIndex);
    }

    public List<String> getGumpButtonsDescription(ApiClient client, Integer gumpIndex) {
        return client.getGumpButtonsDescription(gumpIndex);
    }

    public GumpDto getGumpInfo(ApiClient client, Integer gumpIndex) {
        return new GumpDto(client.getGumpInfo(gumpIndex));
    }

    public void addGumpIgnoreByID(ApiClient client, Long gumpID) {
        client.addGumpIgnoreByID(gumpID);
    }

    public void addGumpIgnoreBySerial(ApiClient client, Long gumpSerial) {
        client.addGumpIgnoreBySerial(gumpSerial);
    }

    public void closeClientGump(ApiClient client, Integer gumpID) {
        client.closeClientGump(gumpID);
    }
}
