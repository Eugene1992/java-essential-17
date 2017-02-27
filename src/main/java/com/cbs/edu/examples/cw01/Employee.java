package com.cbs.edu.examples.cw01;

/**
 *
 */
public class Employee {

    String name;
    int age;
    int salary;
    Employee employee;

    /**
     *
     * @param employee
     */
    void sayHello(Employee employee) {
        System.out.println(this.name + " said: Hello, " + employee.name);
    }
}
