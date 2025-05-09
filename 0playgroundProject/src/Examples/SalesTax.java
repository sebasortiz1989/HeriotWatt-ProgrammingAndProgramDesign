package Examples;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        System.out.println("Hello world!, my first Java Message!");

        var input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales Tax is $" + (int)(tax * 100) / 100.0);
    }
}
