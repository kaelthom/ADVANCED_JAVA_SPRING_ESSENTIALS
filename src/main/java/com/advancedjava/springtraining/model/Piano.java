package com.advancedjava.springtraining.model;

import org.springframework.stereotype.Component;

@Component
public class Piano implements IInstrument {

    private String name;

    public Piano() {
    }

    public Piano(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("play piano");
    }

    @Override
    public String toString() {
        return "Piano{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
