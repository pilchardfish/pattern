package cn.edu.ncut.lab.pattern;

public class Singleton {
    private static Singleton instance=null;

    private Singleton (){

    }
    public static    Singleton getInstance(){
        if(instance==null){//DCL
                instance = new Singleton();
            }
        return  instance;
    }
}
