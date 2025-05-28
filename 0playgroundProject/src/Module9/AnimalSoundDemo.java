package Module9;

abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
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

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Output: Woof!
        myDog.eat();        // Output: This animal eats food.

        myCat.makeSound();  // Output: Meow!
        myCat.eat();        // Output: This animal eats food.
    }
}