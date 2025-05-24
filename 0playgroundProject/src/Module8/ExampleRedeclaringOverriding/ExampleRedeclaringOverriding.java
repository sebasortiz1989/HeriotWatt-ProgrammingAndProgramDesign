package Module8.ExampleRedeclaringOverriding;

public class ExampleRedeclaringOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent polyC = new Child();

        // Calling static methods
        Parent.staticMethod();  // Prints: Parent's static method
        Child.staticMethod();   // Prints: Child's static method

        // The type of the reference determines which static method is called
        p.staticMethod();       // Prints: Parent's static method
        c.staticMethod();       // Prints: Child's static method
        polyC.staticMethod();   // Prints: Parent's static method

        // Calling instance methods
        p.instanceMethod();     // Prints: Parent's instance method
        c.instanceMethod();     // Prints: Child's instance method
        polyC.instanceMethod(); // Prints: Child's instance method
    }
}

class Parent {
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }

    public void instanceMethod() {
        System.out.println("Parent's instance method");
    }
}

class Child extends Parent {
    // This is not overriding, it's hiding or redeclaring the static method
    public static void staticMethod() {
        System.out.println("Child's static method");
    }

    // This is overriding the instance method
    @Override
    public void instanceMethod() {
        System.out.println("Child's instance method");
    }
}