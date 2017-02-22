package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 */
public class Project {
    private Sprint currentSprint;
    int startData;
    int stopData;

    public Project(Sprint currentSprint, int startData, int stopData) {
        this.currentSprint = currentSprint;
        this.startData = startData;
        this.stopData = stopData;
    }

    /**
     * @param newSprint
     * @return true если поменяли фазу
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
}
