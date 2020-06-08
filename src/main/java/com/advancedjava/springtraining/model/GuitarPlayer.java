package com.advancedjava.springtraining.model;

public class GuitarPlayer {
    IInstrument guitar;
    private String name;

    public GuitarPlayer() {
    }

    public GuitarPlayer(IInstrument guitar, String name) {
        this.guitar = guitar;
        this.name = name;
    }

    @Override
    public String toString() {
        return "GuitarPlayer{" +
                "guitar=" + guitar +
                ", name='" + name + '\'' +
                '}';
    }

    public IInstrument getGuitar() {
        return guitar;
    }

    public void setGuitar(IInstrument guitar) {
        this.guitar = guitar;
    }

    public void play() {
        guitar.play();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
