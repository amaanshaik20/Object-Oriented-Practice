package Interfaces;

// simple class method
// less security
interface Theta {
    void func();
}

class Alpha1 implements Theta {
    @Override
    public void func() {
        System.out.println("This is a functional interface.");
    }
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Alpha1 a = new Alpha1();
        a.func();
    }
}
