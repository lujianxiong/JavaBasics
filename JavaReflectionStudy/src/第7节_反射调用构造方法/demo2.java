package 第7节_反射调用构造方法;

import java.lang.reflect.Constructor;

public class demo2 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Person.class;    //获取指定类的Class对象
        Constructor<?> constructor = cls.getConstructor(String.class,int.class);   //获取构造时指明类型
        Object obj = constructor.newInstance("大红",88);  //通过反射实例化对象
        System.out.println(obj);

    }
}
