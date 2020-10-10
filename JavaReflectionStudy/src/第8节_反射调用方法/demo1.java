package 第8节_反射调用方法;
//范例：获取全部方法
import java.lang.reflect.Method;

public class demo1 {
    public static void main(String[] args) {
        Class<?> cls = Person.class;
        {   //获取全部方法（包括本类和父类、祖宗的方法）
            Method methods[] = cls.getMethods();  //获取全部方法
            for (Method met: methods){
                System.out.println(met);
            }
        }
        System.out.println("------------------我是分割线-----------------");
        {   //获取本类方法
            Method methods[] = cls.getDeclaredMethods();  //获取全部方法
            for (Method met: methods){
                System.out.println(met);
            }
        }
    }
}
