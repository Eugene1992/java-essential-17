package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 * Task
 */
public class Task {
    private int quantityCollaborator; // max 10
    private Collaborator[] arrCollaborator;
    private int timeLead;
    private int quantitySudTask; // max 10
    private Task[] arrSubTask;

    public Task(int quantityCollaborator, int timeLead, int quantitySudTask) {
        this.quantityCollaborator = quantityCollaborator;
        arrCollaborator = new Collaborator[quantityCollaborator];
        this.timeLead = timeLead;
        this.quantitySudTask = quantitySudTask;
        arrSubTask = new Task[quantitySudTask];
    }

    public Collaborator[] getArrCollaborator() {
        return arrCollaborator;
    }

    public void setArrCollaborator(Collaborator collaboratorOne) {
        this.arrCollaborator[0] = collaboratorOne;
    }

    public void setArrCollaborator(Collaborator collaboratorOne, Collaborator collaboratorTwo) {
        this.arrCollaborator[0] = collaboratorOne;
        this.arrCollaborator[1] = collaboratorTwo;
    }

    public void setArrCollaborator(Collaborator collaboratorOne, Collaborator collaboratorTwo, Collaborator collaboratorThree) {
        this.arrCollaborator[0] = collaboratorOne;
        this.arrCollaborator[1] = collaboratorTwo;
        this.arrCollaborator[2] = collaboratorThree;
    }

    public int getTimeLead() {
        return timeLead;
    }

    public void setTimeLead(int timeLead) {
        this.timeLead = timeLead;
    }

    public Task[] getArrSubTask() {
        return arrSubTask;
    }

    public void setArrSubTask(Task arrSubTask) {
        this.arrSubTask[0] = arrSubTask;
    }

    public void setArrSubTask(Task arrSubTaskOne, Task arrSubTaskTwo) {
        this.arrSubTask[0] = arrSubTaskOne;
        this.arrSubTask[1] = arrSubTaskTwo;
    }
}
