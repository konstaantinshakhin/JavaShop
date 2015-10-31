package ru.shakhin.javashop.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Kostya on 15.02.2015.
 */
public class Order {
   private int id;
   private List<ItemOrder> position;
   private User user;
   private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemOrder> getPosition() {
        return position;
    }

    public void setPosition(List<ItemOrder> position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
