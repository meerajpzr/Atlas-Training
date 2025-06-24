public class InterruptExample {
    public static void main(String[] args) {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start(); // Start the thread

        try {
            Thread.sleep(500); // Let the thread run for a bit
            thread.interrupt(); // Interrupt the thread after 500ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
