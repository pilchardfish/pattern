package cn.edu.ncut.lab.pattern;

public class SingletonDemo {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            Singleton singleton=Singleton.getInstance();
            System.out.println(singleton);

        }

    }
}
