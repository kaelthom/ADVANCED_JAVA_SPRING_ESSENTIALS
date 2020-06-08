package com.advancedjava.springtraining.model;

public class GuitarPlayer {
    IInstrument guitar;

    public GuitarPlayer() {
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
}
