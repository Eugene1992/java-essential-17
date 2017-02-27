package com.cbs.edu.hw03;

/**
 * Inherited class from Square which describes rhombus.
 */
public class Rhombus extends Square {
    private double h;

    public Rhombus(String name, double a, double h) {
        super(name, a);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return a * h;
    }
}
