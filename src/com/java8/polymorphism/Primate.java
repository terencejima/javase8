package com.java8.polymorphism;

/**
 * Created by Terence on 12/01/2017.
 */
public class Primate {

    private String name;
    public Primate(String name) {
        this.name = name;
    }

    public boolean hasHair(){
        return true;
    }

    public String getName(){
        return name;
    }

    public void displayInformation(){
        System.out.println(getName());
    }
}
