package com.overops.examples.error;

public class BirthdayException extends RuntimeException {
    public BirthdayException() {
    }

    public BirthdayException(String message) {
        super(message);
    }

    public BirthdayException(String message, Throwable cause) {
        super(message, cause);
    }

    public BirthdayException(Throwable cause) {
        super(cause);
    }
}
