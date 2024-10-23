package polymorphism;

class Bank {
    int rateOfInterest() {
        return 0;
    }
}

class Sbi extends Bank {
    int rateOfInterest() {
        return 9;
    }
}

class Hdfc extends Bank {
    int rateOfInterest() {
        return 7;
    }
}

class Axis extends Bank {
    int rateOfInterest() {
        return 8;
    }
}

class Interests {
    void getInterests(Bank b) {
        System.out.println(b.rateOfInterest());
    }
}

public class Program2 {
    public static void main(String[] args) {
        Axis a = new Axis();
        Sbi s = new Sbi();
        Hdfc h = new Hdfc();

        Interests i = new Interests();
        i.getInterests(a);
        i.getInterests(h);
        i.getInterests(s);
    }
}