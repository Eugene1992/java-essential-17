package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Triangle extends Figure {

    protected double h;

    public Triangle(String figureName, double a, double h) {
        super(figureName, a);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double result() {
        return a * h / 2;
    }
}
