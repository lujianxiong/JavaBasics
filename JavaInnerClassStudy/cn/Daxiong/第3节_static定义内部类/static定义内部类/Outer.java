package Daxiong.第3节_static定义内部类.static定义内部类;
//定义一个static的内部类
public class Outer {
    private static final String MSG = "Daxiong";  //定义一个静态全局常量

    //这个Inner类是一个独立的类，如果要实例化Inner类对象，只需要根据“外部类.内部类”的结构实例化对象即可
    static class Inner{  //定义一个static的内部类
        public void print(){
            System.out.println(Outer.MSG);
        }
    }
}
