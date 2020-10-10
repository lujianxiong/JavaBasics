package Daxiong.第3节_static定义内部类.static定义内部类;
//实例化static定义的内部类
public class Test {
    public static void main(String[] args) {
         Outer.Inner in = new Outer.Inner();   //类名称直接跟"."再跟类名称，没有进行外部类实例化的，就是static定义的内部类
         in.print();
    }
}
