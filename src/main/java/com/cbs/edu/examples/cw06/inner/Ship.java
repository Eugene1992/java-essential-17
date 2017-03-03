package com.cbs.edu.examples.cw06.inner;

import java.io.Serializable;

public class Ship extends SuperShip {

    private SuperEngine superEngine = new SuperEngine();

    private int privateField = 100;

    public class Engine extends SuperEngine implements Serializable {

        final static int k = 10;

        public int fuckTheEncapsulation() {
            return privateField;
        }
    }

    private abstract class EngineChild extends Engine {

    }

    public void someMEthod() {
        System.out.println(superShipField);
        System.out.println(superEngine.superEngineField);
        superShipMethod();
        superEngine.superEngineMethod();
    }
}
