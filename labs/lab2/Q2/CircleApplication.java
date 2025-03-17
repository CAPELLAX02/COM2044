public class CircleApplication {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        System.out.println("Circle 1 (radius = " + String.format("%.2f", circle1.getRadius()) + "):");
        System.out.println("Area: " + String.format("%.2f", circle1.calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", circle1.calculateCircumference()));
        System.out.println();

        System.out.println("Circle 2 (radius = " + String.format("%.2f", circle2.getRadius()) + "):");
        System.out.println("Area: " + String.format("%.2f", circle2.calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", circle2.calculateCircumference()));
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0.0;
        } else {
            this.radius = radius;
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}