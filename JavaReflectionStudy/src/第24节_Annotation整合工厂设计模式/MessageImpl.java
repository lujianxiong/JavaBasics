package 第24节_Annotation整合工厂设计模式;

public class MessageImpl implements IMessage{
    @Override
    public void send(String msg) {
        System.out.println("【消息发送】"+msg);
    }
}
