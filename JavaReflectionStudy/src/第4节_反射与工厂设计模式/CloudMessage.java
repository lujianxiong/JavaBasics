package 第4节_反射与工厂设计模式;
//范例：工厂设计模式（反射+泛型）
public class CloudMessage implements IMessage{
    @Override
    public void send() {
        System.out.println("【云消息】：Daxiong！");
    }
}
