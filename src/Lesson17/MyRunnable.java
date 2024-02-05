package Lesson17;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }



    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
