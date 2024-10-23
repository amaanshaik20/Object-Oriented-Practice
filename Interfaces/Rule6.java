package Interfaces;

//  A class can implement multiple inheritance by using interface
//  this is because there is diamond problem in it.
// as interface do not has parent 

interface Canteen1 {
    void menu();

    void accessories();
}

// Rule 7
// one interface cannot implement another interface
// one interface can extend another interface
interface Canteen2 {
    void chefs();

    void customers();
}

class Hotel implements Canteen1, Canteen2 {
    @Override
    public void menu() {
        System.out.println("MENU");

    }

    @Override
    public void accessories() {
        System.out.println("ACCESSORIES");

    }

    @Override
    public void chefs() {
        System.out.println("CHEFS");

    }

    @Override
    public void customers() {
        System.out.println("CUSTOMERS");

    }
}

public class Rule6 {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.accessories();
        h.menu();
        h.chefs();
        h.customers();
    }
}
