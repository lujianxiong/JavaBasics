package 第7节_单例设计模式;
//单例模式 - 饿汉式
public class Singleton2 {
    private static Singleton2 instance ;
    private Singleton2(){}   //构造方法私有化

    public static Singleton2 getInstance(){
        if(instance ==null){
            instance = new Singleton2();   //第一次使用时实例化对象
        }
        return instance;
    }

    public void println(){
        System.out.println("Daxiong");
    }
}
