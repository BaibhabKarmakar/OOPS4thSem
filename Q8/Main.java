// Write a java program to demonstrate the copy Constructor
class Bike{
    int price;
    String model;
    Bike(int price , String model){
        this.price = price;
        this.model = model;
    }
    Bike(Bike bike1){
        this.price = bike1.price;
        this.model = bike1.model;
    }
    void displayBike(){
        System.out.println("Price of the " + model + " is : " + price);
    }
}

public class Main {
    public static void main(String args[]){
        Bike bike1 = new Bike(250000 , "Dominar");
        Bike bike2 = new Bike(bike1);
        bike2.displayBike();
    }
}
