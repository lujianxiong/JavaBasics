package 第9节_反射调用成员属性;
//范例：解除封装，将私有化成员属性解封
import java.lang.reflect.Field;

public class demo3 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("第9节_反射调用成员属性.Person");
        Object obj = cls.getConstructor().newInstance();  //实例化对象（分配成员空间）
        Field nameField = cls.getDeclaredField("name");  //获取成员对象
        nameField.setAccessible(true);  //解除封装
        nameField.set(obj,"Daxiong");  //等价于：Person.name = "Daxiong"
        System.out.println(nameField.get(obj));  //等价于：Person对象.name

    }
}
