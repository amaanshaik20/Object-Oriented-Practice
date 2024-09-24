class Demo {
    static int a, b;

    static void fun1() {
        System.out.println("Inside static method");
    }

    static {
        System.out.println("Inside Static Block");

    }

    int x, y;
    {
        System.out.println("Inside Instance Block");
    }

    void fun2() {
        System.out.println("Inside instance method");
        System.out.println();
    }

    Demo() {
        System.out.println("Inside Constructor");
    }

}

public class Example1 {
    public static void main(String[] args) {
        Demo.fun1();
        Demo d = new Demo();
        d.fun2();

    }
}
