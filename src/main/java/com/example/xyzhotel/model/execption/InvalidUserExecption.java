package com.example.xyzhotel.model.execption;

public class InvalidUserExecption extends RuntimeException{
    public InvalidUserExecption(String message){
        super(message);
    }

    public InvalidUserExecption(String message,Throwable cause){
        super(message, cause);
    }
}


