package com.cbs.edu.examples.patterns.singleton;

public class Connection {

    private static Connection instance;

    private Connection(){
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }
}
