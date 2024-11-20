package Multithreading;

class Queue {
    private int data;
    boolean dataIsNull = false;

    synchronized public void setData(int data) {
        if (!dataIsNull) {
            this.data = data;
            System.out.println("Producer produced the value: " + data);
            dataIsNull = true;
            notify();
        } else {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void getData() {
        if (dataIsNull) {
            System.out.println("Consumer consumed the value: " + data);
            dataIsNull = false;
            notify();
        } else {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {
    Queue q;

    public Producer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        int i = 1;
        for (;;) {
            q.setData(i++);
        }

    }
}

class Consumer extends Thread {
    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (;;) {
            q.getData();
        }
    }
}

public class Producer_Consumer {
    public static void main(String[] args) {
        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.setName("PRODUCER");
        c.setName("CONSUMER");

        p.start();
        c.start();
    }
}
