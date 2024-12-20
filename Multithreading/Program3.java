package Multithreading;

public class Program3 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is: " + t);
        System.out.println("The name of current thread is: " + t.getName());
        System.out.println("The priority of current thread is: " + t.getPriority());
        System.out.println("current thread group is: " + t.getThreadGroup());
        System.out.println();
        t.setName("Amaan");
        t.setPriority(2);
        System.out.println("The name of current thread is: " + t.getName());
        System.out.println("The priority of current thread is: " + t.getPriority());
        Thread.currentThread().setName("PrimaryThread");
        System.out.println();
        System.out.println("The name of current thread is: " + t.getName());
        // we cannot set or chage threadgroup.

    }
}
