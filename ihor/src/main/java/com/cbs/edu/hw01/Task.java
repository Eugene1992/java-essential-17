package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 * Task
 */
public class Task {
    private int quantityCollaborator; // max 10
    Collaborator[] arrCollaborator;
    int timeLead;
    private int quantitySudTask; // max 10
    Task[] arrSubTask;

    /**
     * конструктор
     *
     * @param quantityCollaborator
     * @param timeLead
     * @param quantitySudTask
     */
    public Task(int quantityCollaborator, int timeLead, int quantitySudTask) {
        this.quantityCollaborator = quantityCollaborator;
        arrCollaborator = new Collaborator[quantityCollaborator];
        this.timeLead = timeLead;
        this.quantitySudTask = quantitySudTask;
        arrSubTask = new Task[quantitySudTask];
    }
}
