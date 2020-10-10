package 第2节_Class类对象实例化;
//Class实例化方式二：2、【JVM直接支持】
//这种方式与方式而相比，不需要实例化类对象
public class demo2 {
    public static void main(String[] args) {
        Class<? extends Person> cla= Person.class;   //通过Object类的getClass方法
        System.out.println(cla.getName());
    }
}
