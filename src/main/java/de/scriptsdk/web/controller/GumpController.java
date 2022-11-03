package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.gump.*;
import de.scriptsdk.web.service.ClientService;
import de.scriptsdk.web.service.GumpService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("{id}/gumps")
public class GumpController {
    final GumpService gumpService;
    final ClientService clientService;

    public GumpController(GumpService gumpService, ClientService clientService) {
        this.gumpService = gumpService;
        this.clientService = clientService;
    }

    @DeleteMapping(path = "clear-ignore")
    @Operation(summary = "Clears gump ignore list", tags = {"gumps"})
    public void clearGumpsIgnore(@PathVariable String id) {
        gumpService.clearGumpsIgnore(clientService.getClient(id));
    }

    @PostMapping(path = "wait-for-gump", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits for certain gump", tags = {"gumps"})
    public void waitGumpInt(@PathVariable String id, @RequestBody Integer index) {
        gumpService.waitGumpInt(clientService.getClient(id), index);
    }

    @PostMapping(path = "wait-text-entry", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Waits for certain text entry within gump", tags = {"gumps"})
    public void waitGumpTextEntry(@PathVariable String id, @RequestBody String value) {
        gumpService.waitGumpTextEntry(clientService.getClient(id), value);
    }

    @PostMapping(path = "auto-text-entry", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Automatically handles certain text entry", tags = {"gumps"})
    public void gumpAutoTextEntry(@PathVariable String id, @RequestBody AutoTextEntryDto autoTextEntryDto) {
        gumpService.gumpAutoTextEntry(clientService.getClient(id), autoTextEntryDto);
    }

    @PostMapping(path = "auto-radio-button", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Automatically handles certain radio buttons", tags = {"gumps"})
    public void gumpAutoRadiobutton(@PathVariable String id, @RequestBody AutoRadioButtonDto autoRadioButtonDto) {
        gumpService.gumpAutoRadiobutton(clientService.getClient(id), autoRadioButtonDto);
    }

    @PostMapping(path = "auto-check-box", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Automatically handles certain check boxes", tags = {"gumps"})
    public void gumpAutoCheckBox(@PathVariable String id, @RequestBody AutoCheckBoxDto autoCheckBoxDto) {
        gumpService.gumpAutoCheckBox(clientService.getClient(id), autoCheckBoxDto);
    }

    @PostMapping(path = "click-button", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Clicks onto certain gump button", tags = {"gumps"})
    public @ResponseBody Boolean clickGumpButton(@PathVariable String id, @RequestBody ButtonEditDto buttonEditDto) {
        return gumpService.clickGumpButton(clientService.getClient(id), buttonEditDto);
    }

    @PostMapping(path = "edit-text-entry", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Edits certain text entry box", tags = {"gumps"})
    public @ResponseBody Boolean editGumpTextEntry(@PathVariable String id, @RequestBody TextEntryEditDto textEntryEditDto) {
        return gumpService.editGumpTextEntry(clientService.getClient(id), textEntryEditDto);
    }

    @PostMapping(path = "edit-radio-button", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Edits certain radio button", tags = {"gumps"})
    public @ResponseBody Boolean editGumpRadioButton(@PathVariable String id, @RequestBody RadioEditButtonDto radioEditButtonDto) {
        return gumpService.editGumpRadioButton(clientService.getClient(id), radioEditButtonDto);
    }

    @PostMapping(path = "edit-check-box", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Edits certain check box", tags = {"gumps"})
    public @ResponseBody Boolean editGumpCheckBox(@PathVariable String id, @RequestBody CheckBoxEditDto checkBoxEditDto) {
        return gumpService.editGumpCheckBox(clientService.getClient(id), checkBoxEditDto);
    }

    @GetMapping(path = "count", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns amount of visible gumps", tags = {"gumps"})
    public @ResponseBody Integer getGumpsCount(@PathVariable String id) {
        return gumpService.getGumpsCount(clientService.getClient(id));
    }

    @PostMapping(path = "simple-close", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Simply closes certain gump", tags = {"gumps"})
    public void closeSimpleGump(@PathVariable String id, @RequestBody Integer gumpIndex) {
        gumpService.closeSimpleGump(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "gump-serial", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns serial by index", tags = {"gumps"})
    public @ResponseBody Long getGumpSerial(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpSerial(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "gump-id", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "returns id by index", tags = {"gumps"})
    public @ResponseBody Long getGumpID(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpID(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "is-closable", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns if gump is closable by right click", tags = {"gumps"})
    public @ResponseBody Boolean getGumpNoClose(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return !gumpService.getGumpNoClose(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "text-lines", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns text lines", tags = {"gumps"})
    public @ResponseBody List<String> getGumpTextLines(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpTextLines(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "full-lines", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns full lines", tags = {"gumps"})
    public @ResponseBody List<String> getGumpFullLines(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpFullLines(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "short-lines", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns short lines", tags = {"gumps"})
    public @ResponseBody List<String> getGumpShortLines(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpShortLines(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "button-description", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns button texts as string list", tags = {"gumps"})
    public @ResponseBody List<String> getGumpButtonsDescription(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpButtonsDescription(clientService.getClient(id), gumpIndex);
    }

    @GetMapping(path = "gump-info", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns gump information by index", tags = {"gumps"})
    public @ResponseBody GumpDto getGumpInfo(@PathVariable String id, @RequestBody Integer gumpIndex) {
        return gumpService.getGumpInfo(clientService.getClient(id), gumpIndex);
    }

    @PostMapping(path = "ignore-by-id", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "ignores gump by id", tags = {"gumps"})
    public void addGumpIgnoreByID(@PathVariable String id, @RequestBody Long gumpID) {
        gumpService.addGumpIgnoreByID(clientService.getClient(id), gumpID);
    }

    @PostMapping(path = "ignore-by-serial", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "ignores gump by serial", tags = {"gumps"})
    public void addGumpIgnoreBySerial(@PathVariable String id, @RequestBody Long gumpSerial) {
        gumpService.addGumpIgnoreBySerial(clientService.getClient(id), gumpSerial);
    }

    @PostMapping(path = "close", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Closes gump by id", tags = {"gumps"})
    public void closeClientGump(@PathVariable String id, @RequestBody Integer gumpID) {
        gumpService.closeClientGump(clientService.getClient(id), gumpID);
    }
}
