package Multithreading;

class Captain extends Thread {
    @Override
    public void run() {
        try {

            BattingCoach bac = new BattingCoach();
            bac.setName("BAC");
            bac.setDaemon(true);

            BowlingCoach boc = new BowlingCoach();
            boc.setName("BOC");
            boc.setDaemon(true);

            bac.start();
            boc.start();
            System.out.println("Captain entered the Ground.");
            Thread.sleep(3000);
            System.out.println("Captain will do warmup.");
            Thread.sleep(3000);
            System.out.println("Captain practising batting.");
            Thread.sleep(3000);
            System.out.println("Captain practising Bowling.");
            Thread.sleep(3000);
            System.out.println("Captain left the Ground.");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.setStackTrace(getStackTrace());
        }
    }
}

class BattingCoach extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                System.out.println("Batting coach entered the ground.");
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class BowlingCoach extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                System.out.println("Bowling coach entered the ground.");
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Daemon {
    public static void main(String[] args) {
        Captain c = new Captain();
        c.setName("CAPTAIN");
        c.start();
    }
}
