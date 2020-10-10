package 第10节_Unsafe工具类;
//传统单例模式调用
public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();
    private Singleton2(){
        System.out.println("*****************Singleton类构造***************");
    }
    public static Singleton2 getInstance(){
        return INSTANCE;
    }

    public void print(){
        System.out.println("Daxiong");
    }
}
