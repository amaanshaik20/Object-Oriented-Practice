package Multithreading;

import java.util.Scanner;

// Process means if a file is in HDD
// Program means if a file is in RAM
// Thread is defined as an independent instructions who will execute independently and is part of process.
// Multithreading is used to utilize CPU time efficiently
// in Multithreading, concurrent execution occurs.

// There are two ways to implement Multithreading 
// 1-> Extending the Thread class
// 2-> Implementing the Runnable interface

// The First Method is ----->

class Demo1 extends Thread {
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

class Demo2 extends Thread {
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

class Demo3 extends Thread {
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

public class Program1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        // d1.run();
        // d2.run();
        // d3.run();

        d1.start();
        d2.start();
        d3.start();

    }
}
