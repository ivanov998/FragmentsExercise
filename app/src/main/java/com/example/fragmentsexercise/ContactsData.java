package com.example.fragmentsexercise;

import java.util.ArrayList;

public class ContactsData {
    public static ArrayList<Contact> generateData() {
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Georgi","Sofia", R.drawable.ic_launcher_background));
        contacts.add(new Contact("Ivan","Varna", R.drawable.ic_launcher_background));
        contacts.add(new Contact("Stoyan","Burgas", R.drawable.ic_launcher_background));

        return contacts;
    }
}
