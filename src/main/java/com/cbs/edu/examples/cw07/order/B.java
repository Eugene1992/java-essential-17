package com.cbs.edu.examples.cw07.order;

public class B extends A {

    static {
        System.out.println("static B");
    }

    {
        System.out.println("non static B");
    }

    B() {
        System.out.println("constructor B");
    }

    public static void main(String[] args) {
        B b = new B();
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}
