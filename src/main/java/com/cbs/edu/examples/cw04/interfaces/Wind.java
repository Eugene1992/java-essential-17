package com.cbs.edu.examples.cw04.interfaces;

public class Wind implements Moveble {

    private int speed;

    public Wind(int speed) {
        this.speed = speed;
    }

    @Override
    public double calculateDistance(int hours) {
        return speed * hours;
    }
}
