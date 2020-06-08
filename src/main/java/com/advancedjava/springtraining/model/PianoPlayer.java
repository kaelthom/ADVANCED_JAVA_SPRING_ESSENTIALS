package com.advancedjava.springtraining.model;

import com.advancedjava.springtraining.annotation.MyAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PianoPlayer implements InstrumentPlayer {

    @Autowired
    @Qualifier(value = "piano")
    private IInstrument instrument;
    private String name;

    public PianoPlayer() {
    }

    public PianoPlayer(IInstrument instrument, String name) {
        this.instrument = instrument;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PianoPlayer{" +
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
    @MyAnnotation
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
