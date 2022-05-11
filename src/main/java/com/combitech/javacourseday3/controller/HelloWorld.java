package com.combitech.javacourseday3.controller;

public class HelloWorld {

    private final int id;

    private final String name;

    public HelloWorld(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
