// Write a java Program to implement Calculator using  Case : 

import java.util.*;

class Calculator {
    public void function(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operand A : ");
        double a = sc.nextDouble();
        System.out.println("Enter the operand B : ");
        double b = sc.nextDouble();
        System.out.println("Enter the operator : (1. '+' , 2. '-' , 3. '*' , 4.'/') :");

        int option = sc.nextInt();
        switch(option){
            case 1 : {
                System.out.println(a + b);
                break;
            }
            case 2 : {
                System.out.println(a - b);
                break;
            }
            case 3 : {
                System.out.println(a * b);
                break;
            }
            case 4 : {
                if(b != 0){
                    System.out.println(a / b);
                }
                break;
            }
            default : {
                System.out.println("Invalid Operator");
            }
        }
        sc.close();
    }
}
public class Main {
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        c1.function();
    }
}
