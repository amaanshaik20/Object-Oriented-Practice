package ExceptionHandling;

import java.util.Scanner;

// Rethrowing an exception
class Alfa1 {
    void demo() {
        System.out.println("Connection Established2");
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter Numerator: ");
            int n = sc.nextInt();
            System.out.println("Enter Denominator: ");
            int d = sc.nextInt();
            int div = n / d;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Handled in Demo");
            throw e;
        } finally {
            System.out.println("Connection closed2");
            sc.close();
        }
    }
}

public class Method2 {
    public static void main(String[] args) {
        System.out.println("Connection Established1");
        Alfa1 a = new Alfa1();
        try {
            a.demo();
        } catch (Exception e) {
            System.out.println("Handled in Main");
        }
        System.out.println("Connection Closed1");
    }
}
