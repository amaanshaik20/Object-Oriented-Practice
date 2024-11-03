package Interfaces;

// ()->{};
@FunctionalInterface
interface Display {
    // void disp();

    void disp1(int a);
}

// Lambda Expressions can only be implemented
// if an interface is functional interface
public class Lambda_Expressions {
    public static void main(String[] args) {
        Display d = (a) -> {
            System.out.println("HELLO");
        };
        d.disp1(2);
    }

}