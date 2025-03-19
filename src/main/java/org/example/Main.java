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
        //System.out.println("Количество человек - " + count);//Отладочный вывод
        //System.out.println("Сумма  - " + sum);//Отладочный вывод
        double avgSalary = count > 0 ? sum / count : 0;
        //System.out.println("Средняя зарплата: " + avgSalary);
        return avgSalary;
    }

    //Индексация ЗП по департаменту с выводом
    public static void indexDepartmentSalaries(int department, double percent) {
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                System.out.println("Сотрудник: " + emp.getFullName() + " Старое значение ЗП: " + emp.getSalary());
                emp.setSalary(emp.getSalary() * (1 + percent / 100));
                System.out.println("Сотрудник: " + emp.getFullName() + " Новое значение ЗП: " + emp.getSalary());
            }
        }
    }

    //Вывести сотрудников департамента
    public static void printDepartmentEmployees(int department) {
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                System.out.println("ID:" + emp.getId() + " Департамент: " + emp.getDepartment() + " ФИО: " + emp.getFullName() + " Зарплата: " + emp.getSalary());
            }
        }
    }

    //Вывод сотрудника с ЗП меньше указанной
    public static void printEmployeesWithSalaryLessThan(int threshold, int department) {
        int count = 0;
        for (Employee emp : employees) {
            if (emp.getSalary() < threshold && emp.getDepartment() == department) {
                System.out.println("ID:" + emp.getId() + " Департамент: " + emp.getDepartment() + " ФИО: " + emp.getFullName() + " Зарплата: " + emp.getSalary());
                count++;
            }
        }
        System.out.println("Найдено сотрудников - " + count);
    }

    //Вывод сотрудника с ЗП больше указанной
    public static void printEmployeesWithSalaryGreaterThan(int threshold, int department) {
        for (Employee emp : employees) {
            if (emp.getSalary() >= threshold && emp.getDepartment() == department) {
                System.out.println("ID:" + emp.getId() + " Департамент: " + emp.getDepartment() + " ФИО: " + emp.getFullName() + " Зарплата: " + emp.getSalary()
                );
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 30000);
        employees[1] = new Employee("Петров Петр Петрович", 1, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 2, 45000);
        employees[3] = new Employee("Кузнецов Андрей Викторович", 2, 70000);
        employees[4] = new Employee("Морозова Анна Сергеевна", 3, 55000);
        employees[5] = new Employee("Николаев Дмитрий Александрович", 3, 80000);
        employees[6] = new Employee("Федорова Елена Владимировна", 4, 40000);
        employees[7] = new Employee("Андреев Сергей Николаевич", 4, 65000);
        employees[8] = new Employee("Васильева Ольга Петровна", 5, 35000);
        employees[9] = new Employee("Григорьев Михаил Игоревич", 5, 55000);

        //Вывод результата для проверки
        //Вывод фонда оплаты труда
        System.out.println("Фонд оплаты труда: " + calculateTotalSalary());
        //Поиск сотрудника с минимальным окладом
        System.out.println("Сотрудник с минимальным окладом: " + findMinSalaryEmployee());
        System.out.println("Печать сотрудника с ЗП меньше указанной: ");
        printEmployeesWithSalaryLessThan(90000, 3);
        System.out.println("Сотрудник с максимальным окладом: " + findMaxSalaryEmployee());
        System.out.println("Средняя ЗП по компании: " + calculateAverageSalary());
        System.out.println(calculateDepartmentAverageSalary(1));
        System.out.println("Печать сотрудника с департамента с ЗП больше указанной: ");
        printEmployeesWithSalaryGreaterThan(40000, 5);
        System.out.println("Печать сотрудников департамента: ");
        printDepartmentEmployees(5);
        System.out.println("Печать сотрудников департамента: ");
        printDepartmentEmployees(2);
        System.out.println("Индексация ЗП по департаменту: ");
        indexDepartmentSalaries(5, 10);
        System.out.println("Среднее значение ЗП по указанному департаменту " + calculateDepartmentAverageSalary(3));
        System.out.println("Расчет фонда ЗП по указанному департаменту " + calculateDepartmentSalarySum(3));
        System.out.println("Максимальный оклад по указанному департаменту: " + findDepartmentMaxSalary(3));
        System.out.println("Минимальный оклад по указанному департаменту: " + findDepartmentMinSalary(3));
    }
}