package 第8节_反射调用方法;

import java.lang.reflect.Method;

public class demo3 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("第8节_反射调用方法.Person");
        String value = "是来自小熊星座的大雄丫";  //要设置的属性内容

        //1、任何情况下，如果要想保存类中的属性或者调用类中的方法都必须保证存在有实例化对象，既然不允许导入包，那就反射实例化
        Object obj = cls.getDeclaredConstructor().newInstance();  //调用无参构造实例化

        //2、如果要想进行方法的调用，那么一定要获取方法的名称
        String setMethodName = "setName";  //设置方法名称
        Method setmethod = cls.getDeclaredMethod(setMethodName,String.class);   //第一个是方法的名称，第二个是方法接受的参数类型,没有就null
        setmethod.invoke(obj,value); //Method类实例化对象-方法 调用invoke，第一个参数是操作类的实例化对象，第二个是传入的参数内容
        //上面这行等价于：Person对象.setName(value);
        String getMethodName = "getName";
        Method getMethod = cls.getDeclaredMethod(getMethodName);  //getter没有参数，就不写就好了。
        System.out.println(getMethod.invoke(obj));
        //上面这行等价于：System.out.println(Person类对象.getName())
    }
}
