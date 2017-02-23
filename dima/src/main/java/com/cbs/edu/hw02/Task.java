package com.cbs.edu.hw02;

import java.time.LocalDate;

/**
 * Created by dimon on 23.02.2017.
 */
public class Task {
    private String nameTask;
    private int timeForTask;
    private Task[] subtasks;
    private Sprint sprint;

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public int getTimeForTask() {
        return timeForTask;
    }

    public void setTimeForTask(int timeForTask) {
        this.timeForTask = timeForTask;
    }

    public Task[] getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(Task[] subtasks) {
        this.subtasks = subtasks;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Task(String nameTask, int timeForTask) {
        this.nameTask = nameTask;
        this.timeForTask = timeForTask;
    }
}
