package 第19节_静态代理设计模式问题分析;

public class MessageReal implements IMessage{
    @Override
    public void send() {
        System.out.println("【发送消息】：Daxiong～");
    }
}
