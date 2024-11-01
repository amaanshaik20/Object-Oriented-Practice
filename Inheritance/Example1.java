package Inheritance;

class Parent {
    private int a = 5;
    int b = 10;

    public Parent() {
        System.out.println("PARENT");
    }

    void smoke() {
        System.out.println("SMOKING...");
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("HELLO");
    }

    @Override
    void smoke() {
        System.out.println("CHILD TOO SMOKES...");
    }
}

class Child1 extends Parent {
    @Overrid
    void smoke() {
        System.out.println("Child1 dont smoke...");
    }
}

public class Example1 {
    public static void main(String[] args) {
        // Child1 c = new Child1();
        Child d = new Child();
        d.smoke();
    }
}
