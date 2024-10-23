package Interfaces;
// interfaces do not contain concrete methods

interface Calculator1 {
    abstract void add();

    abstract void sub();
}

class MyCalculator implements Calculator1 {
    @Override
    public void add() {
        System.out.println("ADD");
    }

    @Override
    public void sub() {
        System.out.println("Sub");
    }
}

public class Program1 {
    public static void main(String[] args) {

        MyCalculator mc = new MyCalculator();
        mc.add();
        mc.sub();
    }
}
