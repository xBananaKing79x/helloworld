package org.example;

import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];
    //Базовые методы
    //Печать количества сотрудников
    public static void printAllEmployees() {
        for (Employee emp : employees) {
            if (emp != null) System.out.println(emp);
        }
    }

    //Печать фонда оплаты труда
    public static double calculateTotalSalary() {
        double total = 0;
        for (Employee emp : employees) {
            if (emp != null) total += emp.getSalary();
        }
        return total;
    }

    //Поиск сотрудника с минимальным окладом
    public static Employee findMinSalaryEmployee() {
        Employee minEmp = null;
        double min = Double.MAX_VALUE;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < min) {
                min = emp.getSalary();
                minEmp = emp;
            }
        }
        return minEmp;
    }

    //Поиск сотрудника с максимальным окладом
    public static Employee findMaxSalaryEmployee() {
        Employee maxEmp = null;
        double max = Double.MIN_VALUE;
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > max) {
                max = emp.getSalary();
                maxEmp = emp;
            }
        }
        return maxEmp;
    }

    //Расчет средней зарплаты по компании
    public static double calculateAverageSalary() {
        int count = 0;
        double total = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.getSalary();
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    //Вывод полного имени
    public static void printFullNames() {
        for (Employee emp : employees) {
            if (emp != null) System.out.println(emp.getFullName());
        }
    }

    //Методы повышенной сложности
    //Метод индексации ЗП на указанный процент
    public static void indexSalaries(double percent) {
        for (Employee emp : employees) {
            if (emp != null) {
                emp.setSalary(emp.getSalary() * (1 + percent / 100));
            }
        }
    }

    //Поиск минимального оклада по департаменту
    public static Employee findDepartmentMinSalary(int department) {
        Employee minEmp = null;
        double min = Double.MAX_VALUE;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department && emp.getSalary() < min) {
                min = emp.getSalary();
                minEmp = emp;
            }
        }
        return minEmp;
    }

    //Поиск максимального оклада по департаменту
    public static Employee findDepartmentMaxSalary(int department) {
        Employee maxEmp = null;
        double max = Double.MIN_VALUE;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department && emp.getSalary() > max) {
                max = emp.getSalary();
                maxEmp = emp;
            }
        }
        return maxEmp;
    }

    //Расчет фонда ЗП по департаменту
    public static double calculateDepartmentSalarySum(int department) {
        double sum = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    //Расчет средней ЗП по департаменту
    public static double calculateDepartmentAverageSalary(int department) {
        int count = 0;
        double sum = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                sum += emp.getSalary();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    //Индексация ЗП по департаменту
    public static void indexDepartmentSalaries(int department, double percent) {
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                emp.setSalary(emp.getSalary() * (1 + percent / 100));
            }
        }
    }

    //Вывести сотрудников департамента
    public static void printDepartmentEmployees(int department) {
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %.2f%n",
                        emp.getId(), emp.getFullName(), emp.getSalary());
            }
        }
    }

    //Вывод сотрудника с ЗП меньше указанной
    public static void printEmployeesWithSalaryLessThan(int threshold) {
        for (Employee emp : employees) {
            if (emp.getSalary() < threshold) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %.2f%n",
                        emp.getId(), emp.getFullName(), emp.getSalary());
            }
        }
    }

    //Вывод сотрудника с ЗП больше указанной
    public static void printEmployeesWithSalaryGreaterThan(int threshold) {
        for (Employee emp : employees) {
            if (emp.getSalary() >= threshold) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %.2f%n",
                        emp.getId(), emp.getFullName(), emp.getSalary());
            }
        }
    }
    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 1, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 2, 45000);
        employees[3] = new Employee("Кузнецов Андрей Викторович", 2, 70000);
        employees[4] = new Employee("Морозова Анна Сергеевна", 3, 55000);
        employees[5] = new Employee("Николаев Дмитрий Александрович", 3, 80000);
        employees[6] = new Employee("Федорова Елена Владимировна", 4, 90000);
        employees[7] = new Employee("Андреев Сергей Николаевич", 4, 65000);
        employees[8] = new Employee("Васильева Ольга Петровна", 5, 75000);
        employees[9] = new Employee("Григорьев Михаил Игоревич", 5, 85000);

        //Вывод результата для проверки
        //Вывод фонда оплаты труда
        System.out.println("Фонд оплаты труда: " + calculateTotalSalary());
        //Поиск сотрудника с минимальным окладом
        System.out.println("Сотрудник с минимальным окладом: " + findMinSalaryEmployee());
        System.out.println("Вывод сотрудника с ЗП меньше указанной: ");
        printEmployeesWithSalaryLessThan(90000);
        System.out.println("Сотрудник с максимальным окладом: " + findMaxSalaryEmployee());
        System.out.println("Средняя ЗП по компании: " + calculateAverageSalary());
        System.out.println(calculateDepartmentAverageSalary(1));
    }

}