package com.example.mybatis1.bean;

public class Customer {
    private int id;
    private double money;
    private String name;

    public Customer() {
    }

    public Customer(int id, double money, String name) {
        this.id = id;
        this.money = money;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
