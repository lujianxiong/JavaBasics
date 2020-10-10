package Daxiong.第5节_匿名内部类.观察一个程序;

public class Test {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();
        msg.send("Daxiong");
    }
}
