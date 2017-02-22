package com.cbs.edu.hw01;

/**
 * Created by dimon on 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Company america = new Company();
        america.companyName = "Apple";
        america.city = "Cupertino";
        america.thenumofemployees = 50000;
        america.capital = 800000000;

        Customer americaCustomer = new Customer();
        americaCustomer.name = "Steven";
        americaCustomer.company = "MicroSystems";
        americaCustomer.age = 50;
        americaCustomer.budget = 132000;

        Project americaProject = new Project();
        /*americaProject.startDateDay = 13;
        americaProject.startDateMon = 1;
        americaProject.startDateYear = 2017;

        americaProject.deadLineDay = 31;
        americaProject.startDateMon = 12;
        americaProject.startDateYear = 2017;*/

        Sprint americaSprint = new Sprint();

        americaSprint.developmentSprint = "First beta version";
        americaSprint.testSprint = "Closed beta testing";
        americaSprint.finalSprint = "Final verion";

        Task americaTask = new Task();

        americaTask.hours = 150;

        Company europe = new Company();
        europe.companyName = "Bosh";
        europe.city = "Berlin";
        europe.capital = 5400000;
        europe.thenumofemployees = 15000;

        Customer europeCustomer = new Customer();














    }
}
