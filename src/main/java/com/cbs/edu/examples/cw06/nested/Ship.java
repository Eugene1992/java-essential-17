package com.cbs.edu.examples.cw06.nested;

import java.io.Serializable;

public class Ship {

    private int nonStaticField = 10;
    private static int staticField = 10;

    static class Engine extends Object implements Serializable {

        public int someField;

        public Engine(int someField) {
            this.someField = someField;
        }

        public void nestedClassMethod() {
//            System.out.println(nonStaticField);
            System.out.println(staticField);

//            nonStaticMethod();
            staticMethod();
        }
    }

    public void nonStaticMethod() {
    }

    public static void staticMethod() {
    }
}
