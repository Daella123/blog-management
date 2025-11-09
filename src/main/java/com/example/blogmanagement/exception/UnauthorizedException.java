package com.example.blogmanagement.exception;

/**
 * Exception thrown when a user attempts to access or modify a resource
 * they are not authorized to access.
 */
public class UnauthorizedException extends RuntimeException {


    public UnauthorizedException(String message) {
        super(message);
    }


    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
