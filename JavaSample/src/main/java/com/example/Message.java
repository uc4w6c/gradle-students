package com.example;

public class Message {
    private final String msg;
    public Message(String msg) {
        this.msg = msg;
    }
    public String say() {
        return msg;
    }
}
