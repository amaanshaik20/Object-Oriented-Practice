package Interfaces;

// Inner class method
// better security
interface Theta2 {
    void func();
}

class Delta {
    class Alpha3 implements Theta {
        @Override
        public void func() {
            System.out.println("This is a functional interface.");
        }
    }

    void permit() {
        Alpha3 a = new Alpha3();
        a.func();
    }
}

public class FunctionalInterface3 {
    public static void main(String[] args) {
        Delta d = new Delta();
        d.permit();
    }
}
