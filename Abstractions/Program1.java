package Abstractions;

abstract class Parent {
    abstract void print();

    void walk() {
        System.out.println("walking");
    }
}

class Demo extends Parent {
    @Override
    void print() {
        System.out.println("printing");
    }
}

class Main {
    void permit(Parent p) {
        p.walk();
        p.print();
    }
}

public class Program1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        Main m = new Main();
        m.permit(d);
    }
}