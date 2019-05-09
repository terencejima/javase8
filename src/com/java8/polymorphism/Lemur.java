package com.java8.polymorphism;

/**
 * Created by Terence on 12/01/2017.
 */
public class Lemur extends Primate implements HasTail {

    private int age = 18;

    public Lemur(int age) {
        super("Test");
        this.age = age;
    }

    @Override
    public boolean isTailStriped() {
        return false;
    }

    public String getName(){
        return "Lemur";
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur(12);
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        primate.displayInformation();
    }
}
