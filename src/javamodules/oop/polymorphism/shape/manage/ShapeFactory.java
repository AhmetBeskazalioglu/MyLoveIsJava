package javamodules.oop.polymorphism.shape.manage;

import javamodules.oop.polymorphism.shape.*;


public class ShapeFactory {

    public Shape getAShape() {
        Shape shape = null;

        int i = (int) (5 * Math.random());

        switch (i) {
            case 0:
                shape = new Shape();
                break;
            case 1:
                shape = new Circle(5);
                break;
            case 2:
                shape = new Rectangle(4, 5);
                break;
            case 3:
                shape = new Triangle(3, 4, 5);
                break;
            case 4:
                shape = new Square(4);
                break;
        }

        return shape;
    }
}
