package com.marwaeltayeb.souq.model;

public class RegisterApiResponse {

    private int id;
    private boolean error;
    private String message;

    public RegisterApiResponse(boolean error, String message) {
        this.error = error;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}