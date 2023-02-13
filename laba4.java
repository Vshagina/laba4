package com.company;

import java.util.Scanner;

public class laba4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество значений в массиве: ");
        int mas = in.nextInt();
        System.out.println("Введите значения массива: ");
        int num[] = new int[mas];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        double sred = 0;
        double sum = 0;
        for(int j = 0; j < num.length; j++) {
            sum = sum + num[j];
        }
        sred = sum / num.length;
        System.out.println("Среднее значение: " + sred);
        double sum2 = 0;
        sum2 = min + sred;
        System.out.println("Сумма минимального и среднего арифметического: " + sum2);
    }
}
