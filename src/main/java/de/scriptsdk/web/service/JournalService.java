package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.journal.InJournalBetweenTimeDto;
import de.scriptsdk.web.dto.journal.JournalLineDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JournalService {
    public Integer getFoundParamID(ApiClient client) {
        return client.getFoundParamID();
    }

    public Long getJournalLineID(ApiClient client) {
        return client.getJournalLineID();
    }

    public Integer getJournalLineType(ApiClient client) {
        return client.getJournalLineType();
    }

    public LocalDateTime getJournalLineTime(ApiClient client) {
        return client.getJournalLineTime();
    }

    public Integer getJournalMessageLineType(ApiClient client) {
        return client.getJournalMessageLineType();
    }

    public Integer getJournalLineColor(ApiClient client) {
        return client.getJournalLineColor();
    }

    public Integer getJournalLineFont(ApiClient client) {
        return client.getJournalLineFont();
    }

    public Integer getJournalLineIndex(ApiClient client) {
        return client.getJournalLineIndex();
    }

    public Integer getJournalLineCount(ApiClient client) {
        return client.getJournalLineCount();
    }

    public String getJournalLineName(ApiClient client) {
        return client.getJournalLineName();
    }

    public Integer isInJournal(ApiClient client, String text) {
        return client.isInJournal(text);
    }

    public void addJournalIgnore(ApiClient client, String value) {
        client.addJournalIgnore(value);
    }

    public void clearJournal(ApiClient client) {
        client.clearJournal();
    }

    public String getLastJournalMessage(ApiClient client) {
        return client.getLastJournalMessage();
    }

    public Integer inJournal(ApiClient client, String value) {
        return client.inJournal(value);
    }

    public Integer inJournalBetweenTime(ApiClient client, InJournalBetweenTimeDto inJournalBetweenTimeDto) {
        return client.inJournalBetweenTime(inJournalBetweenTimeDto.getValue(),
                inJournalBetweenTimeDto.getStart(), inJournalBetweenTimeDto.getEnd());
    }

    public String journal(ApiClient client, Integer index) {
        return client.journal(index);
    }

    public void setJournalLine(ApiClient client, JournalLineDto journalLine) {
        client.setJournalLine(journalLine.getIndex(), journalLine.getValue());
    }

    public Integer getLowJournal(ApiClient client) {
        return client.getLowJournal();
    }

    public Integer getHighJournal(ApiClient client) {
        return client.getHighJournal();
    }

    public void addToJournal(ApiClient client, String text) {
        client.addToJournal(text);
    }

    public void clearJournalIgnore(ApiClient client) {
        client.clearJournalIgnore();
    }
}
