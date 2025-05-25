package Module8.ModuleCodingPractice;

import java.util.Date;

public class GeometricObject {
    // Private attributes
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Default constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    // Parameterized constructor
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    // toString method
    @Override
    public String toString() {
        return "GeometricObject[color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
    }
}