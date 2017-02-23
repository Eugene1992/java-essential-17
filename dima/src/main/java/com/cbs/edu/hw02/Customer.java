package com.cbs.edu.hw02;

/**
 * Created by dimon on 23.02.2017.
 */
public class Customer {
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    private String company;
    private String name;
    private int age;
    private int budget;

    Customer(String company,String name,int age, int budget){
        this.company = company;
        this.name = name;
        this.age = age;
        this.budget = budget;
    }
}
