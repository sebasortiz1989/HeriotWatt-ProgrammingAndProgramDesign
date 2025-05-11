package Module2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MarkdownTableCalculator {
    public static void main(String[] args) {
        File file = new File("src/Module2/tableFile.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        createTable(file, 3, true);
    }

    public static void createTable(File file, int columns, boolean isLastColumnCode)
    {
        try {
            Scanner scanner = new Scanner(file);
            int cont = 1;
            int wordNumber = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isBlank()) {
                    continue;
                }
                else {
                    wordNumber++;
                }

                if (wordNumber == columns + 1)
                {
                    System.out.print("|---".repeat(columns));
                    System.out.print("|");
                    System.out.print("\n");
                }

                if (cont == columns) {
                    System.out.print("|");
                    System.out.print(isLastColumnCode ? "`" + line + "`" : line);
                    System.out.print("|");
                    System.out.print("\n");
                    cont = 0;
                }
                else {
                    System.out.print("|");
                    System.out.print(line);
                }

                cont++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
