package 第7节_反射调用构造方法;

import java.lang.reflect.Constructor;

public class demo1 {
    public static void main(String[] args) {
        Class<?> cls = Person.class;    //获取指定类的Class对象
        Constructor<?>[] constructors = cls.getDeclaredConstructors();//获取全部构造
        // 这里如果使用getConstructors() 获取的结果是一样的，看不出有什么区别
        for (Constructor<?> temp : constructors){
            System.out.println(temp);
        }
    }
}
