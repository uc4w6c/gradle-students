package com.example;

public class Hello {
    private String name;
    public Hello(String name) {
        this.name = name;
    }

    public String say() {
        return name + " Hello!";
    }
}
