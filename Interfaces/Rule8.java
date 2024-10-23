package Interfaces;

//an interface can extend another interface 

// and hence multiple inheritance can be 
// indirectly achieved through interfaces.

interface Calculator8 {
    void add();
}

interface Calculator9 {
    void mul();
}

interface Calculate12 extends Calculator8, Calculator9 {

}

class Calculate9 implements Calculate12 {
    @Override
    public void add() {
        System.out.println("ADDING");

    }

    @Override
    public void mul() {
        System.out.println("MULTIPLYING");

    }
}

public class Rule8 {
    public static void main(String[] args) {

        Calculate9 c = new Calculate9();
        c.add();
        c.mul();
    }

}
