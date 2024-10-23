package Abstractions;

abstract class Bird {
    abstract void eat();

    abstract void fly();
}

abstract class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is Flying...");
    }
}

class SerpentEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Serpent Eagle is eating");
    }
}

class GoldenEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Golden eagle eats..");
    }
}

class Birds {
    void permit(Bird b) {
        b.eat();
        b.fly();
    }
}

public class Program2 {
    public static void main(String[] args) {
        SerpentEagle se = new SerpentEagle();
        GoldenEagle ge = new GoldenEagle();

        Birds b = new Birds();

        b.permit(se);
        b.permit(ge);
    }
}
