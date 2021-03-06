package com.aokyu.dev.pocket.error;

import java.net.HttpURLConnection;

public class ErrorHandler {

    public ErrorHandler() {}

    public void handleResponse(ErrorResponse error)
            throws InvalidRequestException, PocketException {
        int status = error.getStatus();
        String message = error.getErrorMessage();
        switch (status) {
        case HttpURLConnection.HTTP_BAD_REQUEST:
            throw new InvalidRequestException(message);
        case HttpURLConnection.HTTP_FORBIDDEN:
            throw new InvalidRequestException(message);
        default:
            throw new PocketException(message);
        }
    }
}
