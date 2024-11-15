package Multithreading;

class Bathroom {
    synchronized void bathroom() {
        try {

            System.out.println(Thread.currentThread().getName() + " HAS ENTERED BATHROOM");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " has Using Bathroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " has Exited Bathroom");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

class Boy extends Thread {
    private Bathroom bathroom;

    Boy(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.bathroom();
    }
}

class Girl extends Thread {
    private Bathroom bathroom;

    Girl(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.bathroom();
    }
}

class Others extends Thread {
    private Bathroom bathroom;

    Others(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.bathroom();
    }
}

public class Sync1 {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();

        Boy boy = new Boy(bathroom);
        boy.setName("BOY");
        Girl girl = new Girl(bathroom);
        girl.setName("GIRL");
        Others others = new Others(bathroom);
        others.setName("OTHERS");

        boy.start();
        girl.start();
        others.start();

    }
}
