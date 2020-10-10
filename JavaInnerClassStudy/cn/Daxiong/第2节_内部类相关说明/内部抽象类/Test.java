package Daxiong.第2节_内部类相关说明.内部抽象类;
//观察内部抽象类
public class Test {
    public static void main(String[] args) {
        IChannel channel = new ChannelImpl();
        channel.send();
    }
}
