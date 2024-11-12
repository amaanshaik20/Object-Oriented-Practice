package ExceptionHandling;

import java.util.Scanner;

class InvalidInputException extends Exception {

}

class Atm {
    int pin = 1234;
    int p;

    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PIN: ");
        p = sc.nextInt();

    }

    void verify() throws Exception {
        if (pin == p) {
            System.out.println("COLLECT YOUR CASH.");
        } else {
            System.out.println("INVALID PIN NUMBER.");
            InvalidInputException iee = new InvalidInputException();
            throw iee;
        }
    }
}

class Bank {
    void init() {
        Atm a = new Atm();
        try {
            a.acceptInput();
            a.verify();
        } catch (Exception e) {
            try {
                a.acceptInput();
                a.verify();
            } catch (Exception f) {
                try {
                    a.acceptInput();
                    a.verify();
                } catch (Exception g) {
                    System.out.println("CARD BLOCKED.");
                }
            }
        }
    }
}

public class Custom1 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.init();
    }
}
