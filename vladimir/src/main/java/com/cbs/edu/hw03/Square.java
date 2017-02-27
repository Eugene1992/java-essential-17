package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 26.02.2017.
 */
public class Square extends Figure {

    Square(String figureName, int a) {
        super(figureName, a);
    }

    @Override
    public void result() {
        System.out.println(figureName + " " + a * a);
    }
}
