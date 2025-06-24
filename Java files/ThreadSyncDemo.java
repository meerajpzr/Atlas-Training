
class Counter {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}


class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Counter.increment();
        }
    }
}


public class ThreadSyncDemo {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Final count: " + Counter.getCount());
    }
}
