package polymorphism;

class Demo {
    int add(int a) {
        return a + a;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(double a, int b) {
        return (int) a + b;
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.add(3));
        System.out.println(d.add(3, 5));
        System.out.println(d.add(3, 5, 8));
        System.out.println(d.add(2.8, 4));

    }
}
