package 第9节_反射调用成员属性;

import java.lang.reflect.Field;

public class demo {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("第9节_反射调用成员属性.Person");
        {   //获取父类之中公共的成员信息
            Field fields[] = cls.getFields();
            for (Field fie:fields){
                System.out.println(fie);
            }
        }
        System.out.println("---------------------分割线--------------------");
        {   //获取子类中定义的成员
            Field fields[] = cls.getDeclaredFields();
            for (Field fie:fields){
                System.out.println(fie);
            }
        }

    }
}
