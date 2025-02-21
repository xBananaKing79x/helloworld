package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr3 = new int[]{1, 2, 3};
        double[] arr4 = new double[]{1.57, 7.654, 9.986};
        int[] weights = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(weights));
        System.out.println("Задача 3");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int j = arr4.length - 1; j >= 0; j--) {
            System.out.print(arr4[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int k = weights.length - 1; k >= 0; k--) {
            System.out.print(weights[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 != 0) {
                arr3[i] += 1;
            }
        }
        System.out.print(Arrays.toString(arr3));
    }
}



