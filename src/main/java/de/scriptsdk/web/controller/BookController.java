package de.scriptsdk.web.controller;

import de.scriptsdk.web.dto.book.BookHeaderDto;
import de.scriptsdk.web.dto.book.BookPageTextDto;
import de.scriptsdk.web.service.BookService;
import de.scriptsdk.web.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{id}/books")
public class BookController {
    final BookService bookService;
    final ClientService clientService;

    public BookController(BookService bookService, ClientService clientService) {
        this.bookService = bookService;
        this.clientService = clientService;
    }

    @GetMapping(path = "page-text", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Returns text of a current opened book page", tags = {"book"})
    public @ResponseBody String getBookPageText(@PathVariable String id, @RequestBody Integer page) {
        return bookService.getBookPageText(clientService.getClient(id), page);
    }

    @PostMapping(path = "text", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets text of a current opened book", tags = {"book"})
    public void setBookText(@PathVariable String id, @RequestBody String text) {
        bookService.setBookText(clientService.getClient(id), text);
    }

    @PostMapping(path = "page-text", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets text of a current opened book page", tags = {"book"})
    public void setBookPageText(@PathVariable String id, @RequestBody BookPageTextDto object) {
        bookService.setBookPageText(clientService.getClient(id), object);
    }

    @DeleteMapping(path = "text")
    @Operation(summary = "Clears text of current opened book", tags = {"book"})
    public void clearBookText(@PathVariable String id) {
        bookService.clearBookText(clientService.getClient(id));
    }

    @PostMapping(path = "header", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Sets header of current opened book", tags = {"book"})
    public void setBookHeader(@PathVariable String id, @RequestBody BookHeaderDto object) {
        bookService.setBookHeader(clientService.getClient(id), object);
    }
}
