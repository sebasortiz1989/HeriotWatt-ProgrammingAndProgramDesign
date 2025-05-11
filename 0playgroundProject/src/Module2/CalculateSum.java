package Module2;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 3 numbers:");

        System.out.println("First number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Third number: ");
        double num3 = scanner.nextDouble();

        double result = calculateAverage(num1, num2, num3);
        System.out.println("The average is: " + result);
        scanner.close();
    }

    public static double calculateAverage(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }
}
