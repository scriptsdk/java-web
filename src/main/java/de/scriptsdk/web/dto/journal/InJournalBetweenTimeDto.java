package de.scriptsdk.web.dto.journal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InJournalBetweenTimeDto {
    private String value = " ";
    private LocalDateTime start = LocalDateTime.now();
    private LocalDateTime end = LocalDateTime.now();
}
