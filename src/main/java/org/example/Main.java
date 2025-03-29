package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика");
        createByte();
        createInt();
        createLong();
        createChar();
        createDouble();
        System.out.println("Домашнее задание");
//        System.out.println("Пример 1:");
//        int value = 33;
//        changeValue(value);
//        System.out.println("value = " + value);
//        System.out.println("Пример 2:");
//        Integer value2 = 33;
//        changeValue(value2);
//        System.out.println("value 2 = " + value2);
//        System.out.println("Пример 3:");
//        Integer[] value3 = {3, 4};
//        changeValue(value3);
//        System.out.println("value 3 = " + Arrays.toString(value3));
//        System.out.println("Пример 4:");
//        Integer[] value4 = {3, 4};
//        changeValue(value4);
//        System.out.println("value 4 = " + Arrays.toString(value4));
//        System.out.println("Пример 5:");
//        Person person = new Person("Fedor", "Dostoevskiy");
//        changePerson(person);
//        System.out.println("person = " + person);
        System.out.println("Пример 6:");
        Person person = new Person("Fedor","Dostoevskiy");
        changePerson(person);
        System.out.println("person = " + person);
    }
    public static void changePerson(Person person){
        person.name = "Lev";
        person.surname = "Tolstoy";
    }
    public static void changeValue(Integer[] value4) {
        value4[0] = 99;
    }

    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void createByte() {
        System.out.println("Main.createByte");
        byte b = (byte) 129;
        System.out.println("byte b - " + b);
    }

    public static void createInt() {
        System.out.println("Main.createInt");
        int i = Integer.MAX_VALUE + 1;
        System.out.println("int i - " + i);
        System.out.println("MinInt - " + Integer.MIN_VALUE);
    }

    public static void createLong() {
        System.out.println("Main.createLong");
        long l = Long.MAX_VALUE + 1;
        System.out.println("long l - " + l);
    }

    public static void createChar() {
        System.out.println("Main.createChar");
        char c = 68;
        System.out.println("c - " + (char) (c + 1));
    }

    public static void createDouble() {
        System.out.println("Main.createDouble");
//         double d = 2/50d;
        double d = Double.MAX_VALUE * Double.MAX_VALUE;
        System.out.println("d - " + d);
    }

}