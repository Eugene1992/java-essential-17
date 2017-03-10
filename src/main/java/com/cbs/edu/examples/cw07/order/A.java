package com.cbs.edu.examples.cw07.order;

public class A {

    static {
        System.out.println("static A");
    }

    {
        System.out.println("non static A");
    }

    A() {
        System.out.println("constructor A");
    }
}
