// Write an example of User-defined Exception :

// Description of the User Defined Exception : 

class UserAgeException extends Exception {
    public UserAgeException(String s){
        super(s);
    }
}

public class Main{
    static void checkAge(int age) throws UserAgeException {
        if(age <= 18){
            throw new UserAgeException("Below age Bro !!!");
        }
        else {
            System.out.println("Valid Age");
        }
    }
    public static void main(String args[]){
        int age = 17;
        try {
            Main.checkAge(age);
        }
        catch(UserAgeException e ){
            e.printStackTrace();
        }
    }
}