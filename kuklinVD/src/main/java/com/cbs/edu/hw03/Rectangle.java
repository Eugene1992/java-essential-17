package com.cbs.edu.hw03;

/**
 * Inherited class from Square which describes rectangle.
 */
public class Rectangle extends Square {
    protected double b;

    public Rectangle(String name, double a, double b) {
        super(name, a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
