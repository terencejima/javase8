package com.java8.interfaces;

/**
 * Created by Terence on 12/01/2017.
 */
public interface Canivore {
    public default void eatMeat(){
        System.out.println("Eating Meat");
    }

    public void eatsPlants(int quantity);

    public static int getJumpHeight(){
        return 8;
    }

}
