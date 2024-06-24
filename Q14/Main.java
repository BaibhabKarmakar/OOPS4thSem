// WAP to demonstrate Is-A relationship and contains multiple inheritance(Inheritance chaining)

class Animal {
    String name;
    Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor Called!!!");
    }
}

class Mammal extends Animal {
    Mammal(String name){
        super(name);            // Calling Animal constructor
        System.out.println("Mammal Constructor is called!!!");
    }
}
class Dog extends Mammal{
    Dog(String name){
        super(name);            // Calling Mammal Constructor 
        System.out.println("Dog constructor Called!!!");
    }
}
public class Main {
    public static void main(String args[]){
        Mammal m1 = new Mammal("Cow");
        System.out.println(m1 instanceof Animal);
        Dog d1 = new Dog("Puppy");
        System.out.println(d1 instanceof Mammal);
        System.out.println(d1 instanceof Animal);
    }
}
