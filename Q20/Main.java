// Write a java Program to concatenate two strings and find out the indices of the capital letters .

import java.util.*;
class StrConcat{
    public static String concatString(String s1 , String s2){
        String res = s1.concat(s2);
        return res;
    }
    public static void findIndexOfCapital(String res){
        System.out.println("Capital letters found at position(s) : ");
        for(int i=0 ; i<res.length() ; i++){
            if(Character.isUpperCase(res.charAt(i))){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String res = StrConcat.concatString(s1, s2);
        System.out.println("Concatenated String is : " + res);
        StrConcat.findIndexOfCapital(res);
        sc.close();
    }
}
