package Module4;

public class PrintNameLoops {
    public static void main(String[] args) {
        String name = "Sebastian";
        printNameForLoop(name);
        printNameWhileLoop(name);
        printNameDoWhileLoop(name);
    }

    // Method to print name 5 times using a 'for loop'
    public static void printNameForLoop(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }

    // Method to print name 5 times using a 'while loop'
    public static void printNameWhileLoop(String name) {
        int cont = 0;
        while (cont < 5) {
            System.out.println(name);
            cont++;
        }
    }

    // Method to print name 5 times using a 'do-while loop'
    public static void printNameDoWhileLoop(String name) {
        int cont = 0;
        do {
            System.out.println(name);
            cont++;
        }
        while (cont < 5);
    }
}
