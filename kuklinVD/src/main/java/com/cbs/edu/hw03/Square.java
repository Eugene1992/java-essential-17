package com.cbs.edu.hw03;

/**
 * Inherited class from Figure which describes square.
 */

public class Square extends Figure {

    public Square(String name, double a) {
        super(name, a);
    }

    @Override
    public double getA() {
        return super.getA();
    }

    @Override
    public void setA(double a) {
        super.setA(a);
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
