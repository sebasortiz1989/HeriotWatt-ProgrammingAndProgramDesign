package Module2;

import java.util.Scanner;

public class ComputedAreaWithConsoleInput {
    public static double computeArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number for the radius of a circle");
        double radius = scanner.nextDouble();
        double area = computeArea(radius);
        System.out.println("The area of the circle is: " + area);
        scanner.close();
    }
}
