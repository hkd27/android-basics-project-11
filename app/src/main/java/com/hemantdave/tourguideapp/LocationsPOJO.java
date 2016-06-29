package com.hemantdave.tourguideapp;


public class LocationsPOJO {
    private String titles;
    private String description;
    private int images;

    public LocationsPOJO(String titles, String description, int images) {
        this.titles = titles;
        this.description = description;
        this.images = images;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}

