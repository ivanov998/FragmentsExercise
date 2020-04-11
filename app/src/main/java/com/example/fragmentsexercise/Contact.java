package com.example.fragmentsexercise;

public class Contact {
    private String name;
    private String address;
    private int imageID;

    public Contact(String name, String address, int imageID) {
        this.name = name;
        this.address= address;
        this.imageID = imageID;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
