package 第9节_反射调用成员属性;

import java.lang.reflect.Field;

public class demo4 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("第9节_反射调用成员属性.Person");
        Field namefield = cls.getDeclaredField("name");
        System.out.println(namefield.getType().getName());    //这个返回的是成员属性的完整类名称“包.类”
        System.out.println(namefield.getType().getSimpleName());   //获取类名称（我们日常所说的成员变量的类型）
    }
}
