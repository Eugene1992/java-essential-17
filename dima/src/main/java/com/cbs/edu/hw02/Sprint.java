package com.cbs.edu.hw02;

/**
 * Created by dimon on 23.02.2017.
 */
public class Sprint {
   private String developmentSprint;
   private String testSprint;
   private String finalSprint;
   private Task[] tasks;
   private Project project;

    public String getDevelopmentSprint() {
        return developmentSprint;
    }

    public void setDevelopmentSprint(String developmentSprint) {
        this.developmentSprint = developmentSprint;
    }

    public String getTestSprint() {
        return testSprint;
    }

    public void setTestSprint(String testSprint) {
        this.testSprint = testSprint;
    }

    public String getFinalSprint() {
        return finalSprint;
    }

    public void setFinalSprint(String finalSprint) {
        this.finalSprint = finalSprint;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Sprint(String developmentSprint, String testSprint, String finalSprint) {
        this.developmentSprint = developmentSprint;
        this.testSprint = testSprint;
        this.finalSprint = finalSprint;
    }
}
