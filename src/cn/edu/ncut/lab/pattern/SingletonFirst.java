package cn.edu.ncut.lab.pattern;

//饿汉模式
public class SingletonFirst {
    //先静态后动态
    //先祖宗后孙子
    //先属性后方法
    //先上后下
    private static final SingletonFirst singleton=new SingletonFirst();
    private SingletonFirst()
    {
        System.out.println("Hello!");
    }
    public static SingletonFirst getInstance(){
        return singleton;
    };
}
