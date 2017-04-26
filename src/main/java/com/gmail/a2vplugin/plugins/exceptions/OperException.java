package com.gmail.a2vplugin.plugins.exceptions;

public class OperException extends Exception {

    private static final long serialVersionUID = -3839730589662786880L;

    public OperException() {
        super();
    }

    public OperException(String message) {
        super(message);
    }

    public OperException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperException(Throwable cause) {
        super(cause);
    }

    protected OperException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
