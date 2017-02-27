package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Trapeze extends Figure {

    protected double b;
    protected double h;

    Trapeze(String figureName, double a, double b, double h) {
        super(figureName, a);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double setH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double result() {
        return (a + b) * h / 2;
    }
}
