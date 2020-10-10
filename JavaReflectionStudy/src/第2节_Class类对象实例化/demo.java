package 第2节_Class类对象实例化;
//Class实例化方式一：1、【Object类支持】
public class demo {
    public static void main(String[] args) {
        Person per = new Person();  //已经存在有指定类的实例化对象
        Class<? extends Person> cla= per.getClass();   //通过Object类的getClass方法
        System.out.println(cla);   //这个打印会前面多一个class
        System.out.println(cla.getName());  //获取的是类的完整名称
    }
}
