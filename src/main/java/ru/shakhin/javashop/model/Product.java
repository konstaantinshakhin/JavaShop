package ru.shakhin.javashop.model;

/**
 * Created by Kostya on 15.02.2015.
 */
public class Product {
    private Long id;
    private String name;
    private String cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
