package com.example.saeed.sanfranciscotourguide;

import android.util.Log;


public class Location {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String web;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Location(String name, String description, String address, String phone,
                    String web, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.web = web;
        this.imageResourceId = imageResourceId;
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

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getweb() {
        return web;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        Log.v("hasImage", "word has image: " + (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasweb() {
        return getweb() != null;
    }

    public boolean hasPhone() {
        return getPhone() != null;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }


    @Override
    public String toString() {
        String title = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getweb() + "\n" +
                getImageResourceId();

        return title;
    }
}
