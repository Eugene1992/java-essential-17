package com.cbs.edu.hw02;

import java.time.LocalDate;
import java.time.Month;

/**
 * Main class.
 */
public class Main {
    /**
     * Main class.
     */
    public static void main(String[] args) {
        Company google = new Company("Google.com", "USA", 10000000, 2000);
        Customer googleCustomer = new Customer("Sergei Brin", 24, 27);
        Task googleBackServer = new Task("Server", 100, true);
        Task googleBackDataBase = new Task("Data Base", 200, true);
        Task googleBackTest = new Task("Test", 150, false);
        Task googleFrontend = new Task("Front-end", 150, true);
        Task googleBackend = new Task("Back-end", 450, false, googleBackServer, googleBackDataBase);
        Task googleTestRelease = new Task("Test release", 150, false);
        Sprint googleAlfaSprint = new Sprint("Alfa", LocalDate.of(2017, Month.APRIL, 1), LocalDate.of(2017, Month.JULY, 15), googleFrontend, googleBackend);
        Sprint googleBetaSprint = new Sprint("Beta", LocalDate.of(2017, Month.JULY, 16), LocalDate.of(2017, Month.DECEMBER, 20), googleTestRelease);
        Project googleProject = new Project("Ara", LocalDate.of(2017, Month.APRIL, 1), LocalDate.of(2017, Month.DECEMBER, 20), googleCustomer, googleAlfaSprint, googleBetaSprint);

        Company apple = new Company("Apple.com", "USA", 100000, 140);
        Customer appleCustomer = new Customer("Tim Kuk", 38, 142);
        Task appleFrontend = new Task("Client part", 148, false);
        Task appleBackSrvice = new Task("Service", 200, true);
        Task appleBackTest = new Task("Test", 150, true);
        Task appleBackend = new Task("Back-end", 350, true, appleBackSrvice, appleBackTest);
        Sprint appleBetaSprint = new Sprint("Beta", LocalDate.of(2017, Month.MARCH, 11), LocalDate.of(2017, Month.JULY, 10), appleBackend);
        Sprint appleAlfaSprint = new Sprint("Alfa", LocalDate.of(2018, Month.JANUARY, 15), LocalDate.of(2018, Month.MARCH, 11), appleFrontend);
        Project appleProject = new Project("Orange", LocalDate.of(2018, Month.JANUARY, 15), LocalDate.of(2018, Month.AUGUST, 20), appleCustomer, appleAlfaSprint, appleBetaSprint);

        Company tesla = new Company("Tesla.com", "USA", 5000000, 800);
        Customer teslaCustomer = new Customer("Ilon Mask", 12, 71);
        Task teslaPrototype = new Task("Prototype", 500, true);
        Task teslaTest = new Task("Prototype test", 150, false);
        Sprint teslaPrototypeSprint = new Sprint("Prototype", LocalDate.of(2017, Month.FEBRUARY, 11), LocalDate.of(2017, Month.JULY, 10), teslaPrototype);
        Sprint teslaTestSprint = new Sprint("Test", LocalDate.of(2017, Month.JULY, 11), LocalDate.of(2018, Month.AUGUST, 20), teslaTest);
        Project teslaProject = new Project("Ara", LocalDate.of(2017, Month.JANUARY, 15), LocalDate.of(2018, Month.AUGUST, 20), teslaCustomer, teslaPrototypeSprint, teslaTestSprint);

        Company facebook = new Company("Facebook.com", "USA", 9000000, 1500);
        Customer facebookCustomer = new Customer("Mark Zukerberg", 45, 102);
        Task facebookArm = new Task("Arm", 200, true);
        Task facebookBook = new Task("Book", 99, false);
        Sprint facebookPreAlfaSprint = new Sprint("PreAlfa", LocalDate.of(2019, Month.FEBRUARY, 9), LocalDate.of(2018, Month.MAY, 14), facebookArm, facebookBook);
        Project facebookProject = new Project("Armbook", LocalDate.of(2019, Month.JANUARY, 15), LocalDate.of(2019, Month.AUGUST, 20), facebookCustomer, facebookPreAlfaSprint);

        Company asus = new Company("Asus.com", "USA", 1000000, 1480);
        Customer asusCustomer = new Customer("Some Asian", 24, 27);
        Task asusSharp = new Task("Sharpen a blade", 200, true);
        Task asusBlade = new Task("Buid a blade", 145, true);
        Sprint asusKatanaSprint = new Sprint("Katana", LocalDate.of(2020, Month.SEPTEMBER, 11), LocalDate.of(2021, Month.DECEMBER, 21), asusBlade, asusSharp);
        Project asusProject = new Project("Samurai", LocalDate.of(2020, Month.MAY, 1), LocalDate.of(2021, Month.FEBRUARY, 17), asusCustomer, asusKatanaSprint);
    }
}

