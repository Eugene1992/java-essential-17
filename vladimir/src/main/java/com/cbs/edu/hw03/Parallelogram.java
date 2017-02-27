package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Parallelogram extends Figure {

    protected int h;

    public Parallelogram(String figureName, int a, int h) {
        super(figureName, a);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void result() {
        System.out.println(figureName + " " + a * h);
    }
}
