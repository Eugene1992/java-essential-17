package com.cbs.edu.hw03;

/**
 * Created by Vladimir on 27.02.2017.
 */
public class Main {
    /**
     * alslda.
     *
     * @param args asda
     */


    public static void main(String[] args) {
        Figure parallelogram = new Parallelogram("Parallelogram", 6, 5);
        Figure rectangle = new Rectangle("Rectangle", 3, 4);
        Figure rhombus = new Rhombus("Rhombus", 3, 2);
        Figure square = new Square("Square", 3);
        Figure trapeze = new Trapeze("Trapeze", 3, 4, 2);
        Figure triangle = new Triangle("Triangle", 3, 2);

        output(parallelogram, rectangle, rhombus, square, trapeze, triangle);
    }

    public static void output(Figure... figures) {
        for (Figure figure : figures) {
            System.out.printf("result of %s = %.1f\n", figure.figureName, figure.result());
        }

    }
}
