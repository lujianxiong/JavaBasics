package 第24节_Annotation整合工厂设计模式;

public class NetMessageImpl implements IMessage{
    @Override
    public void send(String msg) {
        System.out.println("【网络消息发送】："+msg);
    }
}
