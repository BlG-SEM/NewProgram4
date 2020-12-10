package ru.vsu.cs;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t = readT();
        double sumSequence = summationOfElements(t);
        printSum(sumSequence);
    }

    private static int readT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter T = ");
        return scanner.nextInt();
    }

    private static double summationOfElements(int t) {
        double elementTwiceBefore = 0;
        double elementBefore = 5.0 / 8;
        double sum = elementTwiceBefore + elementBefore;
        for (int i = 3; i <= t; i++) {
            double element = elementBefore /2 + 3.0 * elementTwiceBefore / 4;
            sum = sum + element;
            elementTwiceBefore = elementBefore;
            elementBefore = element;
        }
        return sum;
    }

    private static void printSum(double sum) {
        Locale.setDefault(Locale.ROOT);
        System.out.printf("The sum of the elements of the sequence is %1$.3f", sum);
    }
}
