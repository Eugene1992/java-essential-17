package com.cbs.edu.examples.cw07.enums;

public class Test {
    public static void main(String[] args) {
        Role[] values = Role.values();
        for (Role value : values) {
            System.out.println(value);
        }
        Role user = Role.valueOf("USER");

        Country country = Country.valueOf("USA");
        System.out.println(country.getFullName());
    }
}
