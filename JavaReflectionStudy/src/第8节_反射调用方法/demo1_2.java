package 第8节_反射调用方法;
//范例：获取全部方法
import java.lang.reflect.Method;

public class demo1_2 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Person.class;
        Method method = cls.getDeclaredMethod("connect");  //获取指定方法【没有参数就不写参数类型】
        System.out.println(method);
    }
}
