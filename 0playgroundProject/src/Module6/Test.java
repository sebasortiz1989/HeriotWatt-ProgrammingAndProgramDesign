package Module6;

public class Test {
    public static void main(String[] args) {
        double[] x = new double[]{1, 2, 3};
        System.out.println("Value is " + x[1]);
    }

    public static void xMethod(double[] a) {
        System.out.println(a.length);
    }

    public static void reverse(int[] list) {

        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) newList[i] = list[list.length - 1 - i];
        list = newList;
    }
}
