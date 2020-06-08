package com.advancedjava.springtraining.model;

import com.advancedjava.springtraining.annotation.MyAnnotation;

public interface InstrumentPlayer {
    @MyAnnotation
    void play();
}
