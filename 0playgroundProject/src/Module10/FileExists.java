package Module10;

import java.io.File;
import java.util.Scanner;

public class FileExists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a diretory name: ");
        String directory = scanner.nextLine();
        checkAndCreateDirectory(directory);
        scanner.close();
    }

    public static void checkAndCreateDirectory(String directoryName) {
        File directory = new File(directoryName);
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Directory " + directoryName + " already exists");
        } else {
            if (directory.mkdir()) {
                System.out.println("Directory " + directoryName + " created");
            }
        }
    }
}