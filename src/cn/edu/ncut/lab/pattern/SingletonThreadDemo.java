package cn.edu.ncut.lab.pattern;

import java.util.concurrent.CountDownLatch;

public class SingletonThreadDemo{
    public static void main(String[] args) {
        int num=5500;
        long start=System.currentTimeMillis();
        CountDownLatch countDownLatch=new CountDownLatch(num);
        CountDownLatch time=new CountDownLatch(num);
        for (int i = 0; i <num ; i++) {
            new Thread(()->{
                try {
                    countDownLatch.await();
                    //发令枪
                    Object o=Singleton.getInstance();
                  //  System.out.println(o);
                    // 无synchronized的程序耗时<内部类<synchronized
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time.countDown();
            }).start();
            countDownLatch.countDown();
        }
        try {
            time.await();
            System.out.println(System.currentTimeMillis()-start);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
