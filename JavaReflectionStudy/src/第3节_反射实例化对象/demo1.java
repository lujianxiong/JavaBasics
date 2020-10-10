package 第3节_反射实例化对象;
//范例：通过newInstance()方法实例化Person类对象
public class demo1 {
    public static void main(String[] args) throws Exception{
        Class<?> cla = Class.forName("第3节_反射实例化对象.Person");
        Object obj = cla.newInstance();    //实例化对象（调用构造），JDK1.9之后被废除了
        System.out.println(obj);    //输出对象（调用toString）
    }
}
//我们可以发现尽管我们这个程序没有new关键字，我们依然可以实例化对象，调用构造
//关键就在于：cla.newInstance()