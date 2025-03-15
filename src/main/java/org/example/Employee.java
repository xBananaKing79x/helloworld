package org.example;

import java.util.Objects;

//Класс сотрудник
public class Employee {
    private static String fullName;
    private static int department;
    private final int id;
    private double salary;
    private static int nextId = 1;

    //Конструктор класса, создающий сотрудника
    public Employee(String fullName, int department, double salary) {
        this.id = nextId++;
        this.fullName = fullName;
        setDepartment(department);
        this.salary = salary;
    }
    //Геттеры
    public int getID() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    //Сеттеры с валидацией
    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Отдел должен быть от1 до 5");
        }
     this.department =department;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return String.format(
                "ID: %d, ФИО: %s, Отдел: %d, Зарплата: %.2f",
                id, fullName, department, salary
        );
    }
}
