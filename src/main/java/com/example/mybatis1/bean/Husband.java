package com.example.mybatis1.bean;

public class Husband {
    private int id;
    private double salary;
    private String name;

    private Wife wife;

    @Override
    public String toString() {
        return "Husband{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", wife=" + wife +
                '}';
    }

    public Husband(int id, double salary, String name, Wife wife) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.wife = wife;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Husband() {

    }

    public Husband(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
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

}
