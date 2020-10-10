package 第2节_Class类对象实例化;
//Class实例化方式三：3、【Class类支持】

public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cla = Class.forName("第2节_Class类对象实例化.Person");
        System.out.println(cla.getName());
    }
}
