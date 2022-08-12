package com.fackusalvatierra.wfs.exception;

public class UserNotFoundExecption extends RuntimeException{
    public UserNotFoundExecption(String message){
        super(message);
    }
}
