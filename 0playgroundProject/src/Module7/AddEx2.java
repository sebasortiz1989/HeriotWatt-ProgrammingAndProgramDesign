package Module7;

/*
Design a class named Fan to represent a fan. The class contains:

■Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.

■A private int data field named speed that specifies the speed of the fan (the default is SLOW).

■A private boolean data field named on that specifies whether the fan is on (the default is false).

■A private double data field named radius that specifies the radius of the fan (the default is 5).

■A string data field named colour that specifies the colour of the fan (the default is blue).

■The accessor and mutator methods for all four data fields.

■A no-arg constructor that creates a default fan.

■A method named toString() that returns a string description for the fan. If the fan is on,
the method returns the fan speed, colour, and radius in one combined string. If the fan is not on,
the method returns the fan colour and radius along with the string “fan is off” in one combined string.

Write a test program that creates two Fan objects.

Assign maximum speed, radius 10, colour yellow, and turn it on to the first object.

Assign medium speed, radius 5, colour blue, and turn it off to the second object.

Display the objects by invoking their toString() method.
*/

public class AddEx2 {
    public static void main(String[] args) {
        Fan1 fan1 = new Fan1();
        fan1.setSpeed(Fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan1 fan2 = new Fan1();
        fan2.setSpeed(Fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}

class Fan1 {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";

    public Fan1() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean trueOrFalse) {
        this.on = trueOrFalse;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "speed " + speed + "\n"
                + "color " + color + "\n"
                + "radius " + radius + "\n"
                + ((on) ? "fan is on" : " fan is off");
    }
}