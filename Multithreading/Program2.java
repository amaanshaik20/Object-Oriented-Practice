package Multithreading;

import java.util.Scanner;

// Process means if a file is in HDD
// Program means if a file is in RAM
// Thread is defined as an independent instructions who will execute independently and is part of process.
// Multithreading is used to utilize CPU time efficiently

// There are two ways to implement Multithreading 
// 1-> Extending the Thread class
// 2-> Implementing the Runnable interface

// The Second Method is ----->
// The reason of crearing a second method that 
// is by implementing a runnable interface is that
//  in first method if a class also extends some other 
// class other than Thread class, Its not possible 
// because of diamond problem or multiple inheritance

class Demo1 implements Runnable {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1");
        int a = sc.nextInt();
        System.out.println("ENTER NUMBER 2");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}

class Demo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 65; i < 70; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Demo3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Program2 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();

    }
}
