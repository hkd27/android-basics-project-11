package com.hemantdave.tourguideapp;

/**
 * Created by INDIA on 6/29/2016.
 */
public class FactsPOJO {
    private String title;
    private String description;

    public FactsPOJO(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
