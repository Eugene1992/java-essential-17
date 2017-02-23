package com.cbs.edu.hw02;

/**
 * Created by dimon on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {
    Company myCompany = new Company("DmitriyProductCREATORINCORPORATED","Kyiv",141222,0);

    Customer applecomputers = new Customer("Apple","Antonio",25,503000);
    Project applecomputersProj = new Project("MakeSomeShit","11.09.01","11.09.27");
    Sprint applecomputersProjSprint = new Sprint("Nothing to done","Nothing to test","Nothing to show");
    Task applecomputersTask = new Task("DoNothing",15000);

    Customer googleInc = new Customer("GoogleInc","Aren",35,830000);
    Project googleIncProj = new Project("NewVerAndroid","27.10.16","27.10.17");
    Sprint googleIncProjSprint = new Sprint("MakeSomeCode","GetMillionBugs","BugsIsNormalForGreenRobot");
    Task googleIncTask = new Task("MakeBugs",17000);

    Customer tesla = new Customer("Tesla","Habib",28,110000);
    Project teslaProj = new Project("MakeSomeElectroCars","29.11.17","30.11.18");
    Sprint teslaProjSprint = new Sprint("StoleSomeProject","WorkingPrototype","FinalPrototype");
    Task teslaTask = new Task("MakeAWheel",20000);

    Customer ibm = new Customer("IMB","OLDMAN",35,830000);
    Project ibmProj = new Project("Calculator","2k17","2k18");
    Sprint ibmProjSprint = new Sprint("StoleCodeFormGitHub","Copyright","Well done!");
    Task ibmTask = new Task("ConnecttoGitHub",20000);

    }
}
