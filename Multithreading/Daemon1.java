package Multithreading;

class Actor extends Thread {
    @Override
    public void run() {
        try {
            Waterman w = new Waterman();
            w.setName("WATERMAN");
            w.setDaemon(true);
            DialogueWriter d = new DialogueWriter();
            d.setName("DIALOGUE");
            d.setDaemon(true);

            w.start();
            d.start();
            System.out.println("Actor came on set");
            Thread.sleep(3000);
            System.out.println("Actor read the slip");
            Thread.sleep(3000);
            System.out.println("Actor is doing the act");
            Thread.sleep(3000);
            System.out.println("Actor left the set");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}

class Waterman extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                System.out.println("Waterman came on set and is ready for actor.");
                Thread.sleep(4000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

class DialogueWriter extends Thread {
    public void run() {
        for (;;) {
            try {
                System.out.println("Dialogue Writer came on set and is ready for actor.");
                Thread.sleep(4000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

public class Daemon1 {
    public static void main(String[] args) {
        Actor a = new Actor();
        a.setName(("ACTOR"));
        a.start();
    }
}
