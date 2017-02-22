package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 * as
 */
public class Company {
    private Customer[] arrCustomer;

    public Company(int length) {
        this.arrCustomer = new Customer[length];
    }

    public Customer[] getArrCustomer() {
        return arrCustomer;
    }

    public void setArrCustomer(Customer[] arrCustomer) {
        this.arrCustomer = arrCustomer;
    }
}
