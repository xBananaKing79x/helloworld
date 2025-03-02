package org.example;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Main {
    public static void printSeparator() {
        System.out.println("++++++++++++++++");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }
    @org.jetbrains.annotations.Contract(pure = true)
    public static int sum(int @NotNull [] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static void isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) { //Определяем является ли год високосным
            System.out.println(year + "  - високосный год.");
        } else {
            System.out.println(year + "  - невисокосный год");
        }
    }
    public static void isLightVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) { // Проверяем, что это iOS
            if (clientDeviceYear < currentYear) { // Если год выпуска ранее текущего
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else { // Если год выпуска равен текущему
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) { // Проверяем, что это Android
            if (clientDeviceYear < currentYear) { // Если год выпуска ранее текущего
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else { // Если год выпуска равен текущему
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ошибка: Некорректное значение clientOS. Введите 0 для iOS или 1 для Android.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Упражнение урока:");
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
        System.out.println("Домашнее задание:");
        System.out.println("Задача 1:");
        int year = 1904;
        isLeapYear(year);
        System.out.println("Задача 2:");
        int clientOS = 1;
        int clientDeviceYear = 2024;
        isLightVersion(clientOS, clientDeviceYear);
        System.out.println("Задача 3:");

    }
}
