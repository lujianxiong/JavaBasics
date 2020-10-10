package 第4节_反射与工厂设计模式;
//范例：工厂设计模式（反射+泛型）
public class NetMessage implements IMessage{
    @Override
    public void send() {
        System.out.println("【网络消息发送】：Daxiong");
    }
}
