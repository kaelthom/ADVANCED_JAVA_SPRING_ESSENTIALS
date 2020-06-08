package com.advancedjava.springtraining.model;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument {

    private String name;

    public Guitar() {
    }

    public Guitar(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("play guitar");
    }

    @Override
    public String toString() {
        return "Guitar{" +
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
