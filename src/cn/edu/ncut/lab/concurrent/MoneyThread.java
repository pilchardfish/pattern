package cn.edu.ncut.lab.concurrent;

import java.util.concurrent.CountDownLatch;

public class MoneyThread {
    public static void main(String[] args) {
        int num = 100;
        CountDownLatch latch = new CountDownLatch(num);
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
            {
                synchronized (MoneyAdd.class) {
                    MoneyAdd.inc();
                    latch.countDown();
                }
            }).start();

        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(MoneyAdd.money);

    }
}
