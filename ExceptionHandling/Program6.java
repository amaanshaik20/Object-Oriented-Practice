package ExceptionHandling;

import java.util.Scanner;

// There are inbuilt classes for each exception and each error.
// This classes are used to create an exception object.
// For Example for AtithmeticException There is a class ArithmeticException.

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // This will act as ArithmeticException e=new ArithmeticException()
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("____________________");
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception f) {
            // This will act as Exception f=new Arithmetic Exxception() that is a concept of
            // polymorphism or Loose coupling
            System.out.println(f.getMessage());
            System.out.println(f);
            f.printStackTrace();
        }
        System.out.println();
        System.out.println("____________________");
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Throwable g) {
            System.out.println(g.getMessage());
            System.out.println(g);
            g.printStackTrace();
        }

    }
}
