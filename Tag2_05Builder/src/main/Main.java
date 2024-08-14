package main;

import pojo.Person;

public class Main {
    public static void main(String[] args) {


        Person p = Person.builder().vorname("Jane").nachname("Mustermann").build();
        System.out.println(p);


    }
}