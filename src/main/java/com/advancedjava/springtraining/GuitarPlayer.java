package com.advancedjava.springtraining;

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
}
