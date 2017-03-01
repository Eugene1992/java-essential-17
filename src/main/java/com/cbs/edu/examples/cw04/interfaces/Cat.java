package com.cbs.edu.examples.cw04.interfaces;

import java.io.Closeable;
import java.io.Serializable;

public class Cat extends Animal implements Moveble, Serializable, Cloneable {

    private int speed;

    public Cat(int speed) {
        this.speed = speed;
    }

    @Override
    public double calculateDistance(int hours) {
        return speed * hours;
    }
}
