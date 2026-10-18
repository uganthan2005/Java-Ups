package test1;
public class areacalculator {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(7),new Rectangle(5, 4),new Triangle(6, 8)};

        System.out.printf("Circle area: %.2f\n", shapes[0].area());
        System.out.println("Rectangle area: " + shapes[1].area());
        System.out.println("Triangle area: " + shapes[2].area());
    }
}


class Shape {
    public double area() {
        return 0.0; 
    }
}


class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14159 * radius * radius; 
    }
}


class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}


class Triangle extends Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}



