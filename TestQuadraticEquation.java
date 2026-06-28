import java.util.Scanner;

class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
        return 0;
    }
}

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Root 1 = " + quadraticEquation.getRoot1());
            System.out.println("Root 2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Root = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
        scanner.close();
    }
}