package Module8;

public class Test {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    int i = 7;

    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
    }

    @Override
    public void setI(int i) {
        this.i = 3 * i;
    }
}