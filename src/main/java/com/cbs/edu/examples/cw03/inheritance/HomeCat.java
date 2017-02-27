package com.cbs.edu.examples.cw03.inheritance;

public class HomeCat extends Cat {

    private String address;

    public HomeCat(String name) {
        super(name);
    }

    public HomeCat() {
        super();
    }

    public void sayHello() {
        System.out.println(name + " say hello!");
    }

    public void specialHomeCatMethod() {

    }
}
