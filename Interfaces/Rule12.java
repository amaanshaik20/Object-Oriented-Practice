package Interfaces;

interface Animal {
    void sound();

    void eat();
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("MEOWWW");
    }

    @Override
    public void eat() {
        System.out.println(" CAT EATING");

    }
}

class Dog1 implements Animal {
    @Override
    public void sound() {
        System.out.println("Bhouww");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}

class Animalss {
    void permit(Animal a) {
        a.eat();
        a.sound();
    }
}

public class Rule12 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog1 d = new Dog1();
        // Animal a=new Animal();
        // we cannot create an object of an interface
        // but we can create a reference.

        Animalss an = new Animalss();
        an.permit(c);
        an.permit(d);

    }
}
