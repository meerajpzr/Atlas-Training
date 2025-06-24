class InterruptibleThread extends Thread {
    public void run() {
        try {
            // Keep running until the thread is interrupted
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running");
                Thread.sleep(100); // Sleep to simulate work
            }
        } catch (InterruptedException e) {
            // This block executes if thread is interrupted while sleeping
            System.out.println("Thread was interrupted");
        }
    }
}
