package Lesson17;

public class VolatileTest extends Thread {
    public volatile boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {

        }
        System.out.println("Ended");
    }

    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
        test.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        test.isRunning = false;
        System.out.println("False");
    }
}
