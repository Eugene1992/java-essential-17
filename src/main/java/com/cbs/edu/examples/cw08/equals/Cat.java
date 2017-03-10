package com.cbs.edu.examples.cw08.equals;

public class Cat {

    private String name;
    private int age;
    private double height;
    private boolean isHome;

    public Cat(String name, int age, double height, boolean isHome) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isHome = isHome;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHome() {
        return isHome;
    }

    public void setHome(boolean home) {
        isHome = home;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Cat cat = (Cat) obj;

        if (age != cat.age) return false;
        if (Double.compare(cat.height, height) != 0) return false;
        if (isHome != cat.isHome) return false;
        if (name != null) {
            return name.equals(cat.name);
        } else {
            return cat.name == null;
        }
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isHome ? 1 : 0);
        return result;
    }
}
