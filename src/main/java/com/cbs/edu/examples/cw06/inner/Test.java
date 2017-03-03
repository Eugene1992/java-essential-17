package com.cbs.edu.examples.cw06.inner;

public class Test {
    public static void main(String[] args) {

        Ship.Engine engine = new Ship().new Engine();

        System.out.println(engine.fuckTheEncapsulation());
    }
}
