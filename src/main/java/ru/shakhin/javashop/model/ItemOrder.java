package ru.shakhin.javashop.model;

import java.util.Date;

/**
 * Created by Kostya on 15.02.2015.
 */
public class ItemOrder {
    private int id;
    private Product product;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
