package Module6;

public class VariableArgs {

    public static void sumNumbers(int... numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {

        sumNumbers(2, 4, 6);    // 3 arguments
        sumNumbers(10, 20, 30, 40); // 4 arguments
    }
}