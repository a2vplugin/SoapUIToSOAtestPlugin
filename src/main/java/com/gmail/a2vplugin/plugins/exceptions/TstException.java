package com.gmail.a2vplugin.plugins.exceptions;

public class TstException extends Exception {

    private static final long serialVersionUID = 2871983619171002625L;

    public TstException() {
        super();
    }

    public TstException(String message) {
        super(message);
    }

    public TstException(String message, Throwable cause) {
        super(message, cause);
    }

    public TstException(Throwable cause) {
        super(cause);
    }

    protected TstException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
