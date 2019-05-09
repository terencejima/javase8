package com.java8.interfaces;

/**
 * Created by Terence on 12/01/2017.
 */
public class Bear implements Canivore {
  /* @Override
    public void eatMeat() {
       System.out.println("Loves Meat");
    }*/

    @Override
    public void eatsPlants(int quantity) {
        System.out.println("Eating plants: " + quantity);
    }

    public static void main(String[] args) {

        Canivore canivore = new Bear();
        canivore.eatsPlants(Canivore.getJumpHeight());
        canivore.eatMeat();
    }
}
