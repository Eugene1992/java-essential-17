package com.cbs.edu;

/**
 * Number of phases.
 */
public class Sprint {
    private String sprintName;
    private int leadTime;

    public Sprint(String sprintName, int leadTime) {
        this.sprintName = sprintName;
        this.leadTime = leadTime;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public int getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(int leadTime) {
        this.leadTime = leadTime;
    }
}
