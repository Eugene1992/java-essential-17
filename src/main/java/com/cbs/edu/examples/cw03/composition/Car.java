package com.cbs.edu.examples.cw03.composition;

public class Car {

    private String model;
    private String color;
    private Engine engine = new Engine();
    private Freshener freshener;

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    public void run() {
        engine.on();
        freshener.smell();
        System.out.println("Go...");
    }
}
