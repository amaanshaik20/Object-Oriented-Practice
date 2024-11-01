package Interfaces;

// inner class method 1
// good security
interface Theta1 {
    void func();
}

public class FunctionalInterface2 {
    public static void main(String[] args) {
        class Alpha2 implements Theta {
            @Override
            public void func() {
                System.out.println("This is a functional interface.");
            }
        }
        Alpha2 a = new Alpha2();
        a.func();
    }
}
