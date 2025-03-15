package org.example;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee ("Иван Петров", 1, 50000);
        employees[1] = new Employee ("Сергей Королев", 1, 45000);
        employees[2] = new Employee ("Светлана Кузнецова", 2, 35000);
        employees[3] = new Employee ("Кирилл Денисов", 2, 65000);
        employees[4] = new Employee ("Егор Воронкин", 3, 33000);
        employees[5] = new Employee ("Ирина Ястребова", 3, 46000);
    }
}