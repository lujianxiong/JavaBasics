package Daxiong.第7节_方法引用.引用构造方法;

public class Test {
    public static void main(String[] args) {
        IFunction<Person> fun = Person :: new;  //返回的是Person类型，引用的是Person类中的new方法
        System.out.println(fun.create("张三",20));
    }
}
