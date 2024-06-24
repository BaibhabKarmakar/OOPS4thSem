// Write a program to create a new file and write "Hello World" into it. Now reverse the content word-wise and append it to the end of the another existing file.

import java.io.*;

class ReverseFileContents{
    static String reverseString(String text){
        String[] words = text.split(" ");
        int n = words.length;
        for(int i=0 ; i<n/2 ; i++){
            String temp = words[i];
            words[i] = words[n-i-1];
            words[n-i-1] = temp;
        }
        StringBuilder rev = new StringBuilder();
        for(String word : words){
            rev.append(word).append(" ");
        }
        return rev.toString().trim();
    }
}
public class Main {
    public static void main(String args[]){
        String text = "Hello World";
        String rev = " ";
        String preContent = "This file says the ";

        try(FileWriter fw1 = new FileWriter("file1.txt")){
            fw1.write(text);
            System.out.println("file1.txt created with the text : " + text);
        }
        catch(IOException e){
            e.printStackTrace();    // The printStackTrace() method of "Java.lang.Throwable" class -> print details about the exception like "class name" , "line number in the code" and in which line the exception arrives .
        }


        rev = ReverseFileContents.reverseString(text);
        File file2 = new File("file2.txt");
        boolean appendPreContent = !file2.exists() || file2.length() == 0;
        try(FileWriter fw2 = new FileWriter(file2)){
            if(appendPreContent){
                fw2.write(preContent + "\n");
                System.out.println("file2.txt initialized with pre-content : " + preContent);
            }
            fw2.write(rev + "\n");
            System.out.println("Reversed String appended to the file 'file2.txt' : " + rev);
        }
        catch (IOException e) {
            e.printStackTrace();
        }   
    }
}
