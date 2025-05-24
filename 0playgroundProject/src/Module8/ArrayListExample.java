package Module8;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers); // Output: [10, 20, 30]

        numbers.remove(1); // Removes 20
        System.out.println("After removal: " + numbers); // Output: [10, 30]

        System.out.println("First element: " + numbers.get(0)); // Output: 10

        numbers.set(0, 100);
        for (Integer number : numbers) {
            System.out.println(number);
        }


        System.out.println("After tryset: " + numbers);
        numbers.add(2, 200);
        System.out.println("After tryset: " + numbers);

        // numbers.set(5, 200); // Throws error!
        boolean success = tryset(numbers, 5, 200);
        System.out.println("Tryset success: " + success);
        System.out.println("After tryset: " + numbers);

        numbers.clear();

        ArrayList<String> list = new ArrayList();
        String s1 = new String("Java");
        String s2 = new String("Java");
        list.add(s1);
        list.add(s2);
        System.out.println((list.get(0) == list.get(1)) + " " + (list.get(0)).equals(list.get(1)));

        ArrayList<java.util.Date> list2 = new ArrayList<java.util.Date>();
        java.util.Date d = new java.util.Date();
        list2.add(d);
        list2.add(d);
        System.out.println((list2.get(0) == list2.get(1)) + " " + (list2.get(0)).equals(list2.get(1)));
    }

    public static <T> boolean tryset(ArrayList<T> list, int index, T element) {
        if (index >= 0 && index < list.size()) {
            list.set(index, element);
            return true;
        } else if (index >= list.size()) {
            while (list.size() < index) {
                list.add(null);
            }
            list.add(element);
            return true;
        }
        return false;
    }
}