package com.cbs.edu.hw01;

/**
 * Development time.
 * Created by Vladimir on 21.02.2017.
 */
public class Task {
    private String title;
    private String description;
    private int estimate;

    Task(String title, String description, int estimate) {
        this.title = title;
        this.description = description;
        this.estimate = estimate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }
}
