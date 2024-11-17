package Multithreading;

class Bathroom1 {
    void bathroom() {
        try {
            System.out.println(Thread.currentThread().getName() + " Is Executing stmt1");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Is Executing stmt2");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Is Executing stmt3");
            Thread.sleep(3000);

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Is Executing stmt4");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " Is Executing stmt5");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " Is Executing stmt6");

            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

class Boy1 extends Thread {
    private Bathroom1 bathroom;

    Boy1(Bathroom1 bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.bathroom();
    }
}

class Girl1 extends Thread {
    private Bathroom1 bathroom;

    Girl1(Bathroom1 bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.bathroom();
    }
}

class Others1 extends Thread {
    private Bathroom1 bathroom;

    Others1(Bathroom1 bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.bathroom();
    }
}

public class Sync3 {
    public static void main(String[] args) {
        Bathroom1 bathroom = new Bathroom1();

        Boy1 boy = new Boy1(bathroom);
        boy.setName("BOY");
        Girl1 girl = new Girl1(bathroom);
        girl.setName("GIRL");
        Others1 others = new Others1(bathroom);
        others.setName("OTHERS");

        boy.start();
        girl.start();
        others.start();

    }
}
