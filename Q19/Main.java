//Write two threads A and B which will run parallely using thread and runnable.

// Thread class provide constructors and methods to create and perform operations on a thread.
// Thread class extends Object class and implements Runnable interface.

// Runnable Interface : 
// The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. 
// Runnable interface have only one method named run().

class MultiThreading implements Runnable{
    Thread t;
    String threadName;

    public MultiThreading(String name){
        threadName = name;
        System.out.println("Creating Thread : " + threadName);
    }

    public void run(){
        System.out.println("Running Thread : " + threadName);
        try {
            for(int i=0 ; i<4 ; i++){
                System.out.println(threadName + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread" + threadName + "Interrupted!!!");
        }
        finally{
            System.out.println("Exiting Thread : " + threadName);
        }
        
    }

    public void start(){
        System.out.println("Starting Thread : " + threadName);
        t = new Thread(this , threadName);
        t.start();
    }
}
public class Main {
    public static void main(String args[]){
        MultiThreading t1 = new MultiThreading("A");
        t1.start();
        MultiThreading t2 = new MultiThreading("B");
        t2.start();
    }
}
