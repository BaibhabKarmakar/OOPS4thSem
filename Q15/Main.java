// Upcasting Downcasting and Typecasting
//We can perform Upcasting implicitly or explicitly, but downcasting cannot be implicitly possible.

class A{                // Parent class

}
class B extends A {     // child class

}
class C extends B {     // child class

}

public class Main{
    public static void main(String args[]){
        // upcasting(child class object is typecasted to a parent class object)
        A a1 = new B();
        A a2 = new C();
        B b1 = new C();

        // Downcasting : 
        // Safe downcasting with "instanceof" check : 

        if(a1 instanceof B){
            B b2 = (B) a1;
            System.out.println("a1 is safely downcasted to B through the object" + b2);
        }

        if(a2 instanceof C){
            C c1 = (C) a2;
            System.out.println("a2 is safely downcasted to C through the object " + c1);
        }

        if(b1 instanceof C){
            C c2 = (C) b1;
            System.out.println("b1 is safely downcasted to C through the object " + c2);
        }       
    }
}