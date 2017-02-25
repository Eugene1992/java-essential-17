package com.cbs.edu.hw01;

import java.time.LocalDate;

/**
 * Class project describes projects which company is developing 22.02.17.
 */
public class Project {
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;
    //private Customer customer;
    // private Sprint[] sprints;

    public Project(String projectName, LocalDate startDate, LocalDate endDate) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
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
}
