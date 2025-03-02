package org.example;

import java.time.LocalDate;

public class Main {
    public static void isLeapYear(int year) {//Метод, который определяет является ли указанный год високосным
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) { //Определяем является ли год високосным
            System.out.println(year + "  - високосный год.");
        } else {
            System.out.println(year + "  - невисокосный год");
        }
    }

    public static void isLightVersion(int clientOS, int clientDeviceYear) {//Метод, определяющий необходимость установки облегченной версии приложения
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

    public static int deliveryDays(int deliveryDistance) {//Метод, определяющий количество дней доставки до клиента
        if (deliveryDistance <= 20) {
            return 1; // Доставка в пределах 20км занимает 1 день
        } else if (deliveryDistance <= 60) {
            return 2; //Доставка в пределах 20-60км занимает 2 дня
        } else if (deliveryDistance <= 100) {
            return 3; //Доставка в пределах 60-100км занимает 3 дня
        } else return -1;//Возвращаемое значение, если расстояние до клиента больше 100км
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание:");
        System.out.println("Задача 1:");
        int year = 1904;
        isLeapYear(year);
        System.out.println("Задача 2:");
        int clientOS = 1;
        int clientDeviceYear = 2024;
        isLightVersion(clientOS, clientDeviceYear);
        System.out.println("Задача 3:");
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);
        if (deliveryDays(deliveryDistance) == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней " + deliveryDays(deliveryDistance));
        }
    }
}
