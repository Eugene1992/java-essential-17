package com.cbs.edu.examples.cw01;

/**
 * Some comment.
 */
public class Main {
    public static void main(String[] args) {
        String empOneName2 = "Ivan";
        int enpOneAge = 23;
        int empOneSalary = 1000;

        Employee ivan = new Employee();
        ivan.name = "Ivan";
        ivan.age = 23;
        ivan.salary = 1000;

        Employee andrey = new Employee();
        andrey.name = "Andrey";
        andrey.age = 23;
        andrey.salary = 1000;

        ivan.sayHello(andrey);

        Employee[] emps = {andrey, ivan};

    }
}
