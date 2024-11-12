package ExceptionHandling;

import java.util.Scanner;

// There are TWo types of exceptions 

// checked exceptions
// exceptions that occur during compile time are called checked exceptions
// checked exceptions occur when some one is throwing and current method is not handling
// examples of checked Exceptions are FileNotFoundException,SocketExxception

// unchecked exceptions
// exceptions that occur during run time are called unchecked exceptions
// unchecked exceptions occur duw to faulty inputs
// examples are ArrayIndexOutOfBoundsException, NegativeArraySizeException,ArithmeticException etc

public class Program4 {
    static Scanner sc = new Scanner(System.in);

    static void NASE() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void AE() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        // NASE(); // when you enter negative array size
        // AE(); // when you enter second value as zero

    }
}
