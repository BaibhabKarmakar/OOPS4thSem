// WAP in which outer class is "Shape"  , inner class is "Circle"(Nested Class Concept) and demonstrate final variable , method and class.


class Shape{
    Shape(){
        System.out.println("Shape(Outer Class) class constructor is called!!!");
    }
    class Circle{
        Circle(){
            System.out.println("Circle(Inner Class) class constructor is called!!!");
        }
        final double pi = 3.14;          // Final Variable
        int radius ;
        final double getArea(){             // Final Function(method)
            return pi * radius * radius;
        }
    }
}

final class BigCircle extends Shape.Circle {
    public BigCircle(Shape shape){
        shape.super();
    }
    // @Override
    // double getArea(){                           // Final Method cannot Override
    //     return pi * radius * radius;
    // }
}
// class BiggerCircle extends BigCircle{               // Final class cannot be a baseclass of another class.

// }
public class Main {
    public static void main(String args[]){
        Shape s1 = new Shape();
        Shape.Circle c1 = s1.new Circle();
        c1.radius = 10;
        System.out.println(c1.getArea());
    }
}
