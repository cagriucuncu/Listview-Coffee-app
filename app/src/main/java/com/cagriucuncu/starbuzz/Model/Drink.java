package com.cagriucuncu.starbuzz.Model;

import java.io.Serializable;

public class Drink implements Serializable {
    private String name;
    private String description;
    private int inageResourceID;

    public Drink(String name, String description, int inageResourceID) {
        this.name = name;
        this.description = description;
        this.inageResourceID = inageResourceID;
    }

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Drink(String name) {
        this.name = name;
        this.description = name;
    }

    public int getInageResourceID() {
        return inageResourceID;
    }

    public void setInageResourceID(int inageResourceID) {
        this.inageResourceID = inageResourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getName();
    }
}
