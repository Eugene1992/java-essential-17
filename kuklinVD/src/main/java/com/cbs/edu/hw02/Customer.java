package com.cbs.edu.hw02;

/**
 * Class customer describes clients of the company 22.02.17.
 */
public class Customer {
    private String customerName;
    private int customerId;
    private int projectId;

    public Customer(String customerName, int customerId, int projectId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.projectId = projectId;
    }

    public Customer() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * showInf prints information about customer.
     */
    static void showInf(Customer customer) {
        System.out.printf("Customer name = %s; CustomerId = %d; ProjectId = %d\n", customer.customerName, customer.customerId, customer.projectId);
    }
}
