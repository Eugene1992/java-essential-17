package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 * jk
 */
public class Main {
    /**
     * skdj  hfksdd fhksdf'sdfg
     * d sdflkg gf
     * sdfjg sdfg
     * sdfgdfg
     *
     * @param args sdfgsdf
     */
    public static void main(String[] args) {

        final int TEN = 10;
        final int TWENTY = 20;
        final int THIRTY = 30;
        final int FORTY = 40;
        final int FIFTY = 50;
        final int ZERO = 0;
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int FOUR = 4;
        final int FIVE = 5;

        Collaborator collaboratorOne = new Collaborator("A", TEN, TEN + ONE);
        Collaborator collaboratorTwo = new Collaborator("B", TWENTY, TWENTY + ONE);
        Collaborator collaboratorThree = new Collaborator("C", THIRTY, THIRTY + ONE);
        Collaborator collaboratorFour = new Collaborator("D", FORTY, FORTY + ONE);
        Collaborator collaboratorFive = new Collaborator("E", FIFTY, FIFTY + ONE);

        Task taskOne = new Task(ONE, TEN, ZERO);
        Task taskTwo = new Task(ONE, TWENTY, ZERO);
        Task taskThree = new Task(ONE, THIRTY, ZERO);
        Task taskFour = new Task(TWO, FORTY, ONE);
        Task taskFive = new Task(THREE, FIFTY, TWO);

        taskOne.setArrCollaborator(collaboratorOne);
        taskTwo.setArrCollaborator(collaboratorTwo);
        taskThree.setArrCollaborator(collaboratorThree);
        taskFour.setArrCollaborator(collaboratorFour);
        taskFour.setArrCollaborator(collaboratorFive);
        taskFour.setArrSubTask(taskThree);
        taskFive.setArrCollaborator(collaboratorThree, collaboratorFour, collaboratorFive);
        taskFive.setArrSubTask(taskOne, taskTwo);

        Sprint sprintOne = new Sprint(taskOne);
        Sprint sprintTwo = new Sprint(taskTwo);
        Sprint sprintThree = new Sprint(taskThree);
        Sprint sprintFour = new Sprint(taskFour);
        Sprint sprintFive = new Sprint(taskFive);

        Project projectOne = new Project(sprintFive, TEN, TWENTY + ONE);
        Project projectTwo = new Project(sprintFour, TWENTY, THIRTY + TWO);
        Project projectThree = new Project(sprintThree, THIRTY, FORTY + THREE);
        Project projectFour = new Project(sprintTwo, FORTY, FIFTY + FOUR);
        Project projectFive = new Project(sprintOne, FIFTY, FIFTY + FIVE);

        Customer customerOne = new Customer(projectOne);
        Customer customerTwo = new Customer(projectTwo);
        Customer customerThree = new Customer(projectThree);
        Customer customerFour = new Customer(projectFour);
        Customer customerFive = new Customer(projectFive);

        Company companyOne = new Company(THREE);
        Customer[] arrTempOne = {customerOne, customerTwo, customerThree};
        companyOne.setArrCustomer(arrTempOne);
        Company companyTwo = new Company(TWO);
        Customer[] arrTempTwo = {customerFour, customerFive};
        companyTwo.setArrCustomer(arrTempTwo);
    }
}
