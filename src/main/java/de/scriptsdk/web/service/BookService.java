package de.scriptsdk.web.service;

import de.scriptsdk.api.model.network.ApiClient;
import de.scriptsdk.web.dto.book.BookHeaderDto;
import de.scriptsdk.web.dto.book.BookPageTextDto;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public String getBookPageText(ApiClient client, Integer page) {
        return client.getBookPageText(page);
    }

    public void setBookText(ApiClient client, String text) {
        client.setBookText(text);
    }

    public void setBookPageText(ApiClient client, BookPageTextDto object) {
        client.setBookPageText(object.getPage(), object.getText());

    }

    public void clearBookText(ApiClient client) {
        client.clearBookText();
    }

    public void setBookHeader(ApiClient client, BookHeaderDto object) {
        client.setBookHeader(object.getTitle(), object.getAuthor());
    }
}
