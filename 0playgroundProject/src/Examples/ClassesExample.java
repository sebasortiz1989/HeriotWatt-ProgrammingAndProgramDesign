package Examples;

class Person {
    // Fields
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassesExample {
    public static void main(String[] args) {
        // Create an Object of the Class
        Person person = new Person("Alice", 30);
        // Access Fields and Call Methods
        person.displayInfo();
    }
}
