package com.cbs.edu.hw01;


import java.time.LocalDate;

/**
 * Duration of the project.
 * Created by Vladimir on 21.02.2017.
 */

public class Project {
    private LocalDate startDate;
    private LocalDate endDate;

    Project(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
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

    public void setEndDateDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
