package com.cbs.edu.hw03;

public abstract class RoundFigure extends Figure {

    public RoundFigure(String name, double a) {
        super(name, a);
    }

    public abstract double calculateCircumference();

}
