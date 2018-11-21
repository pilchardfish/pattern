package cn.edu.ncut.lab.concurrent;
//100个人同时存钱
public class MoneyAdd {
    public static volatile int money=0;
    public static void   inc(){
        money++;
       // System.out.println(money);
    }
}
