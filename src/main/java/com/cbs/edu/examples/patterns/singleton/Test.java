package com.cbs.edu.examples.patterns.singleton;

public class Test {
    public static void main(String[] args) {
        Connection firstConnection = Connection.getInstance();
        Connection secondConnection = Connection.getInstance();

        System.out.println(firstConnection == secondConnection);
    }
}
