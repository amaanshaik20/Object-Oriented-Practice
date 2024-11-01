package Interfaces;

// anonymous class 
// Best Security
// implements Polymorphism too
interface Theta3 {
    void func();
}

public class FunctionalInterface4 {
    public static void main(String[] args) {
        // Parent reference child Object
        Theta3 t = new Theta3() {
            @Override
            public void func() {
                System.out.println("This is a functional interface.");
            }
        };
        t.func();
    }
}
