package com.example.mybatis1.bean;

public class Scustomer {
    private int id;
    private double money;
    private String name;

    public Scustomer() {
    }

    public Scustomer(int sid, double smoney, String sname) {
        this.id = sid;
        this.money = smoney;
        this.name = sname;
    }

    public int getSid() {
        return id;
    }

    public void setSid(int sid) {
        this.id = sid;
    }

    public double getSmoney() {
        return money;
    }

    public void setSmoney(double smoney) {
        this.money = smoney;
    }

    public String getSname() {
        return name;
    }

    public void setSname(String sname) {
        this.name = sname;
    }

    @Override
    public String toString() {
        return "Scustomer{" +
                "id=" + id +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
