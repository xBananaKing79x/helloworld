package org.example;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        }
        else {
            System.out.println("Сиди дома");
        }
        System.out.println(sarah);
    }
}