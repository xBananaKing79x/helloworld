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
    //Базовые методы
    //Печать количества сотрудников
    public static void printAllEmployees(){
        for (Employee emp: employees){
            if (emp !=null) System.out.println(emp);
        }
    }
    //Печать фонда оплаты труда
    public static double calculateTotalSalary(){
        double total = 0;
        for (Employee emp: employees) {
            if (emp!=null) total +=emp.getSalary();
        }
        return total;
    }
    public static Employee findMinSalaryEmployee(){
        Employee minEmp = null;
        double min = Double.MAX_VALUE;
        for (Employee emp: employees) {
            if (emp!=null && emp.getSalary()<min) {
                min = emp.getSalary();
                minEmp=emp;
            }
        }
        return minEmp;
    }
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
    public static void printFullNames() {
        for (Employee emp : employees) {
            if (emp != null) System.out.println(emp.getFullName());
        }
    }
    //Методы повышенной сложности

}