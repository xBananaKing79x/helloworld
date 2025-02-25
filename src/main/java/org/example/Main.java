package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Упражнение урока");
        String phone = " 903-970-57-63";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Зачение слишком длинное");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Значение слишком короткое");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
// Записываем строку expectedPhone («ожидаемыйТелефон»)
        if (phone.equals(expectedPhone)) {
// Сравниваем phone с expectedPhone с помощью метода equals()
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        String s = "9";
        String s1 = s.repeat(10);
        System.out.println(s1);
        System.out.println("Домашнее задание:");
        System.out.println("Задача 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Задача 2:");
        String upperName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + upperName);
        System.out.println("Задача 3:");
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + newFullName);
    }
}