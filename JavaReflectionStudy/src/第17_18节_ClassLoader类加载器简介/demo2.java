package 第17_18节_ClassLoader类加载器简介;
//第十八节：   【需要JDK1.9的支持】
import java.lang.reflect.Method;

public class demo2 {
    public static void main(String[] args) throws Exception {
        DaxiongClassLoader classLoader = new DaxiongClassLoader();  //实例话自定义类加载器
        Class<?> cls = classLoader.loadData("第17_18节_ClassLoader类加载器简介.Message");   //进行类的加载！！！！！！！！！！
        //System.out.println(cls);
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getDeclaredMethod("send"); //找到send方法，没有参数
        method.invoke(obj);  //调用Message类方法输出
        //System.out.println(cls.getClassLoader());
        //System.out.println(cls.getClassLoader().getParent());
        //System.out.println(cls.getClassLoader().getParent().getParent());

    }
}
