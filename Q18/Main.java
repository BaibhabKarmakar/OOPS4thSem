// Create a Example of Null-point Exception : 

class Null{
    String name = null;
    void printSomething(){
        System.out.println("This is a object of 'Null' class");
    }
}
public class Main {
    public static void main(String args[]){
        Null obj1 = null;                               // Here The object itself is null (Nothing have in that object).
        // obj1.printSomething();                       // Throws NullPointerException 

        Null obj2 = new Null();                         // This is a object of the class "Null"(Null class is defined manually previously.)
        obj2.printSomething();                          // This is a object of 'Null' class (Printed)
        // System.out.println(obj2.name.length());      // This will throw Null pointer exception because the String itself is null.


        // Handling the Exceptions : 
        try {
            obj1.printSomething();
        }
        catch(NullPointerException e){
            System.out.println("The Object is Null");
        }
        finally{
            System.out.println("Finally Output Came!!!");
        }
    }
}
