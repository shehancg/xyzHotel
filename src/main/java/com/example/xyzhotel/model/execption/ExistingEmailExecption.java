package com.example.xyzhotel.model.execption;

public class ExistingEmailExecption extends RuntimeException{
    public ExistingEmailExecption(String message){
        super(message);
    }

    public ExistingEmailExecption(String message,Throwable cause){
        super(message,cause);
    }
}
