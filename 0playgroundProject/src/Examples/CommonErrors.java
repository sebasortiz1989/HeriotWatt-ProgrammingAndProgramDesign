package Examples;

import java.util.Scanner;

public class CommonErrors {
    public static void main(String[] args) {
    }

    public static void IntegerOverflow() {
        int value = 2147483647;
        System.out.println("initial value =" + value);

        value++;
        System.out.println("value after adding 1 =" + value);
    }

    public static void RoundingErrors() {
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);
    }

    public static void IntegerDivisionError() {
        int number1 = 1;
        int number2 = 2;

        // In this example, when dividing by an integer, 3/2 is rounded down to 1.
        double average1 = (number1 + number2) /2;
        System.out.println("average dividing by an integer =" + average1);

        double average2 = (number1 + number2) / 2.0;
        System.out.println("average dividing by a double =" + average2);
    }

    public static void RedundantInputObject() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int v1 = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double v2 = input1.nextDouble();
    }
}
