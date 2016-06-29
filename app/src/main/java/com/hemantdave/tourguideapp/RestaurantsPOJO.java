package com.hemantdave.tourguideapp;

/**
 * Created by INDIA on 6/29/2016.
 */
public class RestaurantsPOJO {
    private String Name;
    private String location;
    private String timings;
    private int images;

    public RestaurantsPOJO(String name, String location, String timings, int images) {
        Name = name;
        this.location = location;
        this.timings = timings;
        this.images = images;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
