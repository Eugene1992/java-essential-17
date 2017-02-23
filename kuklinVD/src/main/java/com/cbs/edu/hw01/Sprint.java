package com.cbs.edu.hw01;

import java.time.LocalDate;

/**
 * Parts of the project 22.02.17.
 */
public class Sprint {
    private String sprintName;
    private LocalDate startDate;
    private LocalDate endDate;
    // private Project projectName;
    // private Task[] tasks;

    public Sprint(String sprintName, LocalDate startDate, LocalDate endDate) {
        this.sprintName = sprintName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Sprint(){

    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
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
