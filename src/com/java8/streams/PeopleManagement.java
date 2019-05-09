package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Collections.sort;

/**
 * Created by Terence on 19/01/2017.
 */
public class PeopleManagement {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Albert", 80, Person.Gender.MALE));
        persons.add(new Person("Ben", 15, Person.Gender.MALE));
        persons.add(new Person("Charlote", 20, Person.Gender.FEMALE));
        persons.add(new Person("Dean", 6, Person.Gender.MALE));
        persons.add(new Person("Elaine", 17, Person.Gender.FEMALE));

        PeopleManagement peopleManagement = new PeopleManagement();
        peopleManagement.printPersonsAscAge(persons);

        // How much code would you need to do the following without Lambdas?
        System.out.println("----------Printing Persons with age less than 18----------");
        printNames(persons, p -> ((Person) p).getAge() < 18);
        System.out.println("\n--------Printing all Males-------------");
        printNames(persons, p -> ((Person) p).getGender() == Person.Gender.MALE);
        System.out.println("\n---------Printing Persons with Names starting With C------------");
        printNames(persons, p -> ((Person) p).getName().startsWith("C"));

    }

    private void printPersonsAscAge(List<Person> persons){
        sort(persons, Person::compareByAge);
        persons.stream().forEach(p -> System.out.println(p.toString()));
    }

    private static void printNames(List persons, Predicate predicate) {
        Object[] allPersons = persons.stream().filter(predicate).toArray();
        System.out.println(allPersons.length == 3);

        persons.stream()
                .filter(predicate)
                .map(p -> ((Person) p).getName())
                .forEach(name -> System.out.println(name));
    }
}
