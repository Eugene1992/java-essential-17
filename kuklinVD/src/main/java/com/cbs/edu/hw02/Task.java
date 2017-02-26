package com.cbs.edu.hw02;


/**
 * Parts of the sprint 22.02.17.
 */
public class Task {
    private String taskName;
    private int runTime;
    private Task[] subTasks;
    private boolean status;

    public Task(String taskName, int runTime, boolean status, Task... subTasks) {
        this.taskName = taskName;
        this.runTime = runTime;
        this.subTasks = subTasks;
        this.status = status;
    }

    public Task(String taskName, int runTime, boolean status) {
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Task[] getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(Task[] subTasks) {
        this.subTasks = subTasks;
    }
}
