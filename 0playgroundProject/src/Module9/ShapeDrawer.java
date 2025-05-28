package Module9;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class ShapeDrawer {
    public static void main(String[] args) {
        Drawable[] shapes = { new Circle(), new Rectangle(), new Triangle() };

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}