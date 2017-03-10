package com.cbs.edu.examples.cw08.equals;

public class Test {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 2, 2.0, true);
        Cat barsik2 = new Cat("Barsik", 2, 2.0, true);

        System.out.println(barsik.equals(barsik2));

        System.out.println(barsik.hashCode());
        System.out.println(barsik2.hashCode());
    }
}
