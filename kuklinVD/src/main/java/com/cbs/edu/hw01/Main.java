package com.cbs.edu.hw01;

/**
 * Main class updated 22.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Customer google = new Customer();
        google.name = "Google.com";
        google.customerId = 1;
        google.projectId = 148;
        Project googleProject = new Project();
        googleProject.startDate = "01.12.17";
        googleProject.endDate = "08.5.18";
        Sprint googleProjectSprintFirst = new Sprint();
        googleProjectSprintFirst.endDate = "27.03.18";
        Task googleProjectTaskOne = new Task();
        googleProjectTaskOne.runTime = 250;
        Task googleProjectTaskSecond = new Task();
        googleProjectTaskSecond.runTime = 150;
        google.showInf();

        Customer facebook = new Customer();
        facebook.name = "Facebook.com";
        facebook.customerId = 7;
        facebook.projectId = 136;
        Project facebookProject = new Project();
        facebookProject.startDate = "15.09.18";
        facebookProject.endDate = "08.12.18";
        Sprint facebookProjectSprintFirst = new Sprint();
        facebookProjectSprintFirst.endDate = "02.11.18";
        Task facebookProjectTaskOne = new Task();
        facebookProjectTaskOne.runTime = 50;
        Task facebookProjectTaskSecond = new Task();
        facebookProjectTaskSecond.runTime = 20;
        facebook.showInf();

        Customer apple = new Customer();
        apple.name = "Apple.com";
        apple.customerId = 24;
        apple.projectId = 256;
        Project appleProject = new Project();
        appleProject.startDate = "11.03.19";
        appleProject.endDate = "24.08.19";
        Sprint appleProjectSprintFirst = new Sprint();
        appleProjectSprintFirst.endDate = "05.06.19";
        Task appleProjectTaskOne = new Task();
        appleProjectTaskOne.runTime = 100;
        apple.showInf();

        Customer tesla = new Customer();
        tesla.name = "Tesla.com";
        tesla.customerId = 18;
        tesla.projectId = 62;
        Project teslaProject = new Project();
        teslaProject.startDate = "11.03.20";
        teslaProject.endDate = "24.08.20";
        Sprint teslaProjectSprintFirst = new Sprint();
        teslaProjectSprintFirst.endDate = "15.04.20";
        Task teslaProjectTaskOne = new Task();
        teslaProjectTaskOne.runTime = 150;
        tesla.showInf();

        Customer microsoft = new Customer();
        microsoft.name = "Microsoft.com";
        microsoft.customerId = 58;
        microsoft.projectId = 279;
        Project microsoftProject = new Project();
        microsoftProject.startDate = "18.09.20";
        microsoftProject.endDate = "13.04.21";
        Sprint microsoftProjectSprintFirst = new Sprint();
        microsoftProjectSprintFirst.endDate = "14.12.20";
        Sprint microsoftProjectSprintSecond = new Sprint();
        microsoftProjectSprintSecond.endDate = "10.02.21";
        Task microsoftProjectTaskOne = new Task();
        microsoftProjectTaskOne.runTime = 150;
        Task microsoftProjectTaskTwo = new Task();
        microsoftProjectTaskTwo.runTime = 50;
        Task microsoftProjectTaskThree = new Task();
        microsoftProjectTaskThree.runTime = 40;
        microsoft.showInf();
    }
}

