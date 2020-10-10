package Daxiong.第5节_匿名内部类.接口中直接定义匿名内部类;

public class Test {
    public static void main(String[] args) {
        IMessage.getInstance().send("你真棒！");
        //IMessage.getInstance()就是一个IMessage对象，然后.send()就可以直接进行调用匿名内部类覆写的方法。

    }
}
