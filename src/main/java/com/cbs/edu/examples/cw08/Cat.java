package com.cbs.edu.examples.cw08;

public class Cat extends Animal implements Cloneable {

    private String name;
    private int age;
    private Home home;

    public Cat(String name, int age, Home home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public Cat(Cat cat) {
        this.name = cat.name;
        this.age = cat.age;
        this.home = new Home(cat.home.getAddress());
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home=" + home +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("R.I.P");
    }
}
