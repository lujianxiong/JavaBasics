package Daxiong.第1节_内部类基本概念.不使用内部类;
//观察两个单独的类访问私有属性
public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();    //实例化外部类对象
        outer.fun();     //调用外部类中的方法
    }
}
