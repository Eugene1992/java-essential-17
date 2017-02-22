package com.cbs.edu.hw01;

/**
 * Class customer describes clients of the company 22.02.17.
 */
public class Customer {
    String name;
    int customerId;
    int projectId;

    /**
     * showInf prints information about customer.
     */
    void showInf() {
        System.out.printf("Customer name = %s; CustomerId = %d; ProjectId = %d\n", this.name, this.customerId, this.projectId);
    }
}
