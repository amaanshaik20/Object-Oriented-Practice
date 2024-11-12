package ExceptionHandling;

import java.util.Scanner;

class NotEligibleToVoteException extends Exception {

}

class AgeReview {
    int age;

    void takeAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER UR AGE: ");
        age = sc.nextInt();
        sc.close();
    }

    void verifyAge() throws Exception {
        if (age >= 18) {
            System.out.println("ELIGIBLE TO VOTE!");
        } else {
            // NotEligibleToVoteException n = new NotEligibleToVoteException();
            // throw n;
            throw new NotEligibleToVoteException();
        }
    }
}

public class Custom2 {
    public static void main(String[] args) {
        AgeReview a = new AgeReview();
        try {
            a.takeAge();
            a.verifyAge();
        } catch (Exception e) {
            System.out.println("Not Eligible to vote....");
        }
    }
}
