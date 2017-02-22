package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 * as
 */
public class Project {
    private Sprint currentSprint;
    private int startData;
    private int stopData;

    public Project(Sprint currentSprint, int startData, int stopData) {
        this.currentSprint = currentSprint;
        this.startData = startData;
        this.stopData = stopData;
    }

    /**
     * sdfa sdsd
     * sdf
     *
     * @param newSprint asdfa
     * @return asdfasd
     */
    public boolean setCurrentSprint(Sprint newSprint) {
        if (currentSprint.isState()) {
            this.currentSprint = newSprint;
            return true;
        } else {
            return false;
        }
    }

    public Sprint getCurrentSprint() {
        return currentSprint;
    }

    public int getStartData() {
        return startData;
    }

    public void setStartData(int startData) {
        this.startData = startData;
    }

    public int getStopData() {
        return stopData;
    }

    public void setStopData(int stopData) {
        this.stopData = stopData;
    }
}
