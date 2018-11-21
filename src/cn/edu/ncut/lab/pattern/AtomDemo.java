package cn.edu.ncut.lab.pattern;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
//volatile 关键字只能解决可见性和顺序性，不能解决原子性，所以算法总小于等于100
public class AtomDemo {
    public static volatile Integer inc=0;

    public static void main(String[] args)  {
        int num=100;
        CountDownLatch latch=new CountDownLatch(num);
        for (int i = 0; i <100 ; i++) {
            new Thread(()->
            {
                incfunc();
                latch.countDown();
            }).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(inc);

    }
    public static  void   incfunc(){
        inc++;

    }
}
