package Daxiong.第7节_方法引用.引用实例化对象中的方法;

public class Test {
    public static void main(String[] args) {
        IFunction<String> fun = "daxiong" ::toUpperCase;
        //引用某个实例对象的方法：：类名 方法名 = 实例化对象 :: 普通方法 ，在这里，类名是IFunction<P,R>
        System.out.println(fun.upper());
    }
}
