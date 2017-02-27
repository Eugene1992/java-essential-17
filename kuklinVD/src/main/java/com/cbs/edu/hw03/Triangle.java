package com.cbs.edu.hw03;

/**
 * Inherited class from Figure which describes triangle.
 */
public class Triangle extends Figure {
    private double h;

    public Triangle(String name, double a, double h) {
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
        return (a * h) * 0.5;
    }
}
