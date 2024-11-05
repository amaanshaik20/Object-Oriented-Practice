package ExceptionHandling;

import java.util.*;

class Alpha {
    void alpha() {

        System.out.println("Connection Established 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numerator:");
        int Numerator = sc.nextInt();
        System.out.print("Enter Denominator:");
        int Denominator = sc.nextInt();
        int frac = Numerator / Denominator;
        System.out.println(frac);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Value: ");
        int num = sc.nextInt();

        System.out.println("Enter index: ");
        int index = sc.nextInt();
        a[index] = num;
        System.out.println("The value at index " + index + " is " + num);
        System.out.println("Connection closed 4");

    }
}

class Beta {
    void beta() {
        try {
            System.out.println("Connection Established3");
            Alpha a = new Alpha();
            a.alpha();
        } catch (ArrayIndexOutOfBoundsException ind) {
            System.out.println("Array index out bound");
        } catch (NullPointerException n) {
            System.out.println("Null pointer Exception");
        } catch (NegativeArraySizeException array) {
            System.out.println("Negative Array size not allowed");
        } catch (ArithmeticException a) {
            System.out.println("Non Zero Denominator should be there");
        } catch (InputMismatchException i) {
            System.out.println("Input mismatch");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Connection Closed 3");
    }
}

class Gamma {
    void gamma() {
        System.out.println("Connection Established2");
        Beta b = new Beta();
        b.beta();
        System.out.println("Connection Closed 2");
    }
}

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Connection Established1");
        Gamma g = new Gamma();
        g.gamma();
        System.out.println("Connection Closed 1");

    }
}
