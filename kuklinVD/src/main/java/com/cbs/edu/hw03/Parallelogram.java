package com.cbs.edu.hw03;

/**
 * Inherited class from Rectangle which describes parallelogram.
 */
public class Parallelogram extends Rectangle {
    private double h;

    public Parallelogram(String name, double a, double b, double h) {
        super(name, a, b);
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
