// Take argument from user and make factorial from that number.
import java.util.*;
class Factorial {
    int fact(int a){
        int result = 1;
        for(int i = 1 ; i <= a ; i++){
            result *= i;
        }
        return result;
    }
}
public class Main {
    public static void main(String args[]){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Factorial fact = new Factorial();
        int result = fact.fact(a);
        System.out.println("The factorial of " + a + " is : " + result);
        sc.close();
    }
}
