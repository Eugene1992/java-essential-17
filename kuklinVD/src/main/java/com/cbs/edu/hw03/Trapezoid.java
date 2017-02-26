package com.cbs.edu.hw03;

/**
 * Inherited class from Rectangle which describes trapezoid.
 */
public class Trapezoid extends Rectangle {
    private double h;

    public Trapezoid(String name, double a, double b, double h) {
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
        return h * (a + b) / 2;
    }
}
