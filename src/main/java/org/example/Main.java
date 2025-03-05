package org.example;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
 String [] names = {"John", "Sarah"};
 int [] ages = {13,30};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - "+ names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.Age = " + sarah.Age);
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.name);
        System.out.println("john.Age = " + john.Age);
    }

}