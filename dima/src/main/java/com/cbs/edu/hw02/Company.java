package com.cbs.edu.hw02;

/**
 * Created by dimon on 23.02.2017.
 */
public class Company {
    private static String companyName;
    private static String city;
    private static int thenumofemployees;
    private static int capital;

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Company.city = city;
    }

    public static int getThenumofemployees() {
        return thenumofemployees;
    }

    public static void setThenumofemployees(int thenumofemployees) {
        Company.thenumofemployees = thenumofemployees;
    }

    public static int getCapital() {
        return capital;
    }

    public static void setCapital(int capital) {
        Company.capital = capital;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    private Customer[] customers;

    public Company(String companyName, String city, int thenumofemployees, int capital) {
        this.companyName = companyName;
        this.city = city;
        this.thenumofemployees = thenumofemployees;
        this.capital = capital;
    }
}
