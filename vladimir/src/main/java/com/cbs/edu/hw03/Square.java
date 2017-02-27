package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Square extends Figure {

    Square(String figureName, double a) {
        super(figureName, a);
    }

    @Override
    public double result() {
        return a * a;
    }
}
