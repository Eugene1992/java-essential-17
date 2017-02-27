package com.cbs.edu.examples.cw03.inheritance;

public class Test {
    public static void main(String[] args) {
        Cat firstCat = new HomeCat("Murka");
        HomeCat secondCat = new HomeCat("Murka");

        firstCat.specialCatMethod();

        secondCat.specialCatMethod();
        secondCat.specialHomeCatMethod();

        Dog firstDog = new Dog("Rex");

        makeVoices(firstCat, secondCat, firstDog);

        Animal animal = firstDog;

        if (animal instanceof Cat) {
            HomeCat homeCat = (HomeCat) animal;
        }

        firstDog.someMethod();
}

    public static void makeVoices(Animal... animals) {

    }
}
