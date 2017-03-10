package com.cbs.edu.examples.cw07.annonymous;

public class Test {

    private static int s = 1;
    private int ns = 1;

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.say();

        Animal dog = new Animal() {
            @Override
            public void say() {
                System.out.println("Wooof!");
            }
        };
        dog.say();

        int local;
        local = 7;
        final int localFinal = 77;

        Cat homeCat = new Cat(){
            public String name;

            public String getName() {
                return name;
            }

            public void print() {
                System.out.println(s);
                System.out.println(new Test().ns);
                System.out.println(local);
                System.out.println(localFinal);
            }

            @Override
            public void say() {
                System.out.println("Sweet home!");
            }
        };

    }
}
