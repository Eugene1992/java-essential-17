package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Figure {

    protected String figureName;
    protected int a;

    public Figure(String figureName, int a) {
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

    public void setA(int a) {
        this.a = a;
    }


    public void result() {
        System.out.println(figureName + " " + a);
    }
}
