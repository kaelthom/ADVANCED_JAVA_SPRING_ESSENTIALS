package com.advancedjava.springtraining.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "guitarplayer")
public class GuitarPlayer implements InstrumentPlayer {

    @Autowired
    @Qualifier(value = "ukulele")
    private IInstrument instrument;
    private String name;

    public GuitarPlayer() {
    }

    public GuitarPlayer(IInstrument instrument, String name) {
        this.instrument = instrument;
        this.name = name;
    }

    @Override
    public String toString() {
        return "GuitarPlayer{" +
                "instrument=" + instrument +
                ", name='" + name + '\'' +
                '}';
    }

    public IInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        instrument.play();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
