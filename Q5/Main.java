// Write a java program to implement a class "Bird" that extends another abstract class "Animal"(Using interface concept)
interface Flyable {
    void fly();          // Interface is pure abstraction 
}
abstract class Animal {
    String name;
    String color;
    Animal(String name , String color){
        this.name = name;
        this.color = color;
    } 
    abstract void makeSound();
    abstract void printColor();
}
class Bird extends Animal implements Flyable{
    Bird(String name , String color){
        super(name , color);       // Calling the parent constructor 
    }
    @Override
    void makeSound(){
        System.out.println(name + " Chirps!!!");
    }
    @Override
    public void fly(){                     // you have to give the word "public" otherwise in can't override the function (because of interface)
        System.out.println(name + " flying!!!");
    }

    void printColor(){
        System.out.println(name + " is " + color);
    }
    
}
public class Main {
    public static void main(String args[]){
        Bird b = new Bird("Parrot" , "Green");
        b.makeSound();
        b.fly();
        b.printColor();
    }
}
