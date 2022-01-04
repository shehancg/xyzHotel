package com.example.xyzhotel.model.execption;

public class NoRoomExecption extends RuntimeException{
    public NoRoomExecption(String message){
        super(message);
    }
    public  NoRoomExecption(String message, Throwable cause){
        super(message, cause);
    }
}
