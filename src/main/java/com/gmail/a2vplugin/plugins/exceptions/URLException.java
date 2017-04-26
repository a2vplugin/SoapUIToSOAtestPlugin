package com.gmail.a2vplugin.plugins.exceptions;

public class URLException extends Exception {

    private static final long serialVersionUID = -4184390050917872587L;

    public URLException() {
        super();
    }

    public URLException(String message) {
        super(message);
    }

    public URLException(String message, Throwable cause) {
        super(message, cause);
    }

    public URLException(Throwable cause) {
        super(cause);
    }

    protected URLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
