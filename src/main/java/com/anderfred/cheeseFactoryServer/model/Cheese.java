package com.anderfred.cheeseFactoryServer.model;

import java.util.Date;

public class Cheese {
    private String name;
    private int weight;
    private int id;
    private Date produceDate;
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Cheese() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", id=" + id +
                ", produceDate=" + produceDate +
                ", state='" + state + '\'' +
                '}';
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public int getId() {
        return id;
    }

}
