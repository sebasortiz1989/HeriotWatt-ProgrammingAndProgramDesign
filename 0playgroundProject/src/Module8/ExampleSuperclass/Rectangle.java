package Module8.ExampleSuperclass;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    /** Default constructor */
    public Rectangle() {
    }

    /** Constructor with width and height */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Constructor with width, height, color, and filled status */
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled); // Calls the superclass constructor
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area of the rectangle */
    public double getArea() {
        return width * height;
    }

    /** Return perimeter of the rectangle */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /** Override toString() method */
    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height + "\nHelloWorld!!!!!!";
    }
}