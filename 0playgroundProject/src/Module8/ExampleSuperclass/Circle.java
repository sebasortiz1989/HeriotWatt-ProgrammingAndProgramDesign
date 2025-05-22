package Module8.ExampleSuperclass;

public class Circle extends GeometricObject {
    private double radius;

    /** Default constructor */
    public Circle() {
    }

    /** Constructor with specified radius */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Constructor with specified radius, color, and filled status */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Calls superclass constructor
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nHelloWorld!!!!!!";
    }
}