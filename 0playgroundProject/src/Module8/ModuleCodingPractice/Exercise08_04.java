package Module8.ModuleCodingPractice;

import java.util.ArrayList;

public class Exercise08_04 {
    public static void main(String[] args) {
        for (Character ch: toCharacterArray("Welcome")) {
            System.out.println(ch);
        }
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}