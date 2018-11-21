package cn.edu.ncut.lab.pattern;

public class SingletonDemoTwo {
    //最标准单例模式写法

    private SingletonDemoTwo(){

    }
    public static SingletonDemoTwo getInstance(){
        return SingletonHolder.instance;
    }
    private static class SingletonHolder{
        public final static SingletonDemoTwo instance=new SingletonDemoTwo();
    }

}
