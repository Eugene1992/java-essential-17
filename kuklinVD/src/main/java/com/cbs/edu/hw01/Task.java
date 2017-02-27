package com.cbs.edu.hw01;


/**
 * Parts of the sprint 22.02.17.
 */
public class Task {
    private String taskName;
    private int runTime;
    // private Task[] subTasks;

    public Task(String taskName, int runTime) {
        this.taskName = taskName;
        this.runTime = runTime;
    }

    public Task() {

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

}
