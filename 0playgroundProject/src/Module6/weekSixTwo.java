package Module6;

/*
Write the following method that returns true if the list is already sorted in non-decreasing order:

public static boolean isSorted(int[] list)

Write a tester program that prompts the user to enter a list and displays
whether the list is sorted or not. A sample run can be found below:

Enter list: 3 3 5 5 2 2 6 7
The list is not sorted

Enter List: 10 9 8 7 6 5 4
The list is sorted
 */

public class weekSixTwo {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Enter values for list1
        System.out.print("Enter the list size of the list: ");
        int size = input.nextInt();
        System.out.print("Enter the contents of the list: ");
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        System.out.print("The list has " + size + " integers ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        if (isSorted(list))
            System.out.println("\nThe list is already sorted");
        else
            System.out.println("\nThe list is not sorted");
    }

    private static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
