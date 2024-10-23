package Interfaces;
// specialied methods cannot be directly accessed using interface

// but with downcasting

interface Calculator4 {
    void add();

    void sub();
}

class MyCalculator4 implements Calculator4 {
    @Override
    public void add() {
        System.out.println("ADDING");

    }

    @Override
    public void sub() {
        System.out.println("SUBTRACTING");

    }

    public void mul() {
        System.out.println("Multiplying");
    }
}

public class Rule4 {
    public static void main(String[] args) {
        Calculator4 c;
        c = new MyCalculator4();
        // c.mul
        // rule4
        ((MyCalculator4) (c)).mul();
        c.add();

    }

}
