package Module2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MarkdownTableCalculator {
    public static void main(String[] args) {
        File file = new File("src/Module2/tableFile.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        createTable(file, 3, false);
    }

    public static void createTable(File file, int columns, boolean isLastColumnCode)
    {
        try {
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
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
                    sb.append("|---".repeat(columns));
                    sb.append("|");
                    sb.append("\n");
                }

                if (cont == columns) {
                    sb.append("|");
                    sb.append(isLastColumnCode ? "`" + line + "`" : line);
                    sb.append("|");
                    sb.append("\n");
                    cont = 0;
                }
                else {
                    sb.append("|");
                    sb.append(line);
                }

                cont++;
            }

            System.out.println(sb);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
