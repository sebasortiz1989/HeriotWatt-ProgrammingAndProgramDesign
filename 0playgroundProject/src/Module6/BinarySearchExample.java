package Module6;

import java.util.Arrays;

public class BinarySearchExample {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // To avoid overflow

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;  // Return the index of the target
            }

            // If target is smaller than mid, narrow search to the left
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger than mid, narrow search to the right
            else {
                low = mid + 1;
            }
        }

        return -1;  // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8, 1};  // Sorted array
        int target = 6;
        Arrays.sort(numbers);

        // Perform binary search
        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}