// Write down the factorial function and pass argument from main() function
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
        int a = Integer.parseInt(args[0]);   // It is a command-line argument , We have to give the input with the execution line in terminal i.e. (for ex : "java main 7")
        Factorial fact = new Factorial();
        int result = fact.fact(a);
        System.out.println("The factorial of " + a + " is : " + result);
    }
}
