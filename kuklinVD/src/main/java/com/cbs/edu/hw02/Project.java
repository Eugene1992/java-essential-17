package com.cbs.edu.hw02;

import java.time.LocalDate;

/**
 * Class project describes projects which company is developing 22.02.17.
 */
public class Project {
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Customer customer;
    private Sprint[] sprints;

    public Project(String projectName, LocalDate startDate, LocalDate endDate, Customer customer, Sprint... sprints) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.sprints = sprints;
    }

    public Project(String projectName, LocalDate startDate, LocalDate endDate, Customer customer) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
    }

    public Project() {

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sprint[] getSprints() {
        return sprints;
    }

    public void setSprints(Sprint[] sprints) {
        this.sprints = sprints;
    }
}