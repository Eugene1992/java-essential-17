package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public abstract class Figure {

    protected String figureName;
    protected double a;

    public Figure(String figureName, double a) {
        this.figureName = figureName;
        this.a = a;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public abstract double result();
}
