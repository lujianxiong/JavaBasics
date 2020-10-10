package 第10节_Unsafe工具类;
//范例：使用Unsafe类绕过实例化对象的管理
import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class demo1 {
    public static void main(String[] args) throws Exception{
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);  //解除封装处理
        Unsafe us = (Unsafe) field.get(null);  //static属性不需要传递实例化对象
        //利用Unsafe类绕过了JVM的管理机制，可以在没有实例化对象的情况下获取一个Singleton类的对象
        Singleton1 instance = (Singleton1) us.allocateInstance(Singleton1.class);
        instance.print();
    }
}
