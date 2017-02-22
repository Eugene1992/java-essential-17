package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 */
public class Sprint {
    Task task;
    private boolean state; //false - not ready, true - done

    public Sprint(Task task) {
        this.task = task;
        state = false;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
