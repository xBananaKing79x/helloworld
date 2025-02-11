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
        for (int i = 10; i>=-10; --i){
            System.out.println("Вывод в консоль чисел от 10 до -10, число " + i);
        }
        //Задача 5
        for (int i = 1904; i<=2096;i=i+4)
    }

}
