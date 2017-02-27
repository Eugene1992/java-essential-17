package com.cbs.edu.hw02;

/**
 * Information about company.
 */
public class Company {
    private String companyName;
    private String country;
    private int capital;
    private int numberOfWorkers;

    public Company(String companyName, String country, int capital, int numberOfWorkers) {
        this.companyName = companyName;
        this.country = country;
        this.capital = capital;
        this.numberOfWorkers = numberOfWorkers;
    }

    public Company() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * showInf prints information about company.
     */
    static void showInf(Company company) {
        System.out.printf("Company name = %s; Country = %s; Capital = %d; Number of workers = %d;\n", company.companyName, company.country, company.capital, company.numberOfWorkers);
    }
}
