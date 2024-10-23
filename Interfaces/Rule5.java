package Interfaces;
// if a class implements an interface partially.

// then it should be abstract.

interface Animals {
    void eat();

    void sleep();
}

abstract class Dog implements Animals {
    @Override
    public void eat() {
        System.out.println("EATING");
    }
}

class Puppy extends Dog {
    @Override
    public void sleep() {
        System.out.println("SLEEPING");
    }
}

public class Rule5 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        Animals a;
        a = p;
        a.eat();
        a.sleep();
    }
}
