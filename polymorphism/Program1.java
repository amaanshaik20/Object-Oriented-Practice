package polymorphism;

class Plane {
    void fly() {
        System.out.println("PLane is flying..");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo plane is flying..");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger plane is flying..");
    }
}

class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter plane is flying..");
    }
}

class Airport {
    public void launch(Plane p) {
        p.fly();
    }
}

public class Program1 {
    public static void main(String[] args) {

        // tight coupling
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        // cp.fly();
        // pp.fly();
        // fp.fly();

        // loose coupling
        // Plane p;
        // p = cp;
        // p.fly();

        // p=pp;
        // p.fly();

        // p=fp;
        // p.fly();

        // another method of loose coupling
        Airport a = new Airport();
        a.launch(cp);
        a.launch(fp);
        a.launch(pp);
    }
}
