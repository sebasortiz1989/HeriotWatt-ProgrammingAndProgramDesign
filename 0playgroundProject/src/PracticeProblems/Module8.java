package PracticeProblems;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Module8 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Output: Woof!
        myCat.makeSound();  // Output: Meow!
    }
}