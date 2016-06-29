package com.hemantdave.tourguideapp;

/**
 * Created by INDIA on 6/29/2016.
 */
public class FoodiePOJO {
    private String titles;
    private String description;
    private String phoneNumber;
    private int images;

    public FoodiePOJO(String titles, String description, String phoneNumber, int images) {
        this.titles = titles;
        this.description = description;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
