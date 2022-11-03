package de.scriptsdk.web.model.event;

import de.scriptsdk.api.interfaces.event.EventAction;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class EventActionStack {
    private final Deque<LocalDateTime> stack = new ArrayDeque<>();
    private final EventAction event = apiClient -> stack.push(LocalDateTime.now());

    public List<LocalDateTime> pop() {
        List<LocalDateTime> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public Integer getCount() {
        return stack.size();
    }

    public EventAction getEvent() {
        return event;
    }
}
