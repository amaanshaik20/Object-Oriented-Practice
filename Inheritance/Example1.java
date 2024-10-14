package Inheritance;

class Parent {
    int a = 5;
    int b = 10;

    void smoke() {
        System.out.println("SMOKING...");
    }
}

class Child extends Parent {
    @Override
    void smoke() {
        System.out.println("CHILD TOO SMOKES...");
    }
}

class Child1 extends Parent {
    @Override
    void smoke() {
        System.out.println("Child1 dont smoke...");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        Child d = new Child();
        Parent p = new Parent();
        c.smoke();
        d.smoke();

        p.smoke();
    }
}
