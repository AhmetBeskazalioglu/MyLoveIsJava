package oop.polymorphism.shape;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void erase() {
        System.out.println("Erasing a rectangle");
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculateCircumference() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
