package Module7;

class TempClass {
    int i;
    public TempClass(){
    }

    public TempClass(int j) {
        int i = j;
    }
}

public class Test {
    public static void main(String[] args) {
        TempClass temp = new TempClass(2);
    }
}