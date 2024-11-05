package ExceptionHandling;

// Handling an exception using try catch blocks
import java.util.Scanner;

class Alfa {
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
            sc.close();
            System.out.println("Dividing by 0 Exception");
        }
        System.out.println("Connection Closed2");
    }
}

public class Method1 {
    public static void main(String[] args) {
        System.out.println("Connection Established1");
        Alfa a = new Alfa();
        a.demo();
        System.out.println("Connection Closed1");
    }
}
