package Module6;

import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner scaner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Write a number for position " + i);
            numbers[i] = scaner.nextDouble();
        }

        System.out.println("Minimum number: " + min(numbers));
        scaner.close();
    }

    public static double min(double[] array) {
        double minNumber = array[0];
        for (double number : array) {
            if (!Double.isNaN(number)) {
                if (number < minNumber || Double.isNaN(minNumber)) {
                    minNumber = number;
                }
            }
        }

        return minNumber;
    }
}