package Module8.ModuleCodingPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise08_03 {
    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are ");
        for (Integer integer : list) System.out.print(integer + " ");
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer integer : list)
            if (!temp.contains(integer))
                temp.add(integer);

        list.clear();
        list.addAll(temp);
    }
}
