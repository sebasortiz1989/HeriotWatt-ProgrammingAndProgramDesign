package Module2;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        final double VAT = 0.12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the price of the item in the store:");
        double price = scanner.nextDouble();
        System.out.println("The sales tax is: " + (VAT * price));
        scanner.close();
    }
}
