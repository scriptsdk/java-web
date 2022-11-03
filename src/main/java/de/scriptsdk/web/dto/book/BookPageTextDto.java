package de.scriptsdk.web.dto.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookPageTextDto {
    private Integer page = 0;
    private String text = " ";
}
