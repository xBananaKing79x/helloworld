package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("ДЗ Готово!");
        System.out.println("Упражнение");
        int[] weights = {90, 91, 92, 93, 95, 99, 109, 0, 0, 0, 0};//Создаем массив weights
        int[] weightsCopy = weights;// Создаем массив weightsCopy в том же диапазоне адреcов что и массив weights
        for (int i = 0; i < weights.length; i++) {//Вывод массива
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;//Создаем переменную в которую запишем результат сравнения массивов, по умолчанию "истина"
        arraysAreEqual = weights.length == weightsCopy.length;//Проверка на длину массива
        if (arraysAreEqual) {//Проверка на равенство значений массива
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");//Вывод если массивы равны
        } else {
            System.out.println("Массивы разные");//Вывод если массивы разные
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println("Максимальное значение: " + maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
        System.out.println("Домашнее задание");
        System.out.println("Задача 1:");
        int[] payments = {90, 100, 80, 100, 110};//Инициализируем массив значений выплат
        int paymentSum = 0;
        for (int payment : payments) {//Складываем значения массива
            paymentSum += payment;
        }
        System.out.println("Сумма трат за месяц составила: " + paymentSum + " рублей");
        System.out.println("Задача 2:");
        int minValue = 1000;
        int maxValue = -1;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > maxValue) {
                maxValue = payments[i];
            }
            if (payments[i] < minValue) {
                minValue = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minValue + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxValue + " рублей");
        System.out.println("Задача 3:");
        double averagePayment = paymentSum / payments.length;
        System.out.println("Средняя сумма затрат за месяц составила " + averagePayment + " рублей");
        System.out.println("Задача 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0; // Указатель на начало массива
        int right = reverseFullName.length - 1; // Указатель на конец массива
        while (left < right) {
            // Меняем местами символы
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            // Двигаем указатели к центру
            left++;
            right--;
        }
        System.out.println(reverseFullName);
    }
}
