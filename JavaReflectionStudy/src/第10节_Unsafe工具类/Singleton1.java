package 第10节_Unsafe工具类;
//范例：使用Unsafe类绕过实例化对象的管理
public class Singleton1 {
    private Singleton1(){
        System.out.println("*****************Singleton类构造***************");
    }
    public void print(){
        System.out.println("Daxiong");
    }
}
