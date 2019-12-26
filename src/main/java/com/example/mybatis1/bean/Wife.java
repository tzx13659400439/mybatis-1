package com.example.mybatis1.bean;

import java.io.Serializable;

public class Wife implements Serializable {
    private int id;
    private double salary;
    private String name;
    private Husband husband;

    public Wife() {
    }

    public Wife(int id, double salary, String name, Husband husband) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.husband = husband;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", husband=" + husband +
                '}';
    }
}
