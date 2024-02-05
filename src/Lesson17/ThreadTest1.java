package Lesson17;

public class ThreadTest1 {
    static int[] a = {1, 5, 9, 73, 80, -50};
    static int max = a[0];

    public static void main(String[] args) {
        Thread maxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < a.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (max < a[i]){
                        max = a[i];
                    }
                }
            }
        });
        maxThread.start();
//        try {
//            maxThread.join(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        while (maxThread.isAlive()){

        }

        System.out.println(max);
    }
}
