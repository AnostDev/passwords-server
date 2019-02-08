package com.keygen.keygen.test;

public class HelloWorld {
    String message;

    HelloWorld(){
        System.out.println("Inside HelloWorld constructor");
    }

    public void setMessage(String message){
        System.out.println("About to set a message...");
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
