package com.cbs.edu.examples.cw03.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();

        makeVoices(animal, cat, dog, duck);
    }

    public static void makeVoices(Animal... animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.makeVoice();
            }
        }
    }
}
