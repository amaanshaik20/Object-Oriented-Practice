package Multithreading;

class Atm {
    synchronized void use() {
        try {
            System.out.println(Thread.currentThread().getName() + " HAS ENTERED ATM");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " has Using ATM");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " has Exited ATM");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

class Person1 extends Thread {
    private Atm atm;

    Person1(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        atm.use();
    }
}

class Person2 extends Thread {
    private Atm atm;

    Person2(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        atm.use();
    }
}

class Person3 extends Thread {
    private Atm atm;

    Person3(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        atm.use();
    }
}

public class Sync2 {
    public static void main(String[] args) {
        Atm atm = new Atm();

        Person1 person1 = new Person1(atm);
        person1.setName("PERSON1");
        Person2 person2 = new Person2(atm);
        person2.setName("PERSON2");
        Person3 person3 = new Person3(atm);
        person3.setName("PERSON3");

        person1.start();

        person2.start();

        person3.start();

    }
}
