package de.scriptsdk.web.exception;

import de.scriptsdk.core.exceptions.BaseException;

public class ClientException extends BaseException {
    public ClientException(String message) {
        super(message);
    }

    public ClientException(String format, Object... args) {
        this(String.format(format, args));
    }
}
