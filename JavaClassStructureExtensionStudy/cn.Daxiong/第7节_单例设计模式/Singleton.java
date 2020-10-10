package 第7节_单例设计模式;
//单例模式 - 饿汉式
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();   //final定义后,就无法重复实例化
    private Singleton(){}   //构造方法私有化

    public static Singleton getInstance(){
        return INSTANCE;
    }

    public void println(){
        System.out.println("Daxiong");
    }
}
