package cn.edu.ncut.lab.pattern;

import java.util.concurrent.TimeUnit;

public class VolatileDemo {
   public static volatile Boolean stop=true;
    public static void main(String[] args)  {
        new Thread(()->{
            while(stop){
                ;
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop=false;

    }

}
