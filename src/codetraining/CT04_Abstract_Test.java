package codetraining;

abstract class Shape {
    public abstract void ciz();
}

class Circle extends Shape{

    @Override
    public void ciz() {
        System.out.println("Circle is drawing...");
    }
}

class Triangle extends Shape{

    @Override
    public void ciz() {
        System.out.println("Triangle is drawing...");
    }
}

class Rectangle extends Shape{

    @Override
    public void ciz() {
        System.out.println("Rectangle is drawing...");
    }
}

public class CT04_Abstract_Test {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        Shape triangle=new Triangle();

        circle.ciz();
        rectangle.ciz();
        triangle.ciz();
    }
}