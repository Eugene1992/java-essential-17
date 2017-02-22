package com.cbs.edu.hw01;

/**
 * Created by ihor on 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Collaborator a = new Collaborator("A", 10, 11);
        Collaborator b = new Collaborator("B", 20, 21);
        Collaborator c = new Collaborator("C", 30, 31);
        Collaborator d = new Collaborator("D", 40, 41);
        Collaborator e = new Collaborator("E", 50, 51);

        Task taskOne = new Task(1, 10, 0);
        Task taskTwo = new Task(1, 20, 0);
        Task taskThree = new Task(1, 30, 0);
        Task taskFour = new Task(2, 40, 1);
        Task taskFive = new Task(3, 50, 2);

        taskOne.arrCollaborator[0] = a;
        taskTwo.arrCollaborator[0] = b;
        taskThree.arrCollaborator[0] = c;
        taskFour.arrCollaborator[0] = d;
        taskFour.arrCollaborator[0] = e;
        taskFour.arrSubTask[0] = taskThree;
        taskFive.arrCollaborator[0] = c;
        taskFive.arrCollaborator[1] = d;
        taskFive.arrCollaborator[2] = e;
        taskFive.arrSubTask[0] = taskOne;
        taskFive.arrSubTask[1] = taskTwo;

        Sprint sprintOne = new Sprint(taskOne);
        Sprint sprintTwo = new Sprint(taskTwo);
        Sprint sprintThree = new Sprint(taskThree);
        Sprint sprintFour = new Sprint(taskFour);
        Sprint sprintFive = new Sprint(taskFive);

        Project projectOne = new Project(sprintFive, 10, 20);
        Project projectTwo = new Project(sprintFour, 20, 30);
        Project projectThree = new Project(sprintThree, 30, 40);
        Project projectFour = new Project(sprintTwo, 40, 50);
        Project projectFive = new Project(sprintOne, 50, 60);

        Customer customerOne = new Customer(projectOne);
        Customer customerTwo = new Customer(projectTwo);
        Customer customerThree = new Customer(projectThree);
        Customer customerFour = new Customer(projectFour);
        Customer customerFive = new Customer(projectFive);


        Company companyOne = new Company();
        companyOne.arrCustomer = new Customer[3];
        companyOne.arrCustomer[0] = customerOne;
        companyOne.arrCustomer[1] = customerTwo;
        companyOne.arrCustomer[2] = customerThree;
        Company companyTwo = new Company();
        companyTwo.arrCustomer = new Customer[2];
        companyTwo.arrCustomer[0] = customerFour;
        companyTwo.arrCustomer[1] = customerFive;
    }
}
