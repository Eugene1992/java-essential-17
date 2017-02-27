package com.cbs.edu.hw01;

/**
 * Information about the company.
 * Created by Vladimir on 21.02.2017.
 */
public class Company {
    private String companyName;
    private String city;
    private int capital;
    private int amountOfWorkers;

    Company(String companyName, String city, int capital, int amountOfWorkers) {
        this.companyName = companyName;
        this.city = city;
        this.capital = capital;
        this.amountOfWorkers = amountOfWorkers;
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
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    /**
     * @autor kaban.
     */
    public void setAmountOfWorkers(int amountOfWorkers) throws Exception {
        if (amountOfWorkers < 0) {
            throw new IllegalArgumentException("The number of employees can not be negative");
        }
        this.amountOfWorkers = amountOfWorkers;

    }
}
