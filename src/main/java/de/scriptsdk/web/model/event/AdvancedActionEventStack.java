package de.scriptsdk.web.model.event;

import de.scriptsdk.api.interfaces.event.EventReadable;
import de.scriptsdk.api.interfaces.event.ExtendedEventAction;
import de.scriptsdk.core.exceptions.BaseException;
import de.scriptsdk.web.dto.event.AbstractEventDto;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AdvancedActionEventStack<T extends EventReadable, E extends AbstractEventDto<T>> {

    private final Deque<E> stack = new ArrayDeque<>();
    private final ExtendedEventAction<T> event;
    private final Class<E> clazz;

    public AdvancedActionEventStack(Class<E> clazz) {
        this.clazz = clazz;

        event = (apiClient, object) ->
        {
            try {
                E value = clazz.getDeclaredConstructor().newInstance();
                stack.push(value);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new BaseException(e);
            }
        };
    }

    public Class<E> getClazz() {
        return clazz;
    }

    public ExtendedEventAction<T> getEvent() {
        return event;
    }


    public List<E> pop() {
        List<E> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public Integer getCount() {
        return stack.size();
    }
}
