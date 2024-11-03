package ExceptionHandling;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Numerator:");
            int n = sc.nextInt();
            System.out.print("Enter Denominator:");
            int d = sc.nextInt();
            int frac = n / d;
            System.out.println(frac);

        } catch (ArithmeticException a) {
            System.out.println("Exception Occured");
        } catch (Exception e) {
            System.out.println("Error...");
        }
        System.out.println("Connection CLosed");
    }
}
