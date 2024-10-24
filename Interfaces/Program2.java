package Interfaces;

interface Demox {
    void add();

    default void sub() {
        System.out.println("Subtracting...");
    }

    // when u give a method in interface as a default, you can writhe a method body
    // also...
    // By default the default_method is public and hence when we override this
    // method u must give access modifier as public only...
    // to provide method body in interface, you van also use static method.
    // this method will not get inherited to child class. and hence to access this
    // method we use class name.

    // this methods got implemented in JDK 1.8 onwards to provide more features into
    // the java.
    static void div() {
        System.out.println("Dividing");
    }

}

class Main implements Demox {
    @Override
    public void add() {
        System.out.println("ADDING");
    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        Demox.super.sub();
    }

}

public class Program2 {
    public static void main(String[] args) {
        Main m = new Main();

        m.sub();
        Demox.div();
    }
}
