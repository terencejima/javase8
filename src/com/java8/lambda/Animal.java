package com.java8.lambda;

/**
 * Created by Terence on 12/01/2017.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;

        return species != null ? species.equals(animal.species) : animal.species == null;
    }

    @Override
    public int hashCode() {
        int result = species != null ? species.hashCode() : 0;
        result = 31 * result + (canHop ? 1 : 0);
        result = 31 * result + (canSwim ? 1 : 0);
        return result;
    }
}
