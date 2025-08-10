package PracticeProblems;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class TestExam {
    public static void main(String[] args) {
        int[] array = {1,45,5,34,23,5,82,12,35,21,8,9};
        for (int i : array) {
            System.out.print(i % 6);
        }
    }
}