package 第11_12_13_14节_综合案例一_反射与简单Java类;

import java.lang.reflect.Field;

public class demoTest {
    public static void main(String[] args) throws Exception{
        //下面这两种实例化方式都ok的
        //Object obj = Class.forName("第11_12_13_14节_综合案例一_反射与简单Java类.Emp").newInstance();
        Object obj = Emp.class.getDeclaredConstructor().newInstance();
        Field field = obj.getClass().getDeclaredField("ename");
        System.out.println(field);  //成员属性的超级完整名称  【private java.lang.String 第11_12_13_14节_综合案例一_反射与简单Java类.Emp.ename】
        System.out.println(field.getType());  //成员属性的类型（含class）  【class java.lang.String】
        System.out.println(field.getType().getName());  //成员属性的类型（去class）  【java.lang.String】
    }
}
