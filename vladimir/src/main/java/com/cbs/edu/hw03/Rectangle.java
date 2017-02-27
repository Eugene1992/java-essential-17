package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Rectangle extends Figure {

    protected int b;

    Rectangle(String figureName, int a, int b) {
        super(figureName, a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void result() {
        System.out.println(figureName + " " + a * b);
    }
}
