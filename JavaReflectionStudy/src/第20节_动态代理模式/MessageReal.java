package 第20节_动态代理模式;
//核心业务类
public class MessageReal implements IMessage {
    @Override
    public void send() {
        System.out.println("【发送消息】：Daxiong～");
    }
}
