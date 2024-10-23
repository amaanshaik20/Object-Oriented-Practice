package Interfaces;

interface Amaan {
    void code();

    void eat();
}

class Waseem {
    void sleep() {
        System.out.println("sleeping");
    }
}

// a class can both extend and implement at same time
// with a condition that extends must be written first.
class Shaan extends Waseem implements Amaan {
    @Override
    public void code() {
        System.out.println("coding");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }
}

public class Rule9 {
    public static void main(String[] args) {
        Shaan s = new Shaan();
        s.code();
        s.eat();
        s.sleep();
    }
}
