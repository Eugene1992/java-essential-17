package com.cbs.edu;

/**
 * Customer Information.
 * Created by Vladimir on 21.02.2017.
 */
public class Customer {
    String customerCompanyName;
    String customerName;
    int customerAge;

    Customer(String customerCompanyName, String customerName, int customerAge) {
        this.customerCompanyName = customerCompanyName;
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    public String getCastomerCompanyName() {
        return customerCompanyName;
    }

    public void setCastomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
}
