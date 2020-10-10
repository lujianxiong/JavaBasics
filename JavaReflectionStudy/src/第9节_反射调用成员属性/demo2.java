package 第9节_反射调用成员属性;
//范例：直接调用Person类中的name私有成员 【】
import java.lang.reflect.Field;

import static java.lang.Class.forName;

public class demo2 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = forName("第9节_反射调用成员属性.Person");
        Object obj = cls.getConstructor().newInstance();  //实例化对象（分配成员空间）
        Field nameField = cls.getDeclaredField("name");  //获取成员对象
        nameField.set(obj,"Daxiong");  //等价于：Person.name = "Daxiong"
        System.out.println(nameField.get(obj));  //等价于：Person对象.name

        //你会发现get方法访问不了Person类中的私有属性

    }
}
