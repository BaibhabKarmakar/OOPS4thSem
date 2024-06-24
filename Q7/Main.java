// Write a program about default Constructor and parameterised Constructor and method over-loading.
class Bike {
    int i=10;
    String name = "BK";
    double mileage ;

    Bike(){
        System.out.println("This is the default constructor");
    }
    Bike(int i , String name){
        this.i = i;
        this.name = name;
        System.out.println("This is a parameterised constructor!!!");
    }
    Bike(double mileage , String name){
        this.mileage = mileage;
        this.name = name;
        System.out.println("This is also a parameterised constructor");
    }
    void display(){
        System.out.println("The no is : " + i + " , name is : " + name);
    }
    void displayMileage(){
        System.out.println("The mileage of the " + name + " is : " + mileage);
    }
}
public class Main {
   public static void main(String args[]){
    Bike bike1 = new Bike();
    bike1.display();
    Bike bike2 = new Bike(10 , "HondaShineSp125");
    bike2.display();
    Bike bike3 = new Bike(60.00 , "HondaShineSp125");
    bike3.displayMileage();
   } 
}
