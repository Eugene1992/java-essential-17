package com.cbs.edu.hw01;

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
        Project googleProject = new Project("Ara", LocalDate.of(2017, Month.APRIL, 1), LocalDate.of(2017, Month.DECEMBER, 20));
        Sprint googleSprint = new Sprint("Alfa", LocalDate.of(2017, Month.APRIL, 1), LocalDate.of(2017, Month.JULY, 15));
        Task googleTaskOne = new Task("Front-end", 150);

        Company apple = new Company("Apple.com", "USA", 100000, 140);
        Customer appleCustomer = new Customer("Tim Kuk", 38, 142);
        Project appleProject = new Project("Orange", LocalDate.of(2018, Month.JANUARY, 15), LocalDate.of(2018, Month.AUGUST, 20));
        Sprint appleSprint = new Sprint("Beta", LocalDate.of(2017, Month.MARCH, 11), LocalDate.of(2017, Month.JULY, 10));
        Task appleTask = new Task("Back-end", 350);

        Company tesla = new Company("Tesla.com", "USA", 5000000, 800);
        Customer teslaCustomer = new Customer("Ilon Mask", 12, 71);
        Project teslaProject = new Project("Ara", LocalDate.of(2017, Month.JANUARY, 15), LocalDate.of(2018, Month.AUGUST, 20));
        Sprint teslaSprint = new Sprint("Prototype", LocalDate.of(2017, Month.FEBRUARY, 11), LocalDate.of(2017, Month.JULY, 10));
        Task teslaTask = new Task("Prototype", 500);

        Company facebook = new Company("Facebook.com", "USA", 9000000, 1500);
        Customer facebookCustomer = new Customer("Mark Zukerberg", 45, 102);
        Project facebookProject = new Project("Armbook", LocalDate.of(2019, Month.JANUARY, 15), LocalDate.of(2019, Month.AUGUST, 20));
        Sprint facebookSprint = new Sprint("PreAlfa", LocalDate.of(2019, Month.FEBRUARY, 9), LocalDate.of(2018, Month.MAY, 14));
        Task facebookTask = new Task("Something", 200);

        Company asus = new Company("Asus.com", "USA", 1000000, 1480);
        Customer asusCustomer = new Customer("Some Asian", 24, 27);
        Project asusProject = new Project("Samurai", LocalDate.of(2020, Month.MAY, 1), LocalDate.of(2021, Month.FEBRUARY, 17));
        Sprint asusSprint = new Sprint("Katana", LocalDate.of(2020, Month.SEPTEMBER, 11), LocalDate.of(2021, Month.DECEMBER, 21));
        Task asusTask = new Task("Sharpen a blade", 200);
    }
}

