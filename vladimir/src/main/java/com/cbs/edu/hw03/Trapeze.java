package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Trapeze extends Figure {

    protected int b;
    protected int h;

    Trapeze(String figureName, int a, int b, int h) {
        super(figureName, a);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double setH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void result() {
        System.out.println(figureName + " " + (a + b) * h / 2);
    }
}
