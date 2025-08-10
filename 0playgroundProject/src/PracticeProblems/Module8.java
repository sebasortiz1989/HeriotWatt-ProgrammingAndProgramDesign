package PracticeProblems;

class Animal {
    void makeSound() {
        System.out.println("The animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Module8 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Output: Woof!
        myCat.makeSound();  // Output: Meow!

        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        Animal obj = new Dog();
        obj.makeSound();
    }
}