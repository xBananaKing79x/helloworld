package org.example;

public class Main {
    public static void printSeparator() {
        System.out.println("++++++++++++++++");
    }

    public static void main(String[] args) {
        System.out.println("Упражнение урока:");
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            System.out.println(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
    }
}