package Multithreading;

// Single Run Multithreading methood
import java.util.Scanner;

class Alfa1 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("ADD")) {
            adding();
        } else if (name.equals("CHAR")) {
            charaters();
        } else {
            numbers();
        }
    }

    public void adding() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1");
        int a = sc.nextInt();
        System.out.println("ENTER NUMBER 2");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
        sc.close();
    }

    public void charaters() {
        for (int i = 65; i < 70; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void numbers() {
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

// Single Run multi threading.
public class Program5 {
    public static void main(String[] args) {
        Alfa1 a1 = new Alfa1();
        Alfa1 a2 = new Alfa1();
        Alfa1 a3 = new Alfa1();

        a1.setName("ADD");
        a2.setName("CHAR");
        a3.setName("NUM");

        a1.start();
        // a1.join();
        a2.start();
        // a2.join();
        a3.start();
    }
}
