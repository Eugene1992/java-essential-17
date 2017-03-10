package com.cbs.edu.examples.cw07.enums;

public enum Country {
    USA("United States of America"),
    UK("United Kingdom");

    private String fullName;

    Country(String fullName) {
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
