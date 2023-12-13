package com.security.jwt.exceptions;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

    private final HttpStatus status;
    private final String message;
    private final String details;

    public ErrorResponse(HttpStatus status, String message, String details) {
        this.status = status;
        this.message = message;
        this.details = details;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}