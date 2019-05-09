package com.java8.streams;

/**
 * Created by Terence on 19/01/2017.
 */
public class Person {
    public enum Gender  { MALE, FEMALE }

    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public static int compareByAge(Person a, Person b) {
        Integer aAge = Integer.valueOf(a.getAge());
        Integer bAge = Integer.valueOf(b.getAge());
        return aAge.compareTo(bAge);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
