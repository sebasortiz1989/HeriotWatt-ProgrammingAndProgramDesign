package Module6;

import java.util.*;

/*
Write a program in Java that reads the integers between 1 and 50 and counts the occurrences of each.
Assume the input ends with 0.

A sample of the program can be found below:

Enter the integers between 1 and 50: 2 5 6 4 23 43 2 0
2 occures 2 times
3 occures 1 times
4 occures 1 times
5 occures 2 times
6 occures 1 times
23 occures 1 times
43 occures 1 times

Note: If a number occurs more than one time, the plural word “times” is used on the output.
*/

public class weekSix {
    public static void main(String[] args) {
        numberCounter();
    }

    private static void numberCounter() {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = -1;

        System.out.println("Enter integers between 1 and 50: ");
        Map<Integer, Integer> numberOfTimesCounter = new HashMap<>();

        while (currentNumber != 0) {
            currentNumber = scanner.nextInt();
            if (currentNumber > 0 && currentNumber <= 50) {
                if (!numberOfTimesCounter.containsKey(currentNumber)) {
                    numberOfTimesCounter.put(currentNumber, 1);
                }
                else {
                    numberOfTimesCounter.compute(currentNumber, (_, num) -> num != null ? num + 1 : 1);
                }
            }
        }

        for (Integer key : numberOfTimesCounter.keySet()) {
            Integer value = numberOfTimesCounter.get(key);
            System.out.println(key + " occurs " + value + (value > 1 ? " times" : " time"));
        }

        scanner.close();
    }
}
