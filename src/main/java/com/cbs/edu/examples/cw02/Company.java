package com.cbs.edu.examples.cw02;

import java.time.LocalDate;

/**
 * Information about the company.
 * Created by Vladimir on 21.02.2017.
 */
public class Company {

    private String companyName;
    private String city;
    private int capitalSize;
    private int amountOfWorkers;
    String countryName;
    private LocalDate foundedDate;
    static String capitalMoneyType;

    public Company(String companyName, String city, int capitalSize, int amountOfWorkers, String countryName, LocalDate foundedDate) {
        this.companyName = companyName;
        this.city = city;
        this.capitalSize = capitalSize;
        this.amountOfWorkers = amountOfWorkers;
        this.countryName = countryName;
        this.foundedDate = foundedDate;
    }

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapital() {
        return capitalSize;
    }

    public void setCapital(int capitalSize) {
        this.capitalSize = capitalSize;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    public LocalDate getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(LocalDate foundedDate) {
        this.foundedDate = foundedDate;
    }

    public void setAmountOfWorkers(int amountOfWorkers) throws Exception {
        if (amountOfWorkers < 0) throw new IllegalArgumentException("Negative amount of workers value");
        this.amountOfWorkers = amountOfWorkers;
    }
}
