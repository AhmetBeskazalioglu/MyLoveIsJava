package javamodules.oop.polymorphism.shape.manage;

import javamodules.oop.polymorphism.shape.Shape;

public class Shapemain {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        /*Shape triangle = new Triangle(3, 4, 5);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(5);

        canvas.draw(triangle);
        canvas.erase(triangle);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Circumference: " + triangle.calculateCircumference());
        System.out.println();

        canvas.draw(rectangle);
        canvas.erase(rectangle);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Circumference: " + rectangle.calculateCircumference());
        System.out.println();

        canvas.draw(square);
        canvas.erase(square);
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Circumference: " + square.calculateCircumference());
        System.out.println();*/

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getAShape();
        canvas.draw(shape);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculateCircumference());
    }
}
