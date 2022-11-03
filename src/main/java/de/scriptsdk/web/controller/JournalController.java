package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.journal.InJournalBetweenTimeDto;
import de.scriptsdk.web.dto.journal.JournalLineDto;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.JournalService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("{id}/journal")
public class JournalController {

    final ClientService clientService;
    final JournalService journalService;

    public JournalController(ClientService clientService, JournalService journalService) {
        this.clientService = clientService;
        this.journalService = journalService;
    }

    @GetMapping(path = "found-param-id", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns founded param id", tags = {"journal"})
    public Integer getFoundParamID(@PathVariable String id) {
        return journalService.getFoundParamID(clientService.getClient(id));
    }

    @GetMapping(path = "line-id", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line id", tags = {"journal"})
    public Long getJournalLineID(@PathVariable String id) {
        return journalService.getJournalLineID(clientService.getClient(id));
    }

    @GetMapping(path = "line-type", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line type", tags = {"journal"})
    public Integer getJournalLineType(@PathVariable String id) {
        return journalService.getJournalLineType(clientService.getClient(id));
    }

    @GetMapping(path = "line-time", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line time", tags = {"journal"})
    public LocalDateTime getJournalLineTime(@PathVariable String id) {
        return journalService.getJournalLineTime(clientService.getClient(id));
    }

    @GetMapping(path = "message-line-type", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns message line type", tags = {"journal"})
    public Integer getJournalMessageLineType(@PathVariable String id) {
        return journalService.getJournalMessageLineType(clientService.getClient(id));
    }

    @GetMapping(path = "line-color", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line color", tags = {"journal"})
    public Integer getJournalLineColor(@PathVariable String id) {
        return journalService.getJournalLineColor(clientService.getClient(id));
    }

    @GetMapping(path = "line-font", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line font", tags = {"journal"})
    public Integer getJournalLineFont(@PathVariable String id) {
        return journalService.getJournalLineFont(clientService.getClient(id));
    }

    @GetMapping(path = "line-index", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line index", tags = {"journal"})
    public Integer getJournalLineIndex(@PathVariable String id) {
        return journalService.getJournalLineIndex(clientService.getClient(id));
    }

    @GetMapping(path = "line-count", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of lines", tags = {"journal"})
    public Integer getJournalLineCount(@PathVariable String id) {
        return journalService.getJournalLineCount(clientService.getClient(id));
    }

    @GetMapping(path = "line-name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line name", tags = {"journal"})
    public String getJournalLineName(@PathVariable String id) {
        return journalService.getJournalLineName(clientService.getClient(id));
    }

    @GetMapping(path = "is-in-journal", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if certain text is in journal", tags = {"journal"})
    public Integer isInJournal(@PathVariable String id, @RequestBody String text) {
        return journalService.isInJournal(clientService.getClient(id), text);
    }

    @PostMapping(path = "ignore-line", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Ignores certain line for further queries", tags = {"journal"})
    public void addJournalIgnore(@PathVariable String id, @RequestBody String value) {
        journalService.addJournalIgnore(clientService.getClient(id), value);
    }

    @DeleteMapping(path = "clear-journal")
    @Operation(summary = "Clears journal", tags = {"journal"})
    public void clearJournal(@PathVariable String id) {
        journalService.clearJournal(clientService.getClient(id));
    }

    @GetMapping(path = "last-message", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns last message", tags = {"journal"})
    public String getLastJournalMessage(@PathVariable String id) {
        return journalService.getLastJournalMessage(clientService.getClient(id));
    }

    @GetMapping(path = "in-journal", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line of passed line text", tags = {"journal"})
    public Integer inJournal(@PathVariable String id, @RequestBody String value) {
        return journalService.inJournal(clientService.getClient(id), value);
    }

    @GetMapping(path = "journal-between-time", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns line number if text is between certain time", tags = {"journal"})
    public Integer inJournalBetweenTime(@PathVariable String id, @RequestBody InJournalBetweenTimeDto inJournalBetweenTimeDto) {
        return journalService.inJournalBetweenTime(clientService.getClient(id), inJournalBetweenTimeDto);
    }

    @GetMapping(path = "journal", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns text by line index", tags = {"journal"})
    public @ResponseBody String journal(@PathVariable String id, @RequestBody Integer index) {
        return journalService.journal(clientService.getClient(id), index);
    }

    @PostMapping(path = "line", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets text of certain line in journal", tags = {"journal"})
    public void setJournalLine(@PathVariable String id, @RequestBody JournalLineDto journalLine) {
        journalService.setJournalLine(clientService.getClient(id), journalLine);
    }

    @GetMapping(path = "low-journal", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns index of low journal", tags = {"journal"})
    public Integer getLowJournal(@PathVariable String id) {
        return journalService.getLowJournal(clientService.getClient(id));
    }

    @GetMapping(path = "high-journal", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns index of high journal", tags = {"journal"})
    public Integer getHighJournal(@PathVariable String id) {
        return journalService.getHighJournal(clientService.getClient(id));
    }

    @PostMapping(path = "add-to-journal", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Add text to journal", tags = {"journal"})
    public void addToJournal(@PathVariable String id, @RequestBody String text) {
        journalService.addToJournal(clientService.getClient(id), text);
    }

    @DeleteMapping(path = "clear-journal-ignore")
    @Operation(summary = "Clears ignored journal texts", tags = {"journal"})
    public void clearJournalIgnore(@PathVariable String id) {
        journalService.clearJournalIgnore(clientService.getClient(id));
    }
}
