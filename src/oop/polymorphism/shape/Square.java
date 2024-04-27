package oop.polymorphism.shape;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.println("Drawing a square");
    }

    public void erase() {
        System.out.println("Erasing a square");
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculateCircumference() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }
}
