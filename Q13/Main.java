// Demonstrate Anonymous inner class
abstract class Shape{
    final double pi = 3.14159;
    double rad;
    abstract void getArea();
}

class Circle{
    Shape s;
    Circle(double r){
        System.out.println("Circle Constructor Called!!!");
        this.s = new Shape(){
            void getArea(){
                this.rad = r;
                System.out.println(pi * rad * rad);
            }
        };
    }
}
public class Main {
    public static void main(String args[]){
        Circle c = new Circle(10);
        c.s.getArea();
    }
}
