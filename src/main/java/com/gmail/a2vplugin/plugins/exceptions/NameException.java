package com.gmail.a2vplugin.plugins.exceptions;

public class NameException extends Exception {

    private static final long serialVersionUID = 6720694163342258730L;

    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }

    public NameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameException(Throwable cause) {
        super(cause);
    }

    protected NameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
