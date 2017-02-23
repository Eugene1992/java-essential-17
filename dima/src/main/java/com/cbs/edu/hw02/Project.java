package com.cbs.edu.hw02;

import java.time.LocalDate;

/**
 * Created by dimon on 23.02.2017.
 */
public class Project {
    public String getPrjName() {
        return prjName;
    }

    public void setPrjName(String prjName) {
        this.prjName = prjName;
    }

    public String getStartPrjDate() {
        return startPrjDate;
    }

    public void setStartPrjDate(String startPrjDate) {
        this.startPrjDate = startPrjDate;
    }

    public String getDeadPrjLine() {
        return deadPrjLine;
    }

    public void setDeadPrjLine(String deadPrjLine) {
        this.deadPrjLine = deadPrjLine;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private String prjName;
    private String startPrjDate;
    private String deadPrjLine;
    private Customer customer;

    public Project(String prjName, String startPrjDate, String deadPrjLine) {
        this.prjName = prjName;
        this.startPrjDate = startPrjDate;
        this.deadPrjLine = deadPrjLine;
    }

}


