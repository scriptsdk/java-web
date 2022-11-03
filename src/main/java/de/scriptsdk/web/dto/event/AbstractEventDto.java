package de.scriptsdk.web.dto.event;

import java.time.LocalDateTime;

public abstract class AbstractEventDto<T> {

    LocalDateTime timestamp;

    protected AbstractEventDto() {
        timestamp = LocalDateTime.now();
    }

    public abstract void parse(T object);

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
