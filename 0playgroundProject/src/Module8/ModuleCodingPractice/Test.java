package Module8.ModuleCodingPractice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] triangleSides = new double[3];

        for (int i = 0; i < triangleSides.length; i++) {
            System.out.println("Enter " + (i + 1) + " side of the triangle");
            triangleSides[i] = scanner.nextDouble();
        }

        scanner.nextLine();

        System.out.println("Enter color of triangle");
        String color = scanner.nextLine();

        System.out.println("Enter true or false if triangle is filler");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(triangleSides[0], triangleSides[1], triangleSides[2], color, filled);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("color: " + triangle.getColor());
        System.out.println("filled: " + triangle.isFilled());

        scanner.close();
    }
}
