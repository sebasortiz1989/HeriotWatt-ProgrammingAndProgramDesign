package Module8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Week8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 1));
        System.out.println(max(numbers));
        removeDuplicate(numbers);
    }

    public static Integer max(ArrayList<Integer> list) {
        // These three are the same
        // return list.stream().max(Integer::compareTo).orElse(null);
        // return list.stream().max((a, b) -> a.compareTo(b)).orElse(null);
        return list.stream().max(Comparator.naturalOrder()).orElse(null);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        var listDistictNumbers = list.stream().distinct().toList();
        System.out.println(listDistictNumbers);
    }
}