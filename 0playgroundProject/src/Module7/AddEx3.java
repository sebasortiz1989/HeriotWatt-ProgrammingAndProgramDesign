package Module7;

/*
Design a class named LinearEquation for a 2 * 2 system of linear equations:
ax + by = e
cx + dy = f

The class contains:

■Private data fields a, b, c, d, e, and f.

■A constructor with the arguments for a, b, c, d, e, and f.

■Six getter methods for a, b, c, d, e, and f.

■A method named isSolvable() that returns true if ad - bc is not 0.

■Methods getX() and getY() that return the solution for the equation.


Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result.

If ad - bc is 0, report that “The equation has no solution.” For some sample runs see below:
 */
import java.util.Scanner;

public class AddEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x is " +
                    equation.getX() + " and y is " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double newA, double newB, double newC,
                          double newD, double newE, double newF) {
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getD() {
        return d;
    }

    double getE() {
        return e;
    }

    double getF() {
        return f;
    }

    boolean isSolvable() {
        return a * d - b * c != 0;
    }

    double getX() {
        double x = (e * d - b * f) / (a * d - b * c);
        return x;
    }

    double getY() {
        double y = (a * f - e * c) / (a * d - b * c);
        return y;
    }
}