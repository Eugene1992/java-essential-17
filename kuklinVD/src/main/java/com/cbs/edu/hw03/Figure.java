package com.cbs.edu.hw03;

/**
 * Base class for inheritance.
 */
public class Figure {
    protected String name;
    protected double a;

    public Figure(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return a;
    }
}
