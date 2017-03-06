package com.cbs.edu.hw06_builder;

/**
 * Car builder.
 */
public class Car {
    private final String manufacturer;      //required
    private final String model;             //required
    private final int price;                //required
    private final String equipment;         //optional
    private final int maxSpeed;             //optional
    private final double fuelConsumtion;    //optional
    private final double acceleration;      //optional

    public static class CarBuilder{
        private String manufacturer;      //required
        private String model;             //required
        private int price;                //required
        private String equipment;         //optional
        private int maxSpeed;             //optional
        private double fuelConsumtion;    //optional
        private double acceleration;      //optional

        public CarBuilder setEquipment(String value){
            equipment = value;
            return  this;
        }

        public CarBuilder setMaxSpeed(int value){
            maxSpeed = value;
            return  this;
        }
        public CarBuilder setFuelConsumtion(double value){
            fuelConsumtion = value;
            return  this;
        }
        public CarBuilder setAcceleration(double value){
            acceleration = value;
            return  this;
        }

        public CarBuilder(String manufacturer, String model, int price) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.price = price;
        }

        public Car build(){
            return new Car(this);
        }
    }

    private Car(CarBuilder builder) {
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.price = builder.price;
        this.equipment = builder.equipment;
        this.maxSpeed = builder.maxSpeed;
        this.fuelConsumtion = builder.fuelConsumtion;
        this.acceleration = builder.acceleration;
    }

    public static void main(String[] args) {
        Car build = new CarBuilder("Mercedes", "GL500", 90000).setMaxSpeed(250).setFuelConsumtion(11.2).build();
    }
}
