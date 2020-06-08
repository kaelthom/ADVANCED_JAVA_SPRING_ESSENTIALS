package com.advancedjava.springtraining.model;

public class Guitar implements IInstrument {
    public void play() {
        System.out.println("play guitar");
    }

    @Override
    public String toString() {
        return "Guitar{}";
    }
}
