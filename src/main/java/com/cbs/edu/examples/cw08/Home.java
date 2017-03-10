package com.cbs.edu.examples.cw08;

public class Home {

    private String address;

    public Home(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Home{" +
                "address='" + address + '\'' +
                '}';
    }
}
