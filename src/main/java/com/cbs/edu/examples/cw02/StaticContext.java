package com.cbs.edu.examples.cw02;

import java.time.LocalDate;
import java.time.Month;

public class StaticContext {

    public static Company company;

    public static void main(String[] args) {
        company = new Company("Tesla", "California", 10000000, 100, "Ukraine",
                LocalDate.of(2017, Month.AUGUST, 21));
    }

    void ns() {
        System.out.println(company.getFoundedDate());
    }

    static void s() {
        System.out.println(company.getFoundedDate());
    }
}
