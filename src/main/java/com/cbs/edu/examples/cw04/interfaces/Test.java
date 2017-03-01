package com.cbs.edu.examples.cw04.interfaces;

public class Test {
    public static void main(String[] args) {
        Moveble human = new Human(35);
        Moveble cat = new Cat(50);
        Moveble wind = new Wind(300);
        Moveble car = new Car(420);

        printDistances(3, human, cat, wind, car);
    }

    public static void printDistances(int hours, Moveble... movebles) {
        for (Moveble moveble : movebles) {
            System.out.println(moveble.calculateDistance(hours));
        }
    }
}
