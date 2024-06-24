// Write a java code to make a calculator using inheritance (along with String operations)

import java.util.Scanner;
abstract class Calculator{
    abstract public int add(int a , int b);
    abstract public String add(String a , String b);
    abstract public int sub(int a , int b);
    abstract public String sub(String a , String b);
    abstract public int mul(int a , int b);
    abstract public double div(double a , double b);
    abstract public float mul(float a , float b);
}
class Solution extends Calculator{
    public int add(int a , int b){
        return a+b;
    }
    public String add(String a , String b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public String sub(String a , String b){
        StringBuilder res = new StringBuilder();
        for(int i=0 ; i < a.length() ; i++){
            char c = a.charAt(i);
            if(b.indexOf(c) == -1){
                res.append(c);
            }
        }
        return res.toString();
    }
    public int mul(int a , int b){
        return a*b;
    }
    public float mul(float a , float b){
        return a*b;
    }
    public double div(double a , double b){
        return a/b;
    }
}
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to operate with numbers or Strings?(1 for number | 2 for Strings) : ");
        int option = sc.nextInt();
        Solution s = new Solution();
        switch(option){
            case 1 :{
                System.out.println("Enter the numbers : ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Addition : " + s.add(x , y));
                System.out.println("Subtraction : " + s.sub(x , y));
                System.out.println("Multiplication : " + s.mul(x , y));
                System.out.println("Division : " + s.div(x , y));
                break;
            } 
            case 2 : {
                System.out.println("Enter two Strings : ");
                String p = sc.next();
                String q = sc.next();
                System.out.println(s.add(p , q));
                System.out.println(s.sub(p , q));
                break;
            }
            default : {
                System.out.println("You have Entered a invalid option !!!");
                break;
            }

        }
        
    }
}
