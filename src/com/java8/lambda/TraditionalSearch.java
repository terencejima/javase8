package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Terence on 12/01/2017.
 */
public class TraditionalSearch {

    public static void main(String[] args){
        List<Animal> animals =  new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canSwim());
        verifyEquality(animals.get(0),  a -> animals.get(0).equals(animals.get(0)));
    }


    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal: animals){
            if(checker.test(animal))
                System.out.println(animal + " ");
        }

        System.out.println("Initial # animals: " + animals.size());
        animals.removeIf(animal -> animal.toString().equals("kangaroo"));
        System.out.println("# animals: " + animals.size());
    }

    private static void verifyEquality(Animal animal, Predicate predicate){
        if(predicate.test(animal)){
            System.out.println("the animals are equal");
        } else {
            System.out.println("the animals are not equal");
        }
    }
}
