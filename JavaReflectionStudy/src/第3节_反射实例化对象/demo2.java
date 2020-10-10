package 第3节_反射实例化对象;
//getDeclaredConstructors().newInstance()  【据说是JDK1.9之后提供的新方法，但好像可以用】
public class demo2 {
    public static void main(String[] args) throws Exception{
        Class<?> cla = Class.forName("第3节_反射实例化对象.Person");
        Object obj = cla.getDeclaredConstructor().newInstance();
        System.out.println(obj);
    }
}
