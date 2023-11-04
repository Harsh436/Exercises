class Shape {
    // Common properties for all shapes

    public double calculateArea() {
        return 0.0; // Default implementation for unknown shape
    }

    public double perimeter() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

public class shapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle perimeter is: " + circle.perimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is: " + rectangle.perimeter());
    }
}
