package shape_project;

import shape_project.shapes.Circle;
import shape_project.shapes.Rectangle;
import shape_project.shapes.Shape;
import shape_project.shapes.Square;

public class TestClass {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false); // Upcast shape_project.shapes.Circle to shape_project.shapes.Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); // Ошибка 1: Нет доступа к методам Circle, s1 воспринимается, как Shape

        Circle c1 = (Circle)s1; // Downcast back to shape_project.shapes.Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s2 = new Shape(); // Ошибка 2: Нельзя создать объект абстрактного класса.

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength()); // Ошибка 3: Нет доступа к методам Rectangle, s3 воспринимается, как Shape

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide()); // Ошибка 4: Нет доступа к методам Square, s4 воспринимается, как Shape

// Take note that we downcast shape_project.shapes.Shape s4 to shape_project.shapes.Rectangle,
// which is a superclass of shape_project.shapes.Square, instead of shape_project.shapes.Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide()); // Ошибка 5: Нет доступа к методам Square, r2 воспринимается, как Rectangle
        System.out.println(r2.getLength());

// Downcast shape_project.shapes.Rectangle r2 to shape_project.shapes.Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
