package com.cbs.edu.examples.cw08;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, CloneNotSupportedException {
        Cat cat = new Cat("Barsik", 2, new Home("Kiev"));
        Cat reallyCat = (Cat) cat;

        System.out.println(cat);

        Class aClass = cat.getClass();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(cat, "Murka");

        System.out.println(cat);

        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        Cat cloned = (Cat) cat.clone();
        System.out.println(cloned);

        /*cloned.getHome().setAddress("Kharkov");

        System.out.println(cat);
        System.out.println(cloned);*/

        Cat copy = new Cat(cat);
        copy.getHome().setAddress("Kharkov");

        System.out.println(cat);
        System.out.println(copy);

//        copy = null;
        System.gc();
    }

    public static void f(Animal[] animals) {

    }
}
