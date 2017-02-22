package com.cbs.edu.examples.cw02;

import java.time.LocalDate;
import java.time.Month;

public class Test {
    public static void main(String[] args) throws Exception {
        Company company = new Company("Tesla", "California", 10000000, 100, "Ukraine",
                LocalDate.of(2017, Month.AUGUST, 21));

        Company secondCompany = new Company();

        secondCompany.setAmountOfWorkers(-100);

//        company.country = "Ukraine";
        company.setCapital(1000000);

        Company.capitalMoneyType = "$";
    }
}
