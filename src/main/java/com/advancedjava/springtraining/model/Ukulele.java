package com.advancedjava.springtraining.model;

import org.springframework.stereotype.Component;

@Component
public class Ukulele implements IInstrument {

    private String name;

    public Ukulele() {
    }

    public Ukulele(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("play guitar");
    }

    @Override
    public String toString() {
        return "Ukulele{" +
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
