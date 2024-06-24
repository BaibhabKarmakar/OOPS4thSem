// Write down the counter program without creating object , call a method variable , static method , static block problem .

// When the class loads to the memory the static block firstly will execute and then the other code will run.
class Baibhab{
    static int i = 3;
    Baibhab(){
        i++;
        System.out.println(i);
    }
    static void square(){
        System.out.println(i*i);
    }
    static {
        System.out.println("Static block called");
    }
}
public class Main {
    public static void main(String args[]){
        Baibhab.square();
        Baibhab obj1 = new Baibhab();
        Baibhab.square();
        Baibhab obj2 = new Baibhab();
        Baibhab.square();
    }
}
