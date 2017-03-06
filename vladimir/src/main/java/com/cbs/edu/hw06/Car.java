package com.cbs.edu.hw06;

/**
 * Created by Vladimir on 06.03.2017.
 */
public class Car {
    private int engine; //required
    private int carcase; //required
    private int wheel; //required
    private int glass; //optional
    private int headlights; //optional
    private int airConditioning; //optional

    public static class carBuilder {
        private int engine;
        private int carcase;
        private int wheel;
        private int glass;
        private int headlights;
        private int airConditioning;

        public carBuilder setGlass(int price) {
            glass = price;
            return this;
        }

        public carBuilder setHeadlights(int price) {
            headlights = price;
            return this;
        }

        public carBuilder setAirConditioning(int price) {
            airConditioning = price;
            return this;
        }

        public carBuilder(int engine, int carcase, int wheel) {
            this.engine = engine;
            this.carcase = carcase;
            this.wheel = wheel;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(carBuilder builder) {
        this.engine = builder.engine;
        this.carcase =  builder.carcase;
        this.wheel =  builder.wheel;
        this.glass =  builder.glass;
        this.headlights =  builder.headlights;
        this.airConditioning =  builder.airConditioning;
    }

    public static void main(String[] args) {
        Car build = new carBuilder(15000, 10000, 15000).setGlass(5000).setAirConditioning(2000).setHeadlights(5000).build();
    }

}
