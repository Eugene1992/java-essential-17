package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 * as
 */
public class Customer {
    private Project project;

    public Customer(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
