package Module2;

import java.util.Scanner;

public class ScannerExample {
    public static void RunScanner() {
        Scanner sc = new Scanner(System.in);

        // Reading different types of inputs
        System.out.println("Enter a string:");
        String str = sc.nextLine(); // Reads a whole line

        System.out.println("Enter an integer:");
        int number = sc.nextInt(); // Reads an integer

        System.out.println("Enter a float:");
        float decimal = sc.nextFloat(); // Reads a float

        System.out.println("Enter a boolean (true/false):");
        boolean flag = sc.nextBoolean(); // Reads a boolean

        // Output
        System.out.println("String: " + str);
        System.out.println("Integer: " + number);
        System.out.println("Float: " + decimal);
        System.out.println("Boolean: " + flag);

        sc.close(); // Close the scanner to free resources
    }
}
