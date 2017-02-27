package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Rectangle extends Figure {

    protected double b;

    Rectangle(String figureName, double a, double b) {
        super(figureName, a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double result() {
        return a * b;
    }
}
