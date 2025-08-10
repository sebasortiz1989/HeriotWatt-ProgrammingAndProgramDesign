package PracticeProblems;

// java CommandLineExample.java arg1 arg2 arg3 "a longer argument"
public class CommandLineExample {
    public static void main(String[] args) {
        // Get the number of command-line arguments
        int argumentCount = args.length;

        System.out.println("Number of command-line arguments: " + argumentCount);

        // Print the arguments (optional)
        if (argumentCount > 0) {
            System.out.println("Arguments are:");
            for (int i = 0; i < argumentCount; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were passed.");
        }
    }
}
