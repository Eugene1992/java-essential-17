package com.cbs.edu.hw03;

/**
 * Main class.
 */
public class Main {
    /**
     * Main class.
     */
    public static void main(String[] args) {
        Figure rectangle = new Rectangle("Rectangle", 5.75, 8.47);
        Figure square = new Square("Square", 3.89);
        Figure rhombus = new Rhombus("Rhombus", 4.78, 3.41);
        Figure triangle = new Triangle("Triangle", 6.75, 5.47);
        Figure parallelogram = new Parallelogram("Parallelogram", 8.56, 4.17, 5.75);
        Figure trapezoid = new Trapezoid("Trapezoid", 7.23, 4.68, 5.11);
        area(rectangle, square, rhombus, triangle, parallelogram, trapezoid);
    }

    public static void area(Figure... figures) {
        for (Figure figure : figures) {
            System.out.printf("Calculated area of %s = %.3f\n", figure.name, figure.calculateArea());
        }
    }
}
