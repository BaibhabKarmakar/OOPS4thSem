// Write a java Program to calculate the sum of numbers from 1 to 50 that are divisible by 3 , using inter-thread connection


class DivisibleSum extends Thread {
    private boolean isDivisible, flag = true;
    private int range, divisor;
    public long sum;

    public DivisibleSum(int range, int divisor) {
        this.range = range;
        this.divisor = divisor;
    }

    public synchronized void chkDivisibility(int num) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isDivisible = (num % divisor == 0);
        flag = false;
        notify();
    }

    public synchronized void doSummation(int num) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (isDivisible)
            sum += num;
        flag = true;
        notify();
    }

    @Override
    public void run() {
        Thread t1 = new Thread("Divisibility Checker") {
            @Override
            public void run() {
                for (int i = 1; i <= range; i++) {
                    chkDivisibility(i);
                }
            }
        };

        Thread t2 = new Thread("If-divisible Adder") {
            @Override
            public void run() {
                for (int i = 1; i <= range; i++) {
                    doSummation(i);
                }
                System.out.println("Required sum : " + sum);
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DivisibleSum obj = new DivisibleSum(50, 3);
        obj.start();
    }
}