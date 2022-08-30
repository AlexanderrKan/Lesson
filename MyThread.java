package Thread;

public class MyThread implements Runnable {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            new Thread(new MyThread(), String.valueOf(i)).start();
        }
    }
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + " thread:\t" + i + " делится на 10 без остатка");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }

}