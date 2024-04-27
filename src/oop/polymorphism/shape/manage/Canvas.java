package oop.polymorphism.shape.manage;

import oop.polymorphism.shape.*;

public class Canvas {

    public void draw(Shape shape) {
        shape.draw();
        if (shape instanceof Circle c) {
            System.out.println("Radius: " + c.getRadius());
        } else if (shape instanceof Rectangle r) {
            System.out.println("Width: " + r.getWidth());
            System.out.println("Height: " + r.getHeight());
        } else if (shape instanceof Square s) {
            System.out.println("Side: " + s.getSide());
        } else if (shape instanceof Triangle t) {
            System.out.println("Base: " + t.getSide1());
            System.out.println("Height: " + t.getSide2());
            System.out.println("Hypotenuse: " + t.getSide3());
        }
    }


    public void erase(Shape shape) {
        shape.erase();
    }
}
