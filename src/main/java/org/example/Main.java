package org.example;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Вывод в консоль числа от 1 до 10, вывод " + i);
        }
        //Задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println("Вывод в консоль числа от 10 до 1, вывод " + i);
        }
        //Задача 3
        for (int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {//Проверяем что число четное
                System.out.println("Вывод в консоль четных чисел от 0 до 17, число " + i);
            }
        }
        //Задача 4
        for (int i = 10; i >= -10; --i) {
            System.out.println("Вывод в консоль чисел от 10 до -10, число " + i);
        }
        //Задача 5
        for (int i = 1904; i <= 2096; i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) { //Определяем является ли год високосным
                System.out.println("Год " + i + " является високосным.");
            }
        }
        //Задача 6
        for (int i = 7; i <= 98; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        //Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача 8
        int monthlySavings = 29000;//Указываем сумму, которую будем откладывать
        int totalSavings = 0; //Указываем начальную сумму
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalSavings);
        }
        //Задача 9
        int monthlySavings2 = 29000;//Указываем сумму, которую будем откладывать
        double totalSavings2 = 0; //Указываем начальную сумму
        double annualInterestRate = 0.12;//Годовая процентная ставка
        double monthlyInterestRate = annualInterestRate / 12;//Месячная ставка
        for (int month = 1; month <= 12; month++) {
            totalSavings2 += monthlySavings2;
            totalSavings2 += (totalSavings2 * monthlyInterestRate);
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalSavings2);
        }
        //Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}



