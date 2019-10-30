package com.ucx.training.sessions.app1.exception;

public class CompanyNotFoundException extends Exception{
    private final String message;

    public CompanyNotFoundException(String msg){
        super(msg);
        this.message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
