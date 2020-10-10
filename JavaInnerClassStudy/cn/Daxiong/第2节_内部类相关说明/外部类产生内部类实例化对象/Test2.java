package Daxiong.第2节_内部类相关说明.外部类产生内部类实例化对象;

//通过外部类产生内部类实例化对象
public class Test2 {
    public static void main(String[] args) {
        Outer2.Inner in = new Outer2().new Inner();
        in.print();
    }
}
