package Interfaces;
// 1-> using interfaces we can achieve standardization and pure abstraction. 

// 2-> Interfaces supports polymorphism.
// 3-> By default every method in an interface is public and abstract.

interface Calculator {
    public abstract void add();

    void sub();
    // rule3
}

class MyCalculator1 implements Calculator {
    @Override
    public void add() {
        System.out.println("adding in mycalculator1");
    }

    @Override
    public void sub() {
        System.out.println("Subtracting mycalculator1");
    }
}

class MyCalculator2 implements Calculator {
    @Override
    public void add() {
        System.out.println("adding in mycalculator2");
    }

    @Override
    public void sub() {
        System.out.println("Subtracting mycalculator2");
    }
}

class MyCalculator3 implements Calculator {
    @Override
    public void add() {
        System.out.println("adding in mycalculator3");
    }

    @Override
    public void sub() {
        System.out.println("Subtracting mycalculator3");
    }
}

class Calculate {
    // rule 2
    public static void permit(Calculator c) {
        // rule 1
        c.add();
        c.sub();
    }
}

public class Rule1 {
    public static void main(String[] args) {
        MyCalculator1 mc1 = new MyCalculator1();
        MyCalculator2 mc2 = new MyCalculator2();
        MyCalculator3 mc3 = new MyCalculator3();

        Calculate.permit(mc1);
        System.out.println();
        Calculate.permit(mc2);
        System.out.println();
        Calculate.permit(mc3);

    }
}
