package com.cbs.edu.examples.cw04.interfaces;

public class Human implements Moveble {

    private int speed;

    public Human(int speed) {
        this.speed = speed;
    }

    @Override
    public double calculateDistance(int hours) {
        return speed * hours;
    }
}
