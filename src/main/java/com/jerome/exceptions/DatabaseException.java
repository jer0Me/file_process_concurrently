package com.jerome.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(Exception e) {
        super(e);
    }
}
