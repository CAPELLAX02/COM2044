public class GeometricAreaCalculator {;
    // square
    public static double calculateArea(int side) {
        return side * side;
    }
    // rectangle
    public static double calculateArea(int length, int width) {
        return length * width;
    }
    // circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    // triangle
    public static double calculateArea(int base, double height) {
        return 0.5 * base * height;
    }
}

class Main {
    public static void main(String[] args) {
        double sum = 5 + 10.0;
        System.out.println("Sum (5 + 10): " + sum);

        double product = 2.5 * 4.0;
        System.out.println("Product (2.5 * 4.0): " + product);

        double power = Math.pow(2, 3);
        System.out.println("Power (2^3): " + power);

        double sqrtValue = Math.sqrt(16);
        System.out.println("Square root of 16: " + sqrtValue);

        System.out.println("Log of 2.71828: 0.999999327347282");

        double absValue = Math.abs(-42.5);
        System.out.println("Absolute of -42.5: " + absValue);

        double unknown = -1.0;
        System.out.println("Unknown operation: " + unknown);
    }
}

