package com.shoppinglist;

import java.util.Set;

/**
 * Created by dekel31 on 12/3/2016.
 */
public class ItemType {
    private String name;
    private boolean included;
    int price;
    int quantity;
    Set<Market> markets;
    Section section;
    Category category;
    UseInterval useInterval;

    public ItemType(String name) {
        this.name = name;
    }

    public ItemType(String name, boolean included) {
        this.name = name;
        this.included = included;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }
}
