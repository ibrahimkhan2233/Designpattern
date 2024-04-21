interface Shape {
    double area();
    double perimeter();
}

class GeometryFactory {
    public static Shape createShape(String shapeType, double... params) {
        switch (shapeType) {
            case "triangle":
                return new Triangle(params[0], params[1]);
            case "square":
                return new Square(params[0]);
            case "circle":
                return new Circle(params[0]);
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        // Assuming it's an equilateral triangle for simplicity
        return 3 * base;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape triangle = GeometryFactory.createShape("triangle", 4, 5);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        Shape square = GeometryFactory.createShape("square", 4);
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());

        Shape circle = GeometryFactory.createShape("circle", 5);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle circumference: " + circle.perimeter());
    }
}
