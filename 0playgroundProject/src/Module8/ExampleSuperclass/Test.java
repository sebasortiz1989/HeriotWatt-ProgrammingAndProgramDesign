package Module8.ExampleSuperclass;

public class Test {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(4, "blue", true);
        System.out.println("A circle: " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(3, 5, "red", false);
        System.out.println("\nA rectangle: " + rectangle.toString());
        System.out.println("The color is " + rectangle.getColor());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}