package ExceptionHandling;

import java.util.Scanner;

// Ducking an Exception

class Alfa2 {
    void demo() throws Exception {
        Scanner sc = null;
        System.out.println("Connection Established 2");
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter Numerator: ");
            int n = sc.nextInt();
            System.out.println("Enter Denominator");
            int d = sc.nextInt();
            int div = n / d;
            System.out.println(div);
        } finally {
            System.out.println("Connection Closed2");
            sc.close();
        }
    }
}

public class Method3 {
    public static void main(String[] args) {
        System.out.println("Connection Established 1");
        Alfa2 a = new Alfa2();
        try {
            a.demo();
        } catch (Exception e) {
            System.out.println("Exception catched");
        }
        System.out.println("Connection Closed 1");

    }
}
