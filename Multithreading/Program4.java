package Multithreading;

class Demo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

class Demo11 extends Thread {
    @Override
    public void run() {
        try {

            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is executing...");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}

public class Program4 {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName() + " started");
        Demo d = new Demo();
        Demo11 d1 = new Demo11();
        d.start();
        d.join();
        d1.start();
        d1.join();
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
