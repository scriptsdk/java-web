package de.scriptsdk.web.dto.player;

import de.scriptsdk.api.model.geometry.QuestArrowResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestArrowDto {
    private Integer x;
    private Integer y;

    public QuestArrowDto(QuestArrowResponse response) {
        this.setX(response.getX());
        this.setY(response.getY());
    }
}
